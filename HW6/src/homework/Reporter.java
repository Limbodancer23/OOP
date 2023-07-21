package homework;

public class Reporter extends Operation{

    protected void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
