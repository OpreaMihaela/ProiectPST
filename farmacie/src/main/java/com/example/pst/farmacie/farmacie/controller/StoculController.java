package com.example.pst.farmacie.farmacie.controller;


import com.example.pst.farmacie.farmacie.model.Stocul;
import com.example.pst.farmacie.farmacie.service.StoculService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocul")
public class StoculController {
    private StoculService stoculService;

    public StoculController(StoculService stoculService) {
        this.stoculService = stoculService;
    }

    @GetMapping
    public List<Stocul> getAllStocul() {
        return stoculService.getAllStocul();
    }

    @GetMapping("/{id}")
    public Stocul getStocul(@PathVariable("id") int id) {
        return stoculService.getStocul(id);
    }

    @PostMapping
    public Stocul saveStocul(@RequestBody Stocul stocul) {
        return stoculService.saveStocul(stocul);
    }

    @PutMapping("/{id}")
    public Stocul updateStocul(@PathVariable("id") int id, @RequestBody Stocul stocul) {
        stocul.setStoculId(id);
        return stoculService.saveStocul(stocul);
    }

    @PatchMapping("/{id}")
    public Stocul updatePatchStocul(@PathVariable("id") int id, @RequestBody Stocul stocul) {
        Stocul newStocul = stoculService.getStocul(id);
        newStocul.setStoculId(id);


        return stoculService.saveStocul(newStocul);
    }

    @DeleteMapping
    public Stocul deleteAllStocul() {
        return stoculService.deleteAllStocul();
    }

    @DeleteMapping("/{id}")
    public Stocul deleteStocul(@PathVariable("id") int id) {
        return stoculService.deleteStocul(id);
    }
}
