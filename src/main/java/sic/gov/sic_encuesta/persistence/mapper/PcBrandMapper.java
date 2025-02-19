package sic.gov.sic_encuesta.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import sic.gov.sic_encuesta.domain.PcBrand;
import sic.gov.sic_encuesta.persistence.entity.MarcaPc;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PcBrandMapper {
    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "active")
    })
    PcBrand toPcBrand(MarcaPc marcaPc);
    List<PcBrand> toPcBrands(List<MarcaPc> marcaPc);

    @InheritInverseConfiguration
    MarcaPc toMarcaPc(PcBrand pcBrand);
}
