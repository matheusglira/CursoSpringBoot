package com.projeto.spring.projetospring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.spring.projetospring.entities.Pedido;
import com.projeto.spring.projetospring.entities.Usuario;
import com.projeto.spring.projetospring.entities.enums.StatusPedido;
import com.projeto.spring.projetospring.repositories.PedidoRepository;
import com.projeto.spring.projetospring.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario1 = new Usuario(null, "Carlos", "carlos@gmail.com", "123123123", "123456");
		Usuario usuario2 = new Usuario(null, "Antônia", "antonia@gmail.com", "321321321", "12345678");
		
		Pedido pedido1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusPedido.AGUARDANDO_PAGAMENTO, usuario1); 
		Pedido pedido2 = new Pedido(null, Instant.parse("2012-06-20T19:53:07Z"), StatusPedido.PAGO, usuario2); 
		Pedido pedido3 = new Pedido(null, Instant.parse("2020-01-11T19:53:07Z"), StatusPedido.CANCELADO, usuario1); 
		
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
		pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2, pedido3));
		
	}
	
	
}
