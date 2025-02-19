package sic.gov.sic_encuesta.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sic.gov.sic_encuesta.domain.PcBrand;
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
}