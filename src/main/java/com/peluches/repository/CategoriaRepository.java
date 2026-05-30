package com.peluches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.peluches.models.Categoria;

public interface CategoriaRepository
extends JpaRepository<Categoria, Long>{

}