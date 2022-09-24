package com.nextpage.mvc.nextpage.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nextpage.mvc.nextpage.model.Pedido;
import com.nextpage.mvc.nextpage.repository.PedidoRepository;

@Controller
public class HomeController {
		
	//Spring quero uma instancia disto aqui ok...
	@Autowired
		private PedidoRepository pedidorepository;
	
	@GetMapping("/home")
		public String home(Model model) {
		
				
		//List<Pedido> pedidos = repository.recuperaTodosOsPedidos();
		List<Pedido> pedidos = pedidorepository.findAll();
		model.addAttribute("pedidos",pedidos);
		
		//retorna  view home.html
		return "home";
	}
}











