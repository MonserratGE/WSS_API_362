package com.wss.wss_api_362.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wss.wss_api_362.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
