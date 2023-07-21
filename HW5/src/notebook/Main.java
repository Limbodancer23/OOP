package notebook;
//Продолжить проект, "Записная книжка", содержащий работу с записями из консоли (можно прочитать все записи, создать одну запись, отредактировать запись,
//// удалить, и прочитать одну запись по ID), запись содержит в себе как минимум 3 поля Id, заголовок и текст, можно добавить дату.
//// Хранение по вашему выбору, можно в текстовом файле (или каждая запись в одном файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока.
//// Если все не успеете, то часть задания можно перенести на следующий урок.
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
