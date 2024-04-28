package com.shein.Repository;

import com.shein.Models.Produto;

public class ProdutoRepository {
    public void salvarNoBanco(Produto produto) {
        // Lógica para salvar o produto no banco de dados
        System.out.println("Produto " + produto.getName() + " salvo no banco de dados.");
    }
}