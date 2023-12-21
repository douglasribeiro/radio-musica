package com.douglas.developer.radio.musica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.developer.core.crud.CrudController;
import com.douglas.developer.core.crud.CrudService;
import com.douglas.developer.core.model.Musica;
import com.douglas.developer.radio.musica.service.MusicaService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/musicas")
@Slf4j
@CrossOrigin
@AllArgsConstructor
public class MusicaController extends CrudController<Musica, Long>{
	
	private final MusicaService musicaService;
	
	@Override
	public CrudService<Musica, Long> getService() {
		return musicaService;
	}
	
	@GetMapping("/status")
    public String status() {
    	log.info("Serviço musicas esta ok!");
    	return "Serviço musicas esta ok!";
    }
	
	@GetMapping({"/nome/{nome}"})
	public List<Musica> findByName(@PathVariable("nome") String nome) {
		log.info("Pesquisa musica por nome {}", nome);
		return musicaService.findByName(nome);
		
	}

}
