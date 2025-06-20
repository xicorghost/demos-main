package com.example.demos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demos.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {}

