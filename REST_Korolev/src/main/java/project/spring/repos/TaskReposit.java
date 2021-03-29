package project.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import project.spring.models.Task;

public interface TaskReposit extends JpaRepository<Task, Long> {

    Task findTasksById (Long id);
}
