package com.nextpage.mvc.nextpage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/oi")
	public String Hello(HttpServletRequest request) {
	  //variavel . metodo ("atributo", "valor")
		request.setAttribute("nome", "Juan");
		return "Hello";
	}
}
