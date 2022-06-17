package com.wss.wss_api_362.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catalogo_metodo_pago")
public class CatalogoMetodoPago {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, name="id_metodo_pago")
	private Integer id;
	
	@Column(nullable=false, name="nombre_metodo_pago")
	private String NombreMetodoPago;
	
	@Column(nullable=false, name="codigo_metodo_pago")
	private String CodigoMetodoPago;
	
	@Column(nullable = false, name="created_at")
    private Date createdAt;

	@Column(nullable = false, name="updated_at")
    private Date updatedAt;

	
//	getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreMetodoPago() {
		return NombreMetodoPago;
	}

	public void setNombreMetodoPago(String nombreMetodoPago) {
		NombreMetodoPago = nombreMetodoPago;
	}

	public String getCodigoMetodoPago() {
		return CodigoMetodoPago;
	}

	public void setCodigoMetodoPago(String codigoMetodoPago) {
		CodigoMetodoPago = codigoMetodoPago;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	

}
