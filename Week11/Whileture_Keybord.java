package Week11;

import java.util.Scanner;

public class Whileture_Keybord {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number : ");
            int number = kb.nextInt();

            if (number == 0) {
                break;
            }
            
        }
        kb.close();
    }

    
}
