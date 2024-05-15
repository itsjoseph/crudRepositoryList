package org.jalgp.poointerfaces.repositorio;

import org.jalgp.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cleinte);

    void eliminar(Integer id);
}
