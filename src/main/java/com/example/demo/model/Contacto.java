package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
public class Contacto {

	@Id
	@Column(name="id_contacto")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idContacto;
	
	@Column(name="ciudad", nullable=false, length=30)
	private String ciudad;
	
	@Column(name="telefono", nullable=false, length=15)
	private String telefono;

	public Contacto() {
		
	}
	public Contacto(int idContacto) {
		super();
		this.idContacto = idContacto;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
