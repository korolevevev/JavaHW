import models.*;
import services.*;

public class Main {

    public static void main(String[] args) {

        Test_list list1 = new Test_list("AD");
        Test_list list2 = new Test_list("Tkinter");

        TestService testService = new TestService();
        Test_listService testListService = new Test_listService();
        testListService.saveTest_list(list1);
        testListService.saveTest_list(list2);

        QuestionService questionService = new QuestionService();
        Question q1 = new Question("Q1", 1, true);
        Question q2 = new Question("Q2", 2, true);
        Question q3 = new Question("Q3", 3, true);
        questionService.saveQuestion(q1);
        questionService.saveQuestion(q2);
        questionService.saveQuestion(q3);

        AnswerService answerService = new AnswerService();
        Answer a1 = new Answer("A1", true);
        Answer a2 = new Answer("A2", false);
        answerService.saveAnswer(a1);
        answerService.saveAnswer(a2);

        System.out.println(answerService.findAll());
        System.out.println(questionService.findQuestion(1));

        RoleService roleService = new RoleService();
        Role student = new Role("Student");
        Role teacher = new Role("Teacher");
        System.out.println(roleService.findAll());

        GroupService groupService = new GroupService();
        Student_answer studentAnswer = new Student_answer();

        UserService userService = new UserService();
        User user1 = new User("Королев", "Илья", "Алексеевич", "korolevevev", "123456");
        user1.setRole(student);

        User user2 = new User("Баротов", "Достонжон", "Нумонжонович", "dnbarotov", "123456");
        user2.setRole(teacher);

        userService.saveUser(user1);
        userService.saveUser(user2);

        System.out.println(userService.getTeachers());
        System.out.println(questionService.findAll());
        System.out.println(userService.getStudents());

    }
}
