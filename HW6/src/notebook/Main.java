package notebook;
//Реализуйте удаление пользователей. Поработать над проектом.
//        Вынести логику dao в нужный слой, а от слоя dao избавится
//        На выбор:
//        1)подумайте как оптимизировать код приложения (например, хэшировать все данные, а в файл писать только при выходе из приложения)
//        2) Дописать код для оставшихся команд в Commands
//        ИЛИ ВНЕСИТЕ СВОИ ИЗМЕНЕНИЯ В ПРОЕКТ, КОТОРЫЕ КАЖУТЬСЯ ЛОГИЧНЫМИ ВАМ.
//        Пржалуйста о том что изменили, напишите в комментариях(например в ридми)
import notebook.controller.UserController;
import notebook.model.User;
import notebook.repository.GBRepository;
import notebook.repository.impl.UserRepository;
import notebook.view.UserView;

import static notebook.util.DBConnector.DB_PATH;
import static notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository<User, Long, String> repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
