package sic.gov.sic_encuesta.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.domain.service.SurvayService;

import java.util.List;

@RestController
@RequestMapping("/survay")
public class SurvayController {
    @Autowired
    private SurvayService survayService;

    @GetMapping("/all")
    public ResponseEntity getAll() {
        return new ResponseEntity<>(survayService.getAll(), HttpStatus.OK) ;
    }

    @GetMapping("/results")
    public ResponseEntity getResults() {
        return new ResponseEntity<>(survayService.getResults(), HttpStatus.OK) ;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Survay survay) {
        return  new ResponseEntity<>(survayService.save(survay), HttpStatus.OK) ;
    }
}