package com.wss.wss_api_362.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wss.wss_api_362.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Integer>{

	Compra save(Integer compra);

}
