package com.example.pst.farmacie.farmacie.repository;

import com.example.pst.farmacie.farmacie.model.Stocul;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoculRepository extends CrudRepository<Stocul,Integer> {
}
