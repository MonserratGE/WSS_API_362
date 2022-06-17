package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.ReciboPago;
import com.wss.wss_api_362.service.ReciboPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/recibo_pago")
public class ReciboPagoController {

    private final ReciboPagoService reciboPagoService;

    public ReciboPagoController(@Autowired ReciboPagoService reciboPagoService) {
        this.reciboPagoService = reciboPagoService;
    }

    @PostMapping
    public ReciboPago saveReciboPago(@RequestBody ReciboPago reciboPago) {
        return reciboPagoService.saveReciboPago(reciboPago);
    }

    @GetMapping("/{id}")
    public List<ReciboPago> obtenerReciboByClienteId(@PathVariable Integer idCliente) {
        return (List<ReciboPago>) reciboPagoService.obtenerReciboByClienteId(idCliente);
    }
}
