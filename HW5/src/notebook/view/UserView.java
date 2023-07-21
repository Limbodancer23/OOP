package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.repository.impl.UserRepository;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Scan scan = new Scan();
        Commands com;

        while (true) {
            System.out.print("-----------------------------------------------------\n" +
                    "1)CREATE\n2)READ\n3)LIST\n4)UPDATE\n5)DELETE\n6)NONE\n7)EXIT\n");
            String command = scan.prompt("Введите команду: ");
            com = Commands.valueOf(command);
            System.out.println("---------------------------------------------------");
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = scan.prompt("Имя: ");
                    String lastName = scan.prompt("Фамилия: ");
                    String phone = scan.prompt("Номер телефона: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = scan.prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUser();
                        for (User user: users) {
                            System.out.println(user);
                        }
                    }catch (Exception e){
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        Long userid = Long.parseLong(scan.prompt("Идентификатор пользователя: "));
                        String uName = scan.prompt("Enter user name: ");
                        String ULastName = scan.prompt("Enter user last name: ");
                        String UPhoneNum = scan.prompt("Enter user phone number: ");
                        User newUser = new User(uName, ULastName, UPhoneNum);
                        userController.updateUser(userid, newUser);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case DELETE:
                    String iduser = scan.prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.deleteUser(Long.parseLong(iduser));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case NONE:
                    System.out.println("Waiting...");
            }
        }
    }
}
