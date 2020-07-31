package com.signup.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "estatus")
public class Estatus implements Serializable {
	
	private static final  long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_estatus;
	private String nombre;
	private String observaciones;
	private String tipo_estatus;
	private String fecha;
	public int getId_estatus() {
		return id_estatus;
	}
	public void setId_estatus(int id_estatus) {
		this.id_estatus = id_estatus;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getTipo_estatus() {
		return tipo_estatus;
	}
	public void setTipo_estatus(String tipo_estatus) {
		this.tipo_estatus = tipo_estatus;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Estatus(int id_estatus, String nombre, String observaciones, String tipo_estatus, String fecha) {
		super();
		this.id_estatus = id_estatus;
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.tipo_estatus = tipo_estatus;
		this.fecha = fecha;
	}
	public Estatus() {
		super();
	}
	
	

}
