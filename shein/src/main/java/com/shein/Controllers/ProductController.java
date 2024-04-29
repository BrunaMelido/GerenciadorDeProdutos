package com.shein.Controllers;

import java.util.Scanner;

import com.shein.View.ProductView;

public class ProductController {
    ProductView _produtoView = new ProductView();

    Scanner scanner = new Scanner(System.in);

    public void Iniciar() {
        
        int opcao;

        do {
            opcao = ProductView.MenuEscolha(null);

            switch (opcao) {
                case 1:
                _produtoView.CadastrarProduto();
                    break;
                case 2:
                _produtoView.ConsultarProduto(null);
                    //ConsultaProduto();
                    break;
                case 3:
                _produtoView.AtualizarEstoque(null);
                    //atualizaEstoque();
                    break;
                case 4:
                    //EscolhaSenha();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public void ControllerCadastroProduto(){
       // _produtoView.CadastrarProduto();
    }
    public void ControllerConsultaProduto(){
        //_produtoView.ConsultarProduto(null);
    }
    public void ControllerAtualizaEstoque(){
        //_produtoView.AtualizarEstoque(null);
        }
    }