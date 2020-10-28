package com.projeto.spring.projetospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.spring.projetospring.entities.Usuario;
import com.projeto.spring.projetospring.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario1 = new Usuario(null, "Carlos", "carlos@gmail.com", "123123123", "123456");
		Usuario usuario2 = new Usuario(null, "Antônia", "antonia@gmail.com", "321321321", "12345678");
		
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
	}
	
	
}
