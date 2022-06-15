package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "nivelstock")
public class NivelStock {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id_nivelstock")
    private Integer idnivelstock;

    @Column(nullable = false, name="id_producto")
    private Integer idproducto;

    @Column(nullable = false, name="stock_security")
    private Integer stocksecurity;

    @Column(nullable = false, name="stock_maximium")
    private Integer stockmaximum;

    @Column(nullable = false, name="created_at")
    private Timestamp createdat;
   
    @Column(nullable = false, name="updated_at")
    private Timestamp updatedat;

    @ManyToOne
	@JoinColumn(nullable = false, name="id_nivelstock")
	@JsonProperty(access = Access.WRITE_ONLY)
	//private Producto producto;

	public Integer getIdnivelstock() {
		return idnivelstock;
	}

	public void setIdnivelstock(Integer idnivelstock) {
		this.idnivelstock = idnivelstock;
	}

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public Integer getStocksecurity() {
		return stocksecurity;
	}

	public void setStocksecurity(Integer stocksecurity) {
		this.stocksecurity = stocksecurity;
	}

	public Integer getStockmaximum() {
		return stockmaximum;
	}

	public void setStockmaximum(Integer stockmaximum) {
		this.stockmaximum = stockmaximum;
	}

	public Timestamp getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}

	public Timestamp getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(Timestamp updatedat) {
		this.updatedat = updatedat;
	}

/*	public List<productos> getProductos() {
		return productos;
	}

	public void setProductos(List<productos> productos) {
		this.productos = productos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
*/
    
	
}
