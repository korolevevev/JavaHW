package project.spring.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import project.spring.repos.*;
import project.spring.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/client")
public class Controller {

    private final CliReposit cliReposit;
    private final TaskReposit taskReposit;
    private final CatReposit catReposit;

    public Controller(CliReposit cliReposit, TaskReposit taskReposit, CatReposit catReposit) {
        this.cliReposit = cliReposit;
        this.taskReposit = taskReposit;
        this.catReposit = catReposit;

    }
    @PostMapping("/clients")
    Client createClient(@RequestParam String fname, @RequestParam String lname,
                        @RequestParam String login,  @RequestParam String otchestvo) {

        Date d = new Date();
        SimpleDateFormat date;
        SimpleDateFormat dprm;
        SimpleDateFormat dend;
        date = new SimpleDateFormat("01.03.2021 10:20");
        dprm = new SimpleDateFormat("10.03.2021 12:00");
        dend = new SimpleDateFormat("29.03.2021 08:30");

        date.format(d);
        dprm.format(d);
        dend.format(d);
        String bday = date.format(d);
        String dcom = date.format(d);
        String startDate = dprm.format(d);
        String dateupd = dend.format(d);

        Cat cat = new Cat("category", startDate, dateupd);
 
        Task  task = new Task("Task 1 example", "this is descr", dcom, "ctgr", true , startDate,dateupd);
        Client client = new Client(fname, lname, login, otchestvo, bday, startDate, dateupd);

        this.taskReposit.save(task);
        this.catReposit.save(cat);

        task.setClient(client);
        task.setCategories(Set<Cat> cat);
        client.setTask(task);

        return this.cliReposit.save(client);

    }

    @GetMapping("/tasks/{id}")
    Task getTask(@PathVariable Long id){
        return this.taskReposit.findTasksById(id);
    }

    @GetMapping("/clients/all")
    List<Client> getClient(){
        return this.cliReposit.findAll();
    }

    @DeleteMapping("/clients")
    Client deleteClient(@RequestParam String fname,@RequestParam String lname ) {
        List<Client> findCli = this.cliReposit.findByFullName(fname, lname);
        Client findCli = findCli.get(findCli.size()-1);
        this.cliReposit.delete(findCli);
        return findCli;
    }

    @PutMapping("/clients/{id}")
    Client updateClient(@RequestBody Client client,   @PathVariable  Long id, @RequestBody String bday) {
        System.out.println(bday);
        Client client1 = cliReposit.findCliById(id);
        client1.setlname(client.getlname());
        final Client updatedOn = cliReposit.save(client1);
        return updatedOn;
    }




}

