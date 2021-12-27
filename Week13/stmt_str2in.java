package Week13;

public class stmt_str2in {
    public static void main(String[] args) {
        String s1 = "500";
        int num1 = 100;
        System.out.println(s1 + num1);

        //Integer.parseInt() แปลงเป้นตริงเป็นจำนวนจริง
        int num2 = Integer.parseInt(s1);
        
        System.out.println(num2 + num1);
    }
}
