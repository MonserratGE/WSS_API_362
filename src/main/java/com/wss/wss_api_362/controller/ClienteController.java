package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.Cliente;
import com.wss.wss_api_362.service.ClienteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @RequestMapping("/{id}")
    public Cliente getCliente(@PathVariable Integer id) {
        return clienteService.getCliente(id);
    }

    @RequestMapping("/save")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @RequestMapping("/update")
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteService.update(cliente);
    }

}
