package org.jalgp.poointerfaces;

import org.jalgp.poointerfaces.modelo.Cliente;
import org.jalgp.poointerfaces.repositorio.*;

import java.sql.SQLOutput;
import java.util.List;

public class EjemploRepo {
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Luis", "Amador"));
        repo.crear(new Cliente("asdfafd", "asdfa"));
        repo.crear(new Cliente("asdfa", "fdaf"));
        repo.crear(new Cliente("asdfas", "asdfasdf"));

        List<Cliente> listaclientes = repo.listar();

        for (Cliente lista : listaclientes) {
            System.out.println(lista);
        }

        System.out.println("\n\n");

        List<Cliente> listaordenada = ((PaginableRepositorio)repo).listar(0,3);

        listaordenada.forEach(System.out::println);

        System.out.println("\n\n");

        List<Cliente> clientesASC = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        clientesASC.forEach(System.out::println);

        List<Cliente> clientesDESC = ((OrdenableRepositorio)repo).listar("nombre", Direccion.DESC);
        clientesDESC.forEach(System.out::println);

        System.out.println("EDITAR");
        Cliente actualizar = new Cliente("Alejandro","Xocas");
        actualizar.setId(2);
        repo.editar(actualizar);

        List<Cliente> listaactualizada = repo.listar();

        for (Cliente c: listaactualizada) {
            System.out.println(c);
        }


        System.out.println("====== ELIMINAR ======");
        repo.eliminar(2);
        List<Cliente> listaactualizad = repo.listar();

        for (Cliente c: listaactualizad) {
            System.out.println(c);
        }




    }
}
