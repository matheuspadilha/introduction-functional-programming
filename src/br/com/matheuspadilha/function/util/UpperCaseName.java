package br.com.matheuspadilha.function.util;

import br.com.matheuspadilha.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}