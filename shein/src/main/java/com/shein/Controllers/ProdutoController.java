package com.shein.Controllers;

import java.util.Scanner;

import com.shein.Models.Produto;

public class ProdutoController {
    private Scanner scanner;

    public ProdutoController() {
        this.scanner = new Scanner(System.in);
    }
//url;name;sku;price;size;brand;description;images
    public Produto cadastrarProduto() {
        //url;name;sku;price;size;brand;description;images
        System.out.println("URL: ");
        String url = scanner.nextLine();

        System.out.println("NAME: ");
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

    public void consultarProduto(Produto produto) {
        System.out.println("Nome: " + produto.getName());
        //System.out.println("Preço: " + produto.getPrecoProduto());
       // System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoqueProd());
    }

    public void atualizarEstoque(Produto produto) {
        System.out.println("Digite a nova quantidade em estoque:");
        int novaQuantidade = scanner.nextInt();
       // produto.setQuantidadeEstoqueProd(novaQuantidade);
        scanner.nextLine(); // Limpa o buffer
    }
}