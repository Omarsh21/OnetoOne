package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.EstudianteBean;
import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;
import com.example.demo.service.EstudianteService;

@Service
@Transactional
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepository estudianteRepo;
	@Override
	public int guardar(EstudianteBean estudianteBean) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(estudianteBean.getNombre());
		estudiante.setApellidos(estudianteBean.getApellidos());
		estudiante.setContacto(estudianteBean.getContacto());
		estudianteRepo.save(estudiante);
		return estudiante.getIdEstudiante();
	}

	@Override
	public EstudianteBean buscarPorId(Integer idEstudiante) {
		Estudiante estudiante = this.estudianteRepo.findById(idEstudiante).orElseThrow();
		EstudianteBean estudianteBean = new EstudianteBean();
		estudianteBean.setIdEstudiante(estudiante.getIdEstudiante());
		estudianteBean.setNombre(estudiante.getNombre());
		estudianteBean.setApellidos(estudiante.getApellidos());
		estudianteBean.setContacto(estudiante.getContacto());
		return estudianteBean;
	}

	@Override
	public List<EstudianteBean> buscar() {
		List<Estudiante> estudianteList = this.estudianteRepo.findAll();
		List<EstudianteBean> estudianteBeanList = new ArrayList<>();
		for (int i = 0; i<estudianteList.size(); i++) {
			EstudianteBean estudianteBean = new EstudianteBean();
			estudianteBean.setIdEstudiante(estudianteList.get(i).getIdEstudiante());
			estudianteBean.setNombre(estudianteList.get(i).getNombre());
			estudianteBean.setApellidos(estudianteList.get(i).getApellidos());
			estudianteBean.setContacto(estudianteList.get(i).getContacto());
			estudianteBeanList.add(estudianteBean);
		}
		return estudianteBeanList;
	}

	@Override
	public boolean actualizar(EstudianteBean estudianteBean) {
		Estudiante estudiante = this.estudianteRepo.findById(estudianteBean.getIdEstudiante()).orElseThrow();
		estudiante.setNombre(estudianteBean.getNombre());
		estudiante.setApellidos(estudianteBean.getApellidos());
		estudiante.setContacto(estudianteBean.getContacto());
		
		estudianteRepo.save(estudiante);
		return true;
	}

	@Override
	public boolean borrar(Integer idEstudiante) {
		Estudiante estudiante = this.estudianteRepo.findById(idEstudiante).orElseThrow();
		this.estudianteRepo.delete(estudiante);
		return true;
	}

}
