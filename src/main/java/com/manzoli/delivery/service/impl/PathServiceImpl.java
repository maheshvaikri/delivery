package com.manzoli.delivery.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manzoli.delivery.domain.City;
import com.manzoli.delivery.domain.Path;
import com.manzoli.delivery.domain.repository.PathRepository;

/**
 * Provided services for Pathrepository
 *  
 * @author josemanzoli
 * 
 */
@Service
@Transactional
public class PathServiceImpl {
	
	@Autowired
	private PathRepository pathRepository;

	@Transactional
	public Path savePath(Path path){
		return pathRepository.save(path);
	}
	
	public Set<Path> findAllByCity(City from){
		return pathRepository.findAllByFrom(from);
	}
}
