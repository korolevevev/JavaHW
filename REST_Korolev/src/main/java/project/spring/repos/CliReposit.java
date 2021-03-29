package project.spring.repos;

import project.spring.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CliReposit extends JpaRepository<Client, Long> {

    Client findCliById (long id);

    List<Client> findByFullName(String fname, String lname);
}

