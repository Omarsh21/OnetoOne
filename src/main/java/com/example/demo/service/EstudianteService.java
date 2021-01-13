package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.EstudianteBean;

public interface EstudianteService {

	public int guardar(EstudianteBean estudianteBean);
	public EstudianteBean buscarPorId(Integer idEstudiante);
	public List<EstudianteBean> buscar();
	public boolean actualizar(EstudianteBean estudianteBean);
	public boolean borrar(Integer idEstudiante);
}
