package com.peluches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peluches.models.Peluche;
import com.peluches.repository.PelucheRepository;

@Service
public class PelucheServiceImpl
implements IPelucheService {

    @Autowired
    private PelucheRepository repo;

    @Override
    public List<Peluche> listar() {
        return repo.findAll();
    }

    @Override
    public void guardar(Peluche peluche) {
        repo.save(peluche);
    }

    @Override
    public Peluche buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}