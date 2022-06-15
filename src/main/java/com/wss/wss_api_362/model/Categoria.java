package com.wss.wss_api_362.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
**/
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="id_categoria")
	private Integer id_categoria;
	
	@Column(nullable = false, name="nombre_categoria")
	private String nombre_categoria;
	
	@Column(nullable = false, name="estilo_categoria")
	private String estilo_categoria;
	
	
		public Integer getId_categoria() {
			return id_categoria;
		}

		public void setId_categoria(Integer id_categoria) {
			this.id_categoria = id_categoria;
		}

		public String getNombre_categoria() {
			return nombre_categoria;
		}

		public void setNombre_categoria(String nombre_categoria) {
			this.nombre_categoria = nombre_categoria;
		}

		public String getEstilo_categoria() {
			return estilo_categoria;
		}

		public void setEstilo_categoria(String estilo_categoria) {
			this.estilo_categoria = estilo_categoria;
		}

		
		
		
}
