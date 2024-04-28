package Domain.UseCase;

import java.util.Scanner;

import Domain.Core.Model.Produto;

class UseCaseGerenciadorProdutos {
    private Scanner scanner;

    public UseCaseGerenciadorProdutos() {
        this.scanner = new Scanner(System.in);
    }

    public Produto cadastrarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto:");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        return new Produto(nome, preco, quantidade);
    }

    public void consultarProduto(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }

    public void atualizarEstoque(Produto produto) {
        System.out.println("Digite a nova quantidade em estoque:");
        int novaQuantidade = scanner.nextInt();
        produto.setQuantidadeEmEstoque(novaQuantidade);
        scanner.nextLine(); // Limpa o buffer
    }
}