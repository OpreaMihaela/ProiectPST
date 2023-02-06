package com.example.pst.farmacie.farmacie.repository;

import com.example.pst.farmacie.farmacie.model.Produse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduseRepository extends CrudRepository<Produse,Integer> {

}
