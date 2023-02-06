package com.example.pst.farmacie.farmacie.controller;

import com.example.pst.farmacie.farmacie.model.Produse;
import com.example.pst.farmacie.farmacie.service.ProduseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produse")
public class ProduseController {
    private ProduseService produseService;

    public ProduseController(ProduseService produseService) {
        this.produseService = produseService;
    }

    @GetMapping
    public List<Produse> getAllProduse(){
        return produseService.getAllProduse();
    }

    @GetMapping("/{id}")
    public Produse getProduse(@PathVariable("id") int id){
        return produseService.getProduse(id);
    }

    @PostMapping
    public Produse saveProduse(@RequestBody Produse produse){
        return produseService.saveProduse(produse);
    }

    @PutMapping("/{id}")
    public Produse updateProduse(@PathVariable("id") int id, @RequestBody Produse produse)
    {
        produse.setProduseId(id);
        return produseService.saveProduse(produse);
    }

    @PatchMapping("/{id}")
    public Produse updatePatchProduse(@PathVariable("id") int id, @RequestBody Produse produse){
        Produse newProduse = produseService.getProduse(id);
        newProduse.setProduseId(id);

        if(produse.getDenumire()!=null)
            newProduse.setDenumire(produse.getDenumire());
        if(produse.getPret()!=null)
            newProduse.setPret(produse.getPret());
        if(produse.getTip_produs()!=null)
            newProduse.setTip_produs(produse.getTip_produs());

        return produseService.saveProduse(newProduse);
    }

    @DeleteMapping
    public Produse deleteAllProduse(){
        return produseService.deleteAllProduse();
    }

    @DeleteMapping("/{id}")
    public Produse deleteProduse(@PathVariable("id")int id){
        return produseService.deleteProduse(id);
    }
}
