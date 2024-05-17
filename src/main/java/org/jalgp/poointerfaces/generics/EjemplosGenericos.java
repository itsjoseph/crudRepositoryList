package org.jalgp.poointerfaces.generics;

import org.jalgp.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List clientes = new ArrayList<>();
        clientes.add(new Cliente("Luis", "Amador"));

        Cliente luis = (Cliente) clientes.iterator().next();

        Cliente[] clientes1 = {new Cliente("Luis", "f"), new Cliente("Luis", "adsf")};
        Integer[] entero = {1, 2, 3, 4, 5, 6, 7, 8};

        List<Integer> enteros = fromArraytoList(entero);
        List<Cliente> clientes2 = fromArraytoList(clientes1);

        enteros.forEach(System.out::println);
        System.out.println("\n\n");
        clientes2.forEach(System.out::println);

    }

    public static <T> List<T> fromArraytoList(T[] client) {
        return Arrays.asList(client);
    }
}
