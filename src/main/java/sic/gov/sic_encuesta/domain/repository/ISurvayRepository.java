package sic.gov.sic_encuesta.domain.repository;

import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.persistence.projection.ResultSurvay;

import java.util.List;

public interface ISurvayRepository {
    List<Survay> getAll();
    List<ResultSurvay> getResults() ;
    Survay save(Survay survay);
}
