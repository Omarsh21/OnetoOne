package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.ContactoBean;

public interface ContactoService {

	public int guardar(ContactoBean contactoBean);
	public ContactoBean buscarPorId(Integer idContacto);
	public List<ContactoBean> buscar();
	public boolean actualizar(ContactoBean contactoBean);
	public boolean borrar(Integer idContacto);
}
