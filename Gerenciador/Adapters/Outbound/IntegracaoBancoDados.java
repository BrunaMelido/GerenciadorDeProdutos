package Adapters.Outbound;

import Domain.Core.Model.Produto;

class IntegraçãoBancoDados {
    public void salvarNoBanco(Produto produto) {
        // Lógica para salvar o produto no banco de dados
        System.out.println("Produto " + produto.getNome() + " salvo no banco de dados.");
    }
}
