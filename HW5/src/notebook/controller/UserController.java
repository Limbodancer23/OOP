package notebook.controller;

import notebook.model.User;
import notebook.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User, Long, String> repository;

    public UserController(GBRepository<User, Long, String> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

    public List<User> readAllUser() {
        return repository.findAll();
    }

    public void updateUser(Long id , User user) {
        {
            try {
                user.setId(id);
                repository.update(id, user);
                System.out.println("Contact updated!");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public User deleteUser(long id) {
        List<User> users = repository.findAll();
        for (User user : users) {
                if (Objects.equals(user.getId(), id)) {
                    users.remove(user);
                    System.out.println("Contact deleted");
                    repository.delete(users);
                    return user;
                }
        }
        throw new RuntimeException("User not found");
    }
}
