package br.com.matheuspadilha.predicate.application;

import br.com.matheuspadilha.predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        // Exemplo 1
//        list.removeIf(p -> p.getPrice() >= min);

        // Exemplo 2
//        list.removeIf(Product::staticProductPredicate);

        // Exemplo 3
//        list.removeIf(Product::nonStaticProductPredicate);
        
        // Exemplo 4
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}