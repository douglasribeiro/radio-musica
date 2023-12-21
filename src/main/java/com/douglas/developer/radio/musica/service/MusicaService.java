package com.douglas.developer.radio.musica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.douglas.developer.core.crud.CrudService;
import com.douglas.developer.core.model.Album;
import com.douglas.developer.core.model.Musica;

@Service
public interface MusicaService extends CrudService<Musica, Long>{

	List<Musica> findByName(String name);
	
	void update(Long id, Musica musica);
	
}
