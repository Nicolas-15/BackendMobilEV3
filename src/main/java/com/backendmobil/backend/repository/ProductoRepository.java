package com.backendmobil.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backendmobil.backend.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}