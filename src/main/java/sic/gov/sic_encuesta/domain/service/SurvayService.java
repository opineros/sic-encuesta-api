package sic.gov.sic_encuesta.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.domain.repository.ISurvayRepository;
import sic.gov.sic_encuesta.persistence.projection.ResultSurvay;

import java.util.List;

@Service
public class SurvayService {
    @Autowired
    private ISurvayRepository iSurvayRepository;

    public List<Survay> getAll(){
        return iSurvayRepository.getAll();
    }

    public List<ResultSurvay> getResults(){
        return iSurvayRepository.getResults();
    }

    public Survay save(Survay survay){
        return iSurvayRepository.save(survay);
    }
}