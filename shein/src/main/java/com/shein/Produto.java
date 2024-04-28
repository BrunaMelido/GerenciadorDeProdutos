package com.shein;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEstoqueProd;

    public Produto(String nomeProduto, double precoProduto, int quantidadeEstoqueProd) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEstoqueProd = quantidadeEstoqueProd;
    }

    public String getnomeProduto() {
        return nomeProduto;
    }

    public void setnomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEstoqueProd;
    }

    public void setQuantidadeEmEstoque(int quantidadeEstoqueProd) {
        this.quantidadeEstoqueProd = quantidadeEstoqueProd;
    }
}