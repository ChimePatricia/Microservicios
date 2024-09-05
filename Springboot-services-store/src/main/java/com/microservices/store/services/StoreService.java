package com.microservices.store.services;

import java.util.List;

import com.microservices.store.models.Store;

public interface StoreService {

	public List<Store> findAll();
	public Store findById(Long id, Integer cantidad);
}
