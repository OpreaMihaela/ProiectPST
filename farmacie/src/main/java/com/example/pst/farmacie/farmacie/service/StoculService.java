package com.example.pst.farmacie.farmacie.service;

import com.example.pst.farmacie.farmacie.model.Stocul;
import com.example.pst.farmacie.farmacie.repository.StoculRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoculService {
    private StoculRepository stoculRepository;

    public StoculService(StoculRepository stoculRepository){
        this.stoculRepository = stoculRepository;
    }

    public List<Stocul> getAllStocul(){
        List<Stocul> stoculList = new ArrayList<>();
        stoculRepository.findAll().forEach(x ->stoculList.add(x));
        return stoculList;
    }

    public Stocul getStocul(int id){
        return stoculRepository.findById(id).orElse(null);
    }

    public Stocul saveStocul(Stocul stocul){
        return stoculRepository.save(stocul);
    }

    public Stocul deleteAllStocul(){
        stoculRepository.deleteAll();
        return null;
    }

    public Stocul deleteStocul(int id){
        stoculRepository.deleteById(id);
        return null;
    }
}
