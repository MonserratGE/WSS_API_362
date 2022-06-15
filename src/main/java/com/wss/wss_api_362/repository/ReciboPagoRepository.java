package com.wss.wss_api_362.repository;

import com.wss.wss_api_362.model.ReciboPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReciboPagoRepository extends JpaRepository<ReciboPago, Integer> {


    List <ReciboPago> findByClienteId(Integer idCliente);
}
