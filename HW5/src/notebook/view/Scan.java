package notebook.view;

import java.util.Scanner;

public class Scan {

    public String prompt(String message)  {
            Scanner in = new Scanner(System.in);
            System.out.print(message);
            return in.nextLine();
    }
}
