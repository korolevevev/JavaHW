import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        AutoService autoService = new AutoService();

        User user1 = new User("Ilya", 21);

        userService.saveUser(user1);

        Auto auto1 = new Auto("Maserati", "black");
        Auto auto2 = new Auto("Pontiac", "white");
        Auto auto3 = new Auto("BMW i8", "pink");

        user1.addAuto(auto1);
        userService.updateUser(user1);

        user1.addAuto(auto3);
        userService.updateUser(user1);
        System.out.println(userService.findAllUsers());

        userService.findUserById(1);

        System.out.println(userService.findAutosByUserId(18));

        System.out.println(autoService.findAllAutos());
        System.out.println(autoService.findUserByAutoId(3));
        System.out.println(autoService.findAutoById(2));


    }
}
