package com.shein.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@AllArgsConstructor
public class Produto {

    private String url;
    private String name;
    private String sku;
    private String price;
    private String size;
    private String brand;
    private String description;
    private String images;
    //private double precoProduto;
    //private int quantidadeEstoqueProd;

}