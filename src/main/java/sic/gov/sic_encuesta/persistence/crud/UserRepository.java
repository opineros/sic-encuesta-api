package sic.gov.sic_encuesta.persistence.crud;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sic.gov.sic_encuesta.persistence.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}