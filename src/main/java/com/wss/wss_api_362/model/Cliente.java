package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id_cliente")
    private Integer id;

    @Column(nullable = false, name="id_detalle_cliente")
    private Integer idDetalleCliente;

    @Column(nullable = false, name="nombre")
    private String nombre;

    @Column(nullable = false, name="apellidos")
    private String apellidos;

    @Column(nullable = false, unique = true, name="correo")
    private String correo;

    /**
     * Generamos las relaciones con las otras tablas y clases
     */
    @OneToMany
    @JoinColumn(nullable = false, name = "id_cliente")
    @JsonProperty(access = Access.WRITE_ONLY)
    private DetalleCliente detalleCliente;
}
