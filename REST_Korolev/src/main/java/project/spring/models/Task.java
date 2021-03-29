package project.spring.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonManagedReference
    @OneToOne(mappedBy = "task")
    private Client client;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)


    private Set<Cat> categories;


    private String name, description, dcom, category, startDate, updDate;
    private boolean performed;

    public Task(String name, String description, String dcom, String category, boolean performed,
                String startDate, String updDate){
        this.name = name;
        this.description = description;
        this.dcom = dcom;
        this.category = category;
        this.performed = performed;
        this.startDate = startDate;
    }

    public Task(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getdcom() {
        return dcom;
    }
    public void setdcom(String dcom) {
        this.dcom = dcom;
    }
    public String getCategory() {
        return category;
    }
    public void setCategories(Set<Cat> categories) {
        this.categories = categories;
    }
    public boolean isPerformed() {
        return performed;
    }
    public void setPerformed(boolean performed) {
        this.performed = performed;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", client=" + client +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dcom='" + dcom + '\'' +
                ", category='" + category + '\'' +
                ", performed=" + performed +
                '}';
    }
}
