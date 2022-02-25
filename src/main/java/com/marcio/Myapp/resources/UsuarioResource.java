package com.marcio.Myapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.marcio.Myapp.domain.Usuario;
import com.marcio.Myapp.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping(value  = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id){
		Usuario obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
		
		
		
		
	}
	

		
	
}
