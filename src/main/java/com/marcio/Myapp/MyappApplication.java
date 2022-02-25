package com.marcio.Myapp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcio.Myapp.domain.Usuario;
import com.marcio.Myapp.repositoreis.UsuarioRepository;

@SpringBootApplication
public class MyappApplication  implements CommandLineRunner{
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "marcio torres", "marcio", "123");
		Usuario u2 = new Usuario(null, "tadeu torres", "torres", "123");
		
		 usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
