package com.peluches.service;

import java.util.List;
import com.peluches.models.Categoria;

public interface ICategoriaService {

    List<Categoria> listar();

    void guardar(Categoria categoria);

    Categoria buscar(Long id);

    void eliminar(Long id);
}