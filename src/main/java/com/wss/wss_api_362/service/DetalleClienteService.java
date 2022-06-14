package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.DetalleCliente;

import java.util.List;
import java.util.Map;

public interface DetalleClienteService {

    DetalleClienteService getDetalleCliente(Integer id);
    List<Map<String, Object>> getDetalleClientes();

    //Almacena un nuevo detalle de cliente
    DetalleCliente saveDetalleCliente(DetalleCliente detalleCliente);

    //Elimina un detalle de cliente
    Boolean deleteDetalleCliente(Integer id);

    //Actualiza un detalle de cliente
    DetalleCliente updateDetalleCliente(DetalleCliente detalleCliente);
}
