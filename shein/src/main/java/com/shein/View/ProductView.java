package com.shein.View;

import java.util.Scanner;

import com.shein.Models.Produto;

public class ProductView {
    private Scanner scanner;
    
    public ProductView() throws Exception {
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

        scanner.nextLine();

        return new Produto(url,name,sku,price,size,brand,description,images);
    }

    public Produto ConsultarProduto() {
        Produto produto = new Produto();
        System.out.println("Name: ");
        String skuInput = scanner.nextLine();
        produto.setSku(skuInput);
        return produto;
    }

    public Produto AtualizarEstoque() {
        Produto produto = new Produto();
        System.out.println("sku: ");
        String skuInput = scanner.nextLine();
        produto.setSku(skuInput);
        System.out.println("Digite a nova quantidade em estoque:");
        String size = scanner.nextLine();
        produto.setSize(size);
        produto.getUrl();

        //colocar todos os valores que forem passados
        return produto;
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