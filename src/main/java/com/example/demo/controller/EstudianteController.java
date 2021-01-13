package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.EstudianteBean;
import com.example.demo.service.EstudianteService;

@RequestMapping("/estudiante")
@RestController
public class EstudianteController {

	@Autowired
	private EstudianteService estudianteService;
	
	@PostMapping("/guardar")
	public ResponseEntity<Integer> guardar(@Valid @RequestBody EstudianteBean estudianteBean){
		return new ResponseEntity<>(this.estudianteService.guardar(estudianteBean), HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Boolean> actualizar(@Valid @RequestBody EstudianteBean estudianteBean){
		return new ResponseEntity<>(this.estudianteService.actualizar(estudianteBean), HttpStatus.OK);
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<List<EstudianteBean>> fetch(){
		return new ResponseEntity<>(this.estudianteService.buscar(), HttpStatus.OK);
	}
	
	@GetMapping("/buscarId/{id}")
	public ResponseEntity<EstudianteBean> buscarId(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.estudianteService.buscarPorId(id), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Boolean> borrar(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.estudianteService.borrar(id), HttpStatus.OK);
	}
}
