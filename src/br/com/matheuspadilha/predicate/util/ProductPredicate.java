package br.com.matheuspadilha.predicate.util;

import br.com.matheuspadilha.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}