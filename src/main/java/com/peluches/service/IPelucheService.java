package com.peluches.service;

import java.util.List;
import com.peluches.models.Peluche;

public interface IPelucheService {

    List<Peluche> listar();

    void guardar(Peluche peluche);

    Peluche buscar(Long id);

    void eliminar(Long id);
}