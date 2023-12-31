package com.example.shopall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopall.model.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {
    
}
