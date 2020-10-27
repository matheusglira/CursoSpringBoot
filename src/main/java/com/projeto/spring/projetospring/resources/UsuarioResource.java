package com.projeto.spring.projetospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.projetospring.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> listarTodos(){
		Usuario u = new Usuario(1L, "Carlos", "carlos@gmail.com", "123123123", "12345678");
		
		return ResponseEntity.ok().body(u);
	}
}
