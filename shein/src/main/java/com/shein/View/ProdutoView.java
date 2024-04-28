package com.shein.View;

import java.util.Scanner;

import com.shein.Models.Produto;

public class ProdutoView {
    private Scanner scanner;

    public ProdutoView() {
        this.scanner = new Scanner(System.in);
    }

    public Produto cadastrarProduto() {
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

    public void consultarProduto(Produto produto) {
        System.out.println("Nome: " + produto.getName());
        //System.out.println("Preço: " + produto.getPrecoProduto());
       // System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoqueProd());
    }

    public void atualizarEstoque(Produto produto) {
        System.out.println("Digite a nova quantidade em estoque:");
        String size = scanner.nextLine();
        produto.setSize(size);
        scanner.nextLine(); // Limpa o buffer
    }
}