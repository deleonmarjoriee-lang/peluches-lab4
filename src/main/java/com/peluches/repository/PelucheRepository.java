package com.peluches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.peluches.models.Peluche;

public interface PelucheRepository
extends JpaRepository<Peluche, Long>{

}