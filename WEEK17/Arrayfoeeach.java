package WEEK17;

public class Arrayfoeeach {
    public static void main(String[] args) {
        String [] name = {"นายสมชาย","นางสาวสมหญิง","นายสมบูรณ์","นางสาวสมนึก","นางสาวสมใจ"};
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " รายชื่อ");
        int i = 1;
        
        for (String showName : name) {
            System.out.println(i + " . " + showName);
            i++;
        }

        int [] number = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int n : number) {
            sum = sum+n;
        }
        System.out.println(sum);
        // for (int i = 0; i < name.length; i++) {
        //     boolean chack = name[i].startsWith("นาย");
            // if (chack) {
            //     System.out.println((i+1) +". "+ name[i] +" เข็มกลัด ===> เป็นเพศชาย"); 
                
            // } else {
                
            //     System.out.println((i+1) +". "+ name[i] +" เข็มกลัด ===> เป็นเพศหญิง"); 
            // }
    }
    }

