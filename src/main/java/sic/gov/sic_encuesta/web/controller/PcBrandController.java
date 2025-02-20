package sic.gov.sic_encuesta.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sic.gov.sic_encuesta.domain.PcBrand;
import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.domain.service.PcBrandService;

import java.util.List;

@RestController
@RequestMapping("/pcBrands")
public class PcBrandController {
    @Autowired
    private PcBrandService pcBrandService;

    @GetMapping("/all")
    public List<PcBrand> getAll() {
        return pcBrandService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody PcBrand pcBrand) {
        return new ResponseEntity<>(pcBrandService.save(pcBrand), HttpStatus.OK) ;
    }
}