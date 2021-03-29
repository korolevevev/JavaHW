package project.spring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name = "clients")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;

    private String fname, lname, login,  otchestvo, bday, startDate, updDate ;

    public Client(String fname, String lname, String login,
                  String otchestvo, String bday, String startDate, String updDate ) {
        this.fname = fname;
        this.lname = lname;
        this.login = login;
        this.otchestvo = otchestvo;
        this.bday = bday;
        this.startDate = startDate;
    }

    public Client(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }

    public String getfname() {
        return fname;
    }
    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getotchestvo() {
        return otchestvo;
    }
    public void setotchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getbday() {
        return bday;
    }
    public void setbday(String bday) {
        this.bday = bday;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", task=" + task +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", login='" + login + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", bday='" + bday + '\'' +
                ", startDate='" + startDate + '\'' +
                ", updDate='" + updDate + '\'' +
                '}';
    }
}
