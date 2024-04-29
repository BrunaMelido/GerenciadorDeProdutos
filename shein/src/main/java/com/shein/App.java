package com.shein;

import com.shein.Controllers.ProductController;

public class App {
    public static void main(String[] args)throws Exception {
        ProductController _produtoController = new ProductController();
        _produtoController.Iniciar();
    }
}