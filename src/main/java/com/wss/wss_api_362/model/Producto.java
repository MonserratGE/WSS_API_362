package com.wss.wss_api_362.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, name="id_producto")
	private Integer idProducto;
	
	@Column(nullable=false, name="nombre")
	private String nombre;
	
	@Column(nullable=false, name="codigo")
	private String codigo;
	
	@Column(nullable=false, name="descripcion")
	private String descripcion; 
	
	@Column(nullable=false, name="id_categoria")
	private Integer idCategoria;
	
	@Column(nullable=false, name="precio")
	private Integer precio;
	
	@Column(nullable=false, name="stock_units")
	private Integer stock;
	
	@Column(nullable=false, name="funcionalidad")
	private String funcionalidad;
	
	@Column(nullable=false, name="cuidados")
	private String cuidados;
	
	@Column(nullable=false, name="medidas")
	private Integer medidas;
	
	@Column(nullable=false, name="imagen_frontal")
	private String imgFront;
	
	@Column(nullable=false, name="imagen_lateral")
	private String imgLat;
	
	@Column(nullable=false, name="imagen_extra")
	private String imgExt;
	
	@Column(nullable = false, name="created_at")
    private Date createdAt;

	@Column(nullable = false, name="updated_at")
    private Date updatedAt;
	
	

	
//	SETTERS AND GETTERS 
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
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

	public String getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	public String getCuidados() {
		return cuidados;
	}

	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}

	public Integer getMedidas() {
		return medidas;
	}

	public void setMedidas(Integer medidas) {
		this.medidas = medidas;
	}

	public String getImgFront() {
		return imgFront;
	}

	public void setImgFront(String imgFront) {
		this.imgFront = imgFront;
	}

	public String getImgLat() {
		return imgLat;
	}

	public void setImgLat(String imgLat) {
		this.imgLat = imgLat;
	}

	public String getImgExt() {
		return imgExt;
	}

	public void setImgExt(String imgExt) {
		this.imgExt = imgExt;
	}
	
}
