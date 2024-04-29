package com.shein.Controllers.Repository;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import com.shein.Models.BaseReturn;
import com.shein.Models.Produto;

public class DataBaseRepository {
    private DataBaseConnection _connectionClass;
    private Connection _connection;

    public DataBaseRepository() throws Exception {
        try {
            _connectionClass = new DataBaseConnection();
            _connection = _connectionClass.getConnection();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }
    public BaseReturn CadastrarProduto(Produto product) throws Exception{

        try {
            CallableStatement call = _connection.prepareCall("{? = call sp_registerProduct(?,?,?,?,?,?,?,?)}");
            call.registerOutParameter(1, Types.VARCHAR);
            call.setString(2, product.getUrl());
            call.setString(3, product.getName());
            call.setString(4, product.getSku());
            call.setString(5, product.getPrice());
            call.setString(6, product.getSize());
            call.setString(7, product.getBrand());
            call.setString(8, product.getDescription());
            call.setString(9, product.getImages());
            call.execute();
            String response = call.getString(1);
            call.close();

            return new BaseReturn().Success(response);

        } catch (Exception e) {
            return new BaseReturn().Error(e.getMessage());
        }
        
    }
}
