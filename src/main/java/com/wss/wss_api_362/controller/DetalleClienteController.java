package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.DetalleCliente;
import com.wss.wss_api_362.service.DetalleClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/detalle_cliente")
public class DetalleClienteController {

    private final DetalleClienteService detalleClienteService;

    public DetalleClienteController(@Autowired DetalleClienteService detalleClienteService) {
        this.detalleClienteService = detalleClienteService;
    }

    // Leer
    @GetMapping("/{id}")
    public DetalleCliente getDetalleCliente(@PathVariable Integer id) {
        return detalleClienteService.getDetalleCliente(id);
    }

    @GetMapping("/DetalleClientes")
    public List<Map<String, Object>> getDetalleClientes() {
        return detalleClienteService.getDetalleClientes();
    }

    // Escribir
    @PostMapping
    public DetalleCliente saveDetalleCliente(@RequestBody DetalleCliente detalleCliente) {
        return detalleClienteService.saveDetalleCliente(detalleCliente);
    }

    // Borrar
    @DeleteMapping("delete/{id}")
    public void deleteDetalleCliente(@PathVariable Integer id) {
        detalleClienteService.deleteDetalleCliente(id);
    }

    // Actualizar
    @PutMapping
    public DetalleCliente updateDetalleCliente(@RequestBody DetalleCliente detalleCliente) {
        return detalleClienteService.updateDetalleCliente(detalleCliente);
    }

}
