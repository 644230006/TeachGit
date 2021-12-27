package Week12;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("โปรมแกรมแปลงปี");
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("กด 1 เพื่อแปลงจาก พ.ศ เป็น ค.ศ");
            System.out.println("กด 2 เพื่อแปลงจาก ค.ศ เป็น พ.ศ");
            System.out.println("กด 0 เพื่อจบการทำงาน");
            System.out.println("โปรดเลือกเลข  : ");
            int number = kb.nextInt();
            if (number == 1) {
                while (true) {
                    System.out.println("ยินต้อนรับสู่การแปลงจาก พ.ศ เป็น ค.ศ");
                    System.out.println("กด 0 เพื่อจบการทำงาน");
                    System.out.println("กรุณากรอกปี พุทธศักราช");
                    int ps = kb.nextInt();
                    if (ps < 0) {
                        System.out.println("พุทธศักราชติดลบหรือเป็นศูนย์");
                    }
                    if (ps == 0) {
                        System.out.println("จบการทำงาน");
                        break;
                    } else {
                        System.out.println("ปีคริสต์ศักราช คือ " + (ps - 543));
                    }
                }
            }
            if (number == 2) {
                while (true) {
                    System.out.println("ยินต้อนรับสู่การแปลงจาก ค.ศ เป็น พ.ศ ");
                    System.out.println("กด 0 เพื่อจบการทำงาน");
                    System.out.println("กรุณากรอกปี คริสต์ศักราช");
                    int ks = kb.nextInt();
                    if (ks < 0) {
                        System.out.println("คริสต์ศักราชติดลบหรือเป็นศูนย์");

                    }
                    if (ks == 0) {
                        System.out.println("จบการทำงาน");
                        break;
                    } else {
                        System.out.println("ปีพุทธศักราช คือ " + (ks + 543));
                    }
                    
                }

            }
            if (number == 0) {
                break;
            } else {
                System.out.println("โปรดเลือกใหม่");
            }

        }

        kb.close();
    }

}
