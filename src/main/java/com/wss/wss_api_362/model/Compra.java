package com.wss.wss_api_362.model;


import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "compra")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "id_compra")
	private Integer idCompra;

	@OneToMany(mappedBy = "compra")
	private List<FilaCompra> filaCompras;

	@OneToOne
	@JoinColumn(nullable = false, name = "id_metodo_pago")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private CatalogoMetodoPago metodoPago;

	@Column(nullable = false, name = "created_at")
	private Timestamp createdAt;

	@Column(nullable = false, name = "updated_at")
	private Timestamp updatedAt;

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public List<FilaCompra> getFilaCompras() {
		return filaCompras;
	}

	public void setFilaCompras(List<FilaCompra> filaCompras) {
		this.filaCompras = filaCompras;
	}

	public CatalogoMetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(CatalogoMetodoPago metodoPago) {
		this.metodoPago = metodoPago;
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