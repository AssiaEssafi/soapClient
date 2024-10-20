package org.example.client;

import proxy.Product;
import proxy.ProductWS;
import proxy.ProductWebService;

import java.util.Date;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        ProductWebService proxy = new ProductWS().getProductWebServicePort();

        // Test de la méthode sellingPrice
        System.out.println("Selling Price: " + proxy.sellingPrice(400.00));
        System.out.println("-----------------------");

        // Test de la méthode getProduct
        Product product = proxy.getProduct(4);
        if (product != null) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: " + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("--------------------");

        // Test de la méthode productList
        List<Product> products = proxy.productList();
        products.forEach(p -> {
            System.out.println("Product Name: " + p.getName());
            System.out.println("Product Price: " + p.getPrice());
        });

        // Test de la méthode addProduct
        Product newProduct = new Product(5, "Notebook", 15.0, new Date());
        System.out.println(proxy.addProduct(newProduct));

        // Test de la méthode updateProduct
        newProduct.setPrice(20.0); // Changer le prix pour l'update
        System.out.println(proxy.updateProduct(newProduct));

        // Test de la méthode deleteProduct
        System.out.println(proxy.deleteProduct(5));
    }
}
