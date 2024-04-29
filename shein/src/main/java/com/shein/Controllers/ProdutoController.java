package com.shein.Controllers;

import java.util.Scanner;

import com.shein.View.ProdutoView;

public class ProdutoController {
    ProdutoView _produtoView = new ProdutoView();

    Scanner scanner = new Scanner(System.in);

    public void Iniciar() {
        ProdutoView _produtoView = new ProdutoView();
        
        int opcao;

        do {
            opcao = _produtoView.MenuEscolha(null);

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