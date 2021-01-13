package com.example.demo.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idContacto;
	
	@NotNull
	@Size(max=30)
	private String ciudad;
	
	@NotNull
	@Size(max=15)
	private String telefono;
	
	public ContactoBean() {
		
	}

	public ContactoBean(int idContacto) {
		super();
		this.idContacto = idContacto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return "ContactoBean [idContacto=" + idContacto + ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
