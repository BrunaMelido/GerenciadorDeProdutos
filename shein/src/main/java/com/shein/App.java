package com.shein;

import java.util.Scanner;

import com.shein.Models.Produto;
import com.shein.Repository.ProdutoRepository;
import com.shein.View.ProdutoView;

public class App {
    public static void App() {
        ProdutoView gerenciador = new ProdutoView();
        ProdutoRepository integracao = new ProdutoRepository();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        Produto produto = null;

        do {
            System.out.println("\n1. Cadastrar Produto");
            System.out.println("2. Consultar Produto");
            System.out.println("3. Atualizar Estoque");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    produto = gerenciador.cadastrarProduto();
                    integracao.salvarNoBanco(produto);
                    break;
                case 2:
                    if (produto != null) {
                        gerenciador.consultarProduto(produto);
                    } else {
                        System.out.println("Nenhum produto cadastrado.");
                    }
                    break;
                case 3:
                    if (produto != null) {
                        gerenciador.atualizarEstoque(produto);
                    } else {
                        System.out.println("Nenhum produto cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}