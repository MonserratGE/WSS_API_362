package com.wss.wss_api_362.repository;

import com.wss.wss_api_362.model.DetalleCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface DetalleClienteRepository extends JpaRepository<DetalleCliente, Integer> {

    @Query(value = "SELECT numero_tarjeta, titular_tarjeta, fecha_expiracion FROM detalle_cliente INNER JOIN cliente ON detalle_cliente.id_cliente = cliente.id_cliente;", nativeQuery = true)
    List<Map<String,Object>> obtenerDetalleClientes();
}
