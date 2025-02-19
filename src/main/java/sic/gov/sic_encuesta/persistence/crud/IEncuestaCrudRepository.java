package sic.gov.sic_encuesta.persistence.crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sic.gov.sic_encuesta.persistence.entity.Encuesta;
import sic.gov.sic_encuesta.persistence.projection.ResultSurvay;

import java.util.List;

public interface IEncuestaCrudRepository extends CrudRepository<Encuesta, Integer>  {
    @Query(value = "SELECT mpc.nombre, COUNT(e.id_marca_pc) FROM public.encuesta e INNER JOIN marca_pc mpc on e.id_marca_pc = mpc.id_marca_pc GROUP BY mpc.nombre", nativeQuery = true)
    List<ResultSurvay> getResults();
}
