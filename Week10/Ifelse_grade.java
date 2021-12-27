package Week10;

import java.util.Scanner;

public class Ifelse_grade {
    public static void main(String[] args) {
        Scanner  kb = new Scanner(System.in);

        System.out.println("Enter Score : ");
        int score = kb.nextInt();

        String result = "";
        String g = "Grade = ";
        if ((score >= 101)) {
            System.out.println("คะแนนเกิน 100 โปรดตรวจสอบใหม่");

        } else if (score >= 80) {
            result = "A";
            System.out.println(g + result);
        } else if (score >= 70) {
            result = "B";
            System.out.println(g + result);
        } else if (score >= 60) {
            result = "C";
            System.out.println(g + result);
        } else if (score >= 50) {
            result = "D";
            System.out.println(g + result);
        } else if (score >= 0) {
            result = "E";
            System.out.println(g + result);
        } else {
            result = "ไม่สามารถดำเนินการได้เนื่องจากคะแนนติดลบ";
            System.out.println(result);
        }

        kb.close();

    }
}