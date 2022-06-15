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
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name = "compra")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="id_compra")
	private Integer id_compra;
	
	@Column(nullable = false, name="id_fila_compra")
	private Integer id_fila;
	
	@Column(nullable = false, name="id_metodo_pago")
	private Integer id_metodo;
	
	@Column(nullable = false, name="unidades")
	private Integer unidades;
	
	@Column(nullable = false, name="precio")
	private Integer precio;
	
	
	@Column(nullable = false, name="created_at")
    private Timestamp createdAt;

    @Column(nullable = false, name="updated_at")
    private Timestamp updatedAt;

	
  //Especificar la union con alumno
//  	@OneToMany(mappedBy = "compra")
//  	private List<recibo_compra> id_recibo;
  	
  	//Especificar la union con instructor
//  	@OneToOne(mappedBy = "compra")
//  	private recibo_compra recibo_compra;
	
	//Llave foranea 
	
//	@ManyToOne
//	@JoinColumn(nullable = false, name="id_metodo_pago")
//	@JsonProperty(access = Access.WRITE_ONLY)
//	private  catalogo_metodo_pago catalogo_metodo_pago;
//	@JoinColumn(nullable = false, name="id_fila_compra")
//	@JsonProperty(access = Access.WRITE_ONLY)
//	private  fila_compra fila_compra;


	public Integer getId_compra() {
		return id_compra;
	}


	public void setId_compra(Integer id_compra) {
		this.id_compra = id_compra;
	}


	public Integer getId_fila() {
		return id_fila;
	}


	public void setId_fila(Integer id_fila) {
		this.id_fila = id_fila;
	}


	public Integer getId_metodo() {
		return id_metodo;
	}


	public void setId_metodo(Integer id_metodo) {
		this.id_metodo = id_metodo;
	}


	public Integer getUnidades() {
		return unidades;
	}


	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}


	
}