package com.shein.Controllers;

import com.shein.Controllers.Repository.DataBaseRepository;
import com.shein.Models.BaseReturn;
import com.shein.Models.Produto;
import com.shein.View.ProductView;

public class ProductController {
    private ProductView _produtoView;
    private DataBaseRepository _repository;
    private int _eperation;
    private Produto _produto;

    public ProductController() throws Exception {
        _produtoView = new ProductView();
        _repository = new DataBaseRepository();
    }

    public void Iniciar() {
        while (_eperation != 0){
            _eperation = ProductView.MenuEscolha(null);
            if(_eperation == 1) _produto = _produtoView.CadastrarProduto();
            if(_eperation == 2) _produto = _produtoView.ConsultarProduto();
            if(_eperation == 3) _produto = _produtoView.AtualizarEstoque();
            if(_eperation == 0)  System.out.println("Saindo...");
            else System.out.println("Opção inválida.");
        }
    }

    public BaseReturn ControllerCadastroProduto() throws Exception {
       BaseReturn response = _repository.CadastrarProduto(_produto);
       return response;
    }
    public void ControllerConsultaProduto(){
        //_produtoView.ConsultarProduto(null);
    }
    public void ControllerAtualizaEstoque(){
        //_produtoView.AtualizarEstoque(null);
        }
    }