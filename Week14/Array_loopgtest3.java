package Week14;

public class Array_loopgtest3 {
    public static void main(String[] args) {
        String [] name = {"นายสมชาย","นางสาวสมหญิง","นายสมบูรณ์","นางสาวสมนึก","นางสาวสมใจ"};
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " รายชื่อ");
        for (int i = 0; i < name.length; i++) {
            boolean chack = name[i].startsWith("นาย");
            if (chack) {
                System.out.println((i+1) +". "+ name[i] +" เข็มกลัด ===> เป็นเพศชาย"); 
                
            } else {
                
                System.out.println((i+1) +". "+ name[i] +" เข็มกลัด ===> เป็นเพศหญิง"); 
            }
    }
        }
}
