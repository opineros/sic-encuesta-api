package sic.gov.sic_encuesta.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sic.gov.sic_encuesta.domain.PcBrand;
import sic.gov.sic_encuesta.domain.repository.PcBrandRepository;

import java.util.List;

@Service
public class PcBrandService {
    @Autowired
    private PcBrandRepository pcBrandRepository;

    public List<PcBrand> getAll(){
        return pcBrandRepository.getAll();
    }
}
