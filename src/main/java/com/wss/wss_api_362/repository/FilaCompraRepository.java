package com.wss.wss_api_362.repository;

import com.wss.wss_api_362.model.FilaCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilaCompraRepository extends JpaRepository<Producto, Integer> {

    Producto findProductoById(Integer id);
}
