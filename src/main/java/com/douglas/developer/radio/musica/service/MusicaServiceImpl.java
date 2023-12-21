package com.douglas.developer.radio.musica.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglas.developer.core.crud.CrudServiceImpl;
import com.douglas.developer.core.model.Interprete;
import com.douglas.developer.core.model.Musica;
import com.douglas.developer.core.repository.MusicaRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class MusicaServiceImpl extends CrudServiceImpl<Musica, Long> implements MusicaService{
	
	private final MusicaRepository musicaRepository;

    @Override
    protected JpaRepository<Musica, Long> getRepository() {
        return musicaRepository;
    }

    @Transactional(readOnly = true)
	@Override
	public List<Musica> findByName(String name) {
		return musicaRepository.findByNome(name);
	}
    
	@Transactional(readOnly = false)
	@Override
	public void update(Long id, Musica musica) {
		log.info("alteração em service.");
	}
	
	

}
