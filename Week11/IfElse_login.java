package Week11;

import java.util.Scanner;

public class IfElse_login {
    public static void main(String[] args) {
        String username_db = "admin";
        String password_db = "123";

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = kb.nextLine();
        System.out.print("Enter Password : ");
        String password = kb.nextLine();

        if ((username.equals(username_db)) && (password.equals(password_db))) {
            System.out.println("You are Login");
        } else {
            System.out.println("You are not Admin");
        }
        kb.close();
    }
}
