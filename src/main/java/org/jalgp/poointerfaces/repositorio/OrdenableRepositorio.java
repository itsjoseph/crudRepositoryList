package org.jalgp.poointerfaces.repositorio;

import org.jalgp.poointerfaces.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
