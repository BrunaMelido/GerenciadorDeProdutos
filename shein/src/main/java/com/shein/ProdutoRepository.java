package com.shein;

public class ProdutoRepository {
    public void salvarNoBanco(Produto produto) {
        // Lógica para salvar o produto no banco de dados
        System.out.println("Produto " + produto.getnomeProduto() + " salvo no banco de dados.");
    }
}