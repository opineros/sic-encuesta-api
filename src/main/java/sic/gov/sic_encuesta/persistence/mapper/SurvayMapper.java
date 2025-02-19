package sic.gov.sic_encuesta.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import sic.gov.sic_encuesta.domain.PcBrand;
import sic.gov.sic_encuesta.domain.Survay;
import sic.gov.sic_encuesta.persistence.entity.Encuesta;
import sic.gov.sic_encuesta.persistence.entity.MarcaPc;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PcBrandMapper.class})
public interface SurvayMapper {
    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "fechaRegistro", target = "registrationDate"),
            @Mapping(source = "idMarcaPc", target = "pcBrand"),
    })
    Survay toSurvay(Encuesta encuesta);
    List<Survay> toSurveys(List<Encuesta> encuesta);

    @InheritInverseConfiguration
    Encuesta toEncuesta(Survay survay);
}