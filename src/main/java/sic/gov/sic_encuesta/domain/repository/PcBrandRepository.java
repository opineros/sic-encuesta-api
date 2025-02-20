package sic.gov.sic_encuesta.domain.repository;

import sic.gov.sic_encuesta.domain.PcBrand;

import java.util.List;

public interface PcBrandRepository {
    PcBrand save(PcBrand pcBrand);
    List<PcBrand> getAll();
}
