package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

import javax.persistence.*;

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
	@ManyToOne
	@JoinColumn(nullable=false, name="id_categoria")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Categoria idCategoria;
	
	@Column(nullable=false, name="precio")
	private Integer precio;
	@OneToOne(mappedBy = "producto")
	private NivelStock nivelStock;
	
	@Column(nullable=false, name="funcionalidad")
	private String funcionalidad;
	
	@Column(nullable=false, name="cuidados")
	private String cuidados;
	
	@Column(nullable=false, name="medidas")
	private String medidas;
	
	@Column(nullable=false, name="imagen_frontal")
	private String imgFront;
	
	@Column(nullable=false, name="imagen_lateral")
	private String imgLat;
	
	@Column(nullable=false, name="imagen_extra")
	private String imgExt;
	
	@Column(nullable = false, name="created_at")
    private Timestamp createdAt;

	@Column(nullable = false, name="updated_at")
    private Timestamp updatedAt;

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

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public NivelStock getNivelStock() {
		return nivelStock;
	}

	public void setNivelStock(NivelStock nivelStock) {
		this.nivelStock = nivelStock;
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

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
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
