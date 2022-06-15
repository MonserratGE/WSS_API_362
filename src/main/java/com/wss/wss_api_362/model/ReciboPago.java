package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.List;

@Entity
@Table(name = "recibo_pago")
public class ReciboPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id_recibo_pago")
    private Integer idReciboPago;

    @OneToOne
    @JoinColumn(nullable = false, name="id_compra")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Compra idCompra;

    @ManyToOne
    @JoinColumn(nullable = false, name="id_cliente")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cliente cliente;

    @Column(nullable = false, name="text")
    private String text;

    @Column(nullable = false, name="created_at")
    private Timestamp createdAt;

    @Column(nullable = false, name="updated_at")
    private Timestamp updatedAt;

    public Integer getIdReciboPago() {
        return idReciboPago;
    }

    public void setIdReciboPago(Integer idReciboPago) {
        this.idReciboPago = idReciboPago;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

}
