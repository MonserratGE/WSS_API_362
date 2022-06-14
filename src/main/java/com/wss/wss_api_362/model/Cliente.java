package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id_cliente")
    private Integer idCliente;

    @Column(nullable = false, name="nombre")
    private String nombre;

    @Column(nullable = false, name="apellidos")
    private String apellidos;

    @Column(nullable = false, name="contrasena")
    private String contrasena;

    @Column(nullable = false, name="created_at")
    private Timestamp createdAt;

    @Column(nullable = false, name="updated_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "cliente")
    private List<DetalleCliente> detalleClientes;

    /**
     * Activar cuando se tenga la parte de recibo de pago
     * @OneToMany(mappedBy = "cliente")
     * private List<ReciboPago> reciboPagos;
     */

    public Integer getId() {
        return idCliente;
    }

    public void setId(Integer id) {
        this.idCliente = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<DetalleCliente> getDetalleClientes() {
        return detalleClientes;
    }

    public void setDetalleClientes(List<DetalleCliente> detalleClientes) {
        this.detalleClientes = detalleClientes;
    }

}
