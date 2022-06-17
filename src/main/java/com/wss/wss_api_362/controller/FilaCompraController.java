package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.FilaCompra;
import com.wss.wss_api_362.model.Producto;
import com.wss.wss_api_362.service.FilaCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/filaCompra")
public class FilaCompraController {

    FilaCompraService filaCompraService;

    public FilaCompraController(@Autowired FilaCompraService filaCompraService) {
        this.filaCompraService = filaCompraService;
    }

    @GetMapping("/{id}")
    public FilaCompra getFilaCompraById(@PathVariable Integer id) {
        return filaCompraService.getFilaCompra(id);
    }

    @GetMapping("/compras")
    public List<FilaCompra> getFilaCompras() {
        return filaCompraService.getFilaCompras();
    }

    @PostMapping
    public FilaCompra saveFilaCompra(@RequestBody FilaCompra filaCompra) {
        return filaCompraService.saveFilaCompra(filaCompra);
    }

    @PutMapping
    public FilaCompra updateFilaCompra(@RequestBody FilaCompra filaCompra) {
        return filaCompraService.updateFilaCompra(filaCompra);
    }

}
