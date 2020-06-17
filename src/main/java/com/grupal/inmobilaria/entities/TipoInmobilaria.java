package com.grupal.inmobilaria.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_inmobilarias")
public class TipoInmobilaria implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_tip_inmobilaria")
	private int idTipInmobilaria;
	@Column(name="descripcion")
	private String descripcion;
	

	@OneToMany(mappedBy="tipoImnobilaria" , fetch = FetchType.LAZY )
	private List<Inmobilaria> inmobilaria;


	public TipoInmobilaria() {
		super();
	}
	
	
	public TipoInmobilaria(int id) {
		super();
		this.idTipInmobilaria =id;
	}


	public int getIdTipInmobilaria() {
		return idTipInmobilaria;
	}


	public void setIdTipInmobilaria(int idTipInmobilaria) {
		this.idTipInmobilaria = idTipInmobilaria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Inmobilaria> getInmobilaria() {
		return inmobilaria;
	}


	public void setInmobilaria(List<Inmobilaria> inmobilaria) {
		this.inmobilaria = inmobilaria;
	}
	
	
	
	

}
