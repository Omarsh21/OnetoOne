package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estudiante")
	private int idEstudiante;
	
	@Column(name="nombre", nullable=false, length = 30)
	private String nombre;
	
	@Column(name="apellidos", nullable=false, length=60)
	private String apellidos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_estudiante", referencedColumnName = "id_contacto", nullable = false)
	private Contacto contacto;

	public Estudiante() {
		
	}
	

	public Estudiante(int idEstudiante) {
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

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", contacto=" + contacto + "]";
	}

	

}
