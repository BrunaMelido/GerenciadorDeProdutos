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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        Produto _produto = new Produto();
        // while (_eperation != 0){
        //     _eperation = ProductView.MenuEscolha(null);
        //     if(info == 2) _produto = _produtoView.ConsultarProduto();
        //     if(info == 3) _produto = _produtoView.AtualizarEstoque();
        //     if(info == 0)  System.out.println("Saindo...");
        //     else System.out.println("Opção inválida.");
        // // }
        // if (_produto != null) {
        System.out.println("Qual informação deseja alterar? (url, name, sku, price, size, brand, description, images)");
        String info = scanner.nextLine();

        // switch (info) {
            if(info == "1") System.out.println("Digite a nova URL:");
            _produto.setUrl(scanner.nextLine());
            if(info == "2") System.out.println("Digite o novo nome:");
                _produto.setName(scanner.nextLine());
                if(info == "3") System.out.println("Digite o novo SKU:");
                _produto.setSku(scanner.nextLine());
                if(info == "4") System.out.println("Digite o novo preço:");
                _produto.setSize(scanner.nextLine());
                if(info == "5") System.out.println("Digite o novo tamanho:");
                _produto.setBrand(scanner.nextLine());
                if(info == "6") System.out.println("Digite a nova marca:");
                _produto.setBrand(scanner.nextLine());
            //}
                // case "6":
                //     System.out.println("Digite a nova marca:");
                //     produto.setBrand(scanner.nextLine());
                //     break;
                // case "7":
                //     System.out.println("Digite a nova descrição:");
                //     produto.setDescription(scanner.nextLine());
                //     break;
                // case "8":
                //     System.out.println("Digite as novas imagens (separadas por vírgula):");
                //     produto.setImages(scanner.nextLine());
                //     break;
                // default:
                //     System.out.println("Opção inválida.");
            

            return _produto;
        }
        // } else {
        //     System.out.println("Produto não encontrado.");
        //     return null;
        // }


        // Produto produto = new Produto();
        // System.out.println("sku: ");
        // String skuInput = scanner.nextLine();
        // produto.setSku(skuInput);
        // System.out.println("Digite a nova quantidade em estoque:");
        // String size = scanner.nextLine();
        // produto.setSize(size);
        // produto.getUrl();

        //colocar todos os valores que forem passados
        

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