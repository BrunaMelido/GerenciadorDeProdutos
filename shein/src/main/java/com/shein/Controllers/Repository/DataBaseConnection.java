package com.shein.Controllers.Repository;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Properties;

public class DataBaseConnection {

    final   String     _UrlDataBase = "jdbc:postgresql://localhost/test";
    final   String     _username = "Teste";
    final   String     _password = "teste";
    private Connection _connection;
    private boolean    _isConnect;
    private Properties _props = new Properties();
    

    public DataBaseConnection() throws Exception{
        _props.setProperty(_username, "fred");
        _props.setProperty(_password, "secret");
        _props.setProperty("ssl", "false");
        _connection = getConnection();
    }

    public Connection getConnection() throws Exception {
        if (!_isConnect) {
            Connect();
        }
        return _connection;
    }
    private void Connect() throws Exception{
        try {
            _connection = DriverManager.getConnection(_UrlDataBase, _props);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}