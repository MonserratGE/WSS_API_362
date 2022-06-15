package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.ReciboPago;
import com.wss.wss_api_362.service.ReciboPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/recibo_pago")
public class ReciboPagoController {

    private final ReciboPagoService reciboPagoService;

    public ReciboPagoController(@Autowired ReciboPagoService reciboPagoService) {
        this.reciboPagoService = reciboPagoService;
    }

    @PostMapping
    public ReciboPago saveReciboPago(ReciboPago reciboPago) {
        return reciboPagoService.save(reciboPago);
    }

    @GetMapping("/{id}")
    public ArrayList<ReciboPago> getReciboPago(@PathVariable Integer idCliente) {
        return (ArrayList<ReciboPago>) reciboPagoService.findByClienteId(idCliente);
    }
}
