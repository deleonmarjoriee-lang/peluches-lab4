package com.peluches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peluches.models.Categoria;
import com.peluches.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl
implements ICategoriaService{

    @Autowired
    private CategoriaRepository repo;

    @Override
    public List<Categoria> listar() {
        return repo.findAll();
    }

    @Override
    public void guardar(Categoria categoria) {
        repo.save(categoria);
    }

    @Override
    public Categoria buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}