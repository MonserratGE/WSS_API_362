package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.NivelStock;
import com.wss.wss_api_362.repository.NivelStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NivelStockServiceImp implements NivelStockService {

	NivelStockRepository nivelStockRepository;
	
	public NivelStockServiceImp(@Autowired NivelStockRepository nivelStockRepository) {
		this.nivelStockRepository = nivelStockRepository;
	}

	@Override
	public NivelStock getNivelStockById(Integer id) {
		Optional<NivelStock> nivelStock = nivelStockRepository.findById(id);
		return nivelStock.orElse(null);
	}
/*

	@Override
	public List<NivelStock> getNivelStock() {
		return nivelStockRepository.findAll();
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
 */
}
