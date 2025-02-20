package sic.gov.sic_encuesta.domain.service;

import org.springframework.stereotype.Service;
import sic.gov.sic_encuesta.persistence.crud.UserRepository;
import sic.gov.sic_encuesta.persistence.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}