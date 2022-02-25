package com.marcio.Myapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.marcio.Myapp.domain.Usuario;
import com.marcio.Myapp.repositoreis.UsuarioRepository;
import com.marcio.Myapp.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id ) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado!Id: " + id + ", Tipo: " + Usuario.class.getCanonicalName()));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
		
	}

}
