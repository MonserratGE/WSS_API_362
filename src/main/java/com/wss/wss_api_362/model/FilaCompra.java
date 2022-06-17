package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "fila_compra")
public class FilaCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id_fila_compra")
    private Integer idFilaCompra;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_compra")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Compra compra;

    @OneToOne
    @JoinColumn(nullable = false, name = "id_producto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Producto producto;

    @Column(nullable = false, name = "num_compra")
    private Integer numCompra;

    @Column(nullable = false, name = "unidades")
    private Integer unidades;

    @Column(nullable = false, name = "precio")
    private BigInteger precio;

    @Column(nullable = false, name = "mensaje_salida")
    private String mensajeSalida;

    @Column(nullable = false, name = "created_at")
    private Timestamp createdAt;

    @Column(nullable = false, name = "updated_at")
    private Timestamp updatedAt;


    public Integer getIdFilaCompra() {
        return idFilaCompra;
    }

    public void setIdFilaCompra(Integer idFilaCompra) {
        this.idFilaCompra = idFilaCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(Integer numCompra) {
        this.numCompra = numCompra;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public String getMensajeSalida() {
        return mensajeSalida;
    }

    public void setMensajeSalida(String mensajeSalida) {
        this.mensajeSalida = mensajeSalida;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
