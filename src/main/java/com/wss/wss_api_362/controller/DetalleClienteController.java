package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.DetalleCliente;
import com.wss.wss_api_362.service.DetalleClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/detalle_cliente")
public class DetalleClienteController {

    private final DetalleClienteService detalleClienteService;

    public DetalleClienteController(@Autowired DetalleClienteService detalleClienteService) {
        this.detalleClienteService = detalleClienteService;
    }

    // Leer
    @RequestMapping("/{id}")
    public DetalleCliente getDetalleCliente(@PathVariable Integer id) {
        return (DetalleCliente) detalleClienteService.getDetalleCliente(id);
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
