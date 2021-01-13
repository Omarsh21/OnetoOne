package com.example.demo.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.model.Contacto;

public class EstudianteBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idEstudiante;
	
	@NotNull
	@Size(max=30)
	private String nombre;
	
	@NotNull
	@Size(max=60)
	private String apellidos;
	
//	@NotNull
	private Contacto contacto;
	
	public EstudianteBean() {
		
	}


	public EstudianteBean(int idEstudiante) {
		super();
		this.idEstudiante = idEstudiante;
	}



	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public Contacto getContacto() {
		return contacto;
	}


	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}


	@Override
	public String toString() {
		return "EstudianteBean [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", contacto=" + contacto + "]";
	}

	
}
