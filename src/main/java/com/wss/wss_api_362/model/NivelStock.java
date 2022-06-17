package com.wss.wss_api_362.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "nivel_stock")
public class NivelStock {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="id_nivelstock")
    private Integer idnivelstock;

	@OneToOne
	@JoinColumn(nullable = false, name="id_producto")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Producto idProducto;

    @Column(nullable = false, name="stock_security")
    private Integer stocksecurity;

    @Column(nullable = false, name="stock_maximium")
    private Integer stockmaximum;

    @Column(nullable = false, name="created_at")
    private Timestamp createdat;
   
    @Column(nullable = false, name="updated_at")
    private Timestamp updatedat;


	public Integer getIdnivelstock() {
		return idnivelstock;
	}

	public void setIdnivelstock(Integer idnivelstock) {
		this.idnivelstock = idnivelstock;
	}

	public Producto getIdproducto() {
		return idProducto;
	}

	public void setIdproducto(Producto idproducto) {
		this.idProducto = idproducto;
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
