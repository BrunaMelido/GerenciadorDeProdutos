package com.shein.View;

import java.util.Scanner;

import com.shein.Models.Produto;

public class ProdutoView {
    private Scanner scanner;
    
    public ProdutoView() {
        this.scanner = new Scanner(System.in);
    }

    public Produto CadastrarProduto() {
        System.out.println("#### Cadastro do Produto #### \n");
        System.out.println("url: ");
        String url = scanner.nextLine();

        System.out.println("name: ");
        String name = scanner.nextLine();

        System.out.println("sku: ");
        String sku = scanner.nextLine();

        System.out.println("prince");
        String price = scanner.nextLine();

        System.out.println("size:");
        String size = scanner.nextLine();

        System.out.println("brand");
        String brand = scanner.nextLine();

        System.out.println("description");
        String description = scanner.nextLine();

        System.out.println("images");
        String images = scanner.nextLine();

        scanner.nextLine(); // Limpa o buffer

        return new Produto(url,name,sku,price,size,brand,description,images);
    }

    public void ConsultarProduto(Produto produto) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Nome: " + produto.getName());
        // System.out.println("Preço: " + produto.getPrecoProduto());
        // System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoqueProd());
    }

    public void AtualizarEstoque(Produto produto) {
        System.out.println("Digite a nova quantidade em estoque:");
        String size = scanner.nextLine();
        produto.setSize(size);
        scanner.nextLine(); // Limpa o buffer
    }

    public static int MenuEscolha(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. Cadastrar Produto");
        System.out.println("2. Consultar Produto");
        System.out.println("3. Atualizar Estoque");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção:");
        int opcao;
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        return opcao;
    }
}