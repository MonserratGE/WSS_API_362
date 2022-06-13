package com.wss.wss_api_362.service;

public interface ClienteService {

    //Definir los metodos que vamos a utilizar

    // Leer
    ClienteService getCliente(Integer id);

    // Guardar
    ClienteService saveCliente(ClienteService cliente);

    // Borrar
    Boolean deleteCliente(Integer id);

    // Actualizar
    ClienteService updateCliente(ClienteService cliente);
}
