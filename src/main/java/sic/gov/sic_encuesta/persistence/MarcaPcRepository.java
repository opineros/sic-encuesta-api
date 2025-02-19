package sic.gov.sic_encuesta.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sic.gov.sic_encuesta.domain.PcBrand;
import sic.gov.sic_encuesta.domain.repository.PcBrandRepository;
import sic.gov.sic_encuesta.persistence.crud.IMarcaPcCrudRepository;
import sic.gov.sic_encuesta.persistence.entity.MarcaPc;
import sic.gov.sic_encuesta.persistence.mapper.PcBrandMapper;

import java.util.List;

@Repository
public class MarcaPcRepository implements PcBrandRepository {
    @Autowired
    private IMarcaPcCrudRepository iMarcaPcCrudRepository;
    @Autowired
    PcBrandMapper mapper;

    @Override
    public List<PcBrand> getAll() {
        List<MarcaPc> marcaPcs = (List<MarcaPc>) iMarcaPcCrudRepository.findAll();
        return mapper.toPcBrands(marcaPcs);
    }
}
