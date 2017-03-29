package br.fpu.taw.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.fpu.taw.controller.model.Mensagem;

@RestController
public class MensagemController {
    private final AtomicLong contador = new AtomicLong();
    
	@RequestMapping("/mensagem")
	public Mensagem ola(@RequestParam(value="texto")	String texto) {
		return new Mensagem(contador.get(), texto);
	}
}
