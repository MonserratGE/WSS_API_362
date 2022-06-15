package com.wss.wss_api_362.service;

import com.generation.demo.model.Alumno;
import com.wss.wss_api_362.model.NivelStock;
import com.wss.wss_api_362.repository.NivelStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class NivelStockServiceImp implements NivelStockService {

	NivelStockRepository nivelStockRepository;
	
	public NivelStockServiceImp(@Autowired NivelStockRepository nivelStockRepository) {
		this.nivelStockRepository = nivelStockRepository;
	}

	@Override
	public NivelStock getNivelStock(Integer id) {
		Optional<NivelStock> nivelStock = NivelStockRepository.findById(id);
		return nivelStock.orElse(null);
	}
	
	@Override
	public List<NivelStock> getNivelStock() {
		return NivelStockRepository.findAll();
	}

	@Override
	public NivelStock saveAlumno(NivelStock nivelStock) {
		return nivelStockRepository.save(nivelStock);
	}

	@Override
	public Boolean deleteNivelStock(Integer id) {
		try {
			nivelStockRepository.deleteById(id);
			return true;
		}catch(Exception err){
			return false;
		}
		
	}

	@Override
	public NivelStock updateNivelStock(NivelStock nivelStock) {
		return nivelStockRepository.save(nivelStock);
	}
}
