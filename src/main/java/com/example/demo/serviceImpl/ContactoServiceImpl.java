package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.ContactoBean;
import com.example.demo.model.Contacto;
import com.example.demo.repository.ContectoRepository;
import com.example.demo.service.ContactoService;

@Service
@Transactional
public class ContactoServiceImpl implements ContactoService{

	@Autowired
	private ContectoRepository contactoRepo;
	@Override
	public int guardar(ContactoBean contactoBean) {
		Contacto contacto = new Contacto();
		contacto.setIdContacto(contactoBean.getIdContacto());
		contacto.setCiudad(contactoBean.getCiudad());
		contacto.setTelefono(contactoBean.getTelefono());
		
		contactoRepo.save(contacto);
		return contacto.getIdContacto();
	}

	@Override
	public ContactoBean buscarPorId(Integer idContacto) {
		Contacto contacto = new Contacto();
		ContactoBean contactoBean = new ContactoBean();
		contactoBean.setIdContacto(contacto.getIdContacto());
		contactoBean.setCiudad(contacto.getCiudad());
		contactoBean.setTelefono(contacto.getTelefono());
		
		return contactoBean;
	}

	@Override
	public List<ContactoBean> buscar() {
		List<Contacto> contactoList = this.contactoRepo.findAll();
		List<ContactoBean> contactoBeanList = new ArrayList<>();
		
		for (int i = 0; i < contactoList.size(); i++) {
			ContactoBean contactoBean = new ContactoBean();
			contactoBean.setIdContacto(contactoList.get(i).getIdContacto());
			contactoBean.setCiudad(contactoList.get(i).getCiudad());
			contactoBean.setTelefono(contactoList.get(i).getTelefono());
			
			contactoBeanList.add(contactoBean);
		}
		return contactoBeanList;
	}

	@Override
	public boolean actualizar(ContactoBean contactoBean) {
		Contacto contacto = this.contactoRepo.findById(contactoBean.getIdContacto()).orElseThrow();
		contacto.setIdContacto(contactoBean.getIdContacto());
		contacto.setCiudad(contactoBean.getCiudad());
		contacto.setTelefono(contactoBean.getTelefono());
		
		contactoRepo.save(contacto);
		return true ;
	}

	@Override
	public boolean borrar(Integer idContacto) {
		Contacto contacto = this.contactoRepo.findById(idContacto).orElseThrow();
		this.contactoRepo.delete(contacto);
		return true;
	}

}
