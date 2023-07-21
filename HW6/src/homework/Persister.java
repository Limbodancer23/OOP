package homework;

public class Persister extends Operation {

    protected void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
