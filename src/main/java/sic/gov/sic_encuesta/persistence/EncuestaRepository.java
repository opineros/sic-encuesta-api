package sic.gov.sic_encuesta.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.domain.repository.ISurvayRepository;
import sic.gov.sic_encuesta.persistence.crud.IEncuestaCrudRepository;
import sic.gov.sic_encuesta.persistence.entity.Encuesta;
import sic.gov.sic_encuesta.persistence.mapper.SurvayMapper;
import sic.gov.sic_encuesta.persistence.projection.ResultSurvay;

import java.util.List;

@Repository
public class EncuestaRepository  implements ISurvayRepository {
    @Autowired
    private IEncuestaCrudRepository iEncuestaCrudRepository;
    @Autowired
    SurvayMapper mapper;

    @Override
    public List<Survay> getAll() {
        List<Encuesta> encuestas = (List<Encuesta>) iEncuestaCrudRepository.findAll();
        return mapper.toSurveys(encuestas);
    }

    @Override
    public List<ResultSurvay> getResults() {
        List<ResultSurvay> resultSurvays = iEncuestaCrudRepository.getResults();
        return resultSurvays;
    }

    @Override
    public Survay save(Survay survay) {
        Encuesta encuesta = mapper.toEncuesta(survay);
        return mapper.toSurvay(iEncuestaCrudRepository.save(encuesta));
    }
}
