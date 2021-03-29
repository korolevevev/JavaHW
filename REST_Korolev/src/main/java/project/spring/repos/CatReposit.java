package project.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.spring.models.Cat;

public interface CatReposit extends JpaRepository<Cat, Long> {
}
