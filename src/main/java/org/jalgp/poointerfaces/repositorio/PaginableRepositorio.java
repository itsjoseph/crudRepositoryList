package org.jalgp.poointerfaces.repositorio;

import org.jalgp.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
