package com.microservices.celulares.respository;

import org.springframework.data.repository.CrudRepository;
import com.microservices.celulares.entity.Celular;

public interface CelularDao extends CrudRepository<Celular, Long>{

}
