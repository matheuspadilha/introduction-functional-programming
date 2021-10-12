package br.com.matheuspadilha.consumer.application;

import br.com.matheuspadilha.consumer.util.PriceUpdate;
import br.com.matheuspadilha.consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Exemplo 1
//        list.forEach(new PriceUpdate());

        // Exemplo 2
//        list.forEach(Product::staticPriceUpdate);

        // Exemplo 3
//        list.forEach(Product::nonStaticPriceUpdate);

        // Exemplo 4
//        Consumer<Product> cons = p -> { p.setPrice(p.getPrice() * 1.1); };
//        list.forEach(cons);

        // Exemplo 5
        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}