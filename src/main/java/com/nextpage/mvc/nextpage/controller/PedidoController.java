package com.nextpage.mvc.nextpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nextpage.mvc.nextpage.dto.RequisicaoNovoPedido;
import com.nextpage.mvc.nextpage.model.Pedido;
import com.nextpage.mvc.nextpage.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoPedido requisicao) {
		try {
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		return "home";
		} catch( Exception e) {
			System.out.println(e);
			
		}
		return "home";
	}
	
}
