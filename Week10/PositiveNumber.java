package Week10;
public class PositiveNumber {
    public static void main(String[] args) {
        int number = 55;
        // ตรวจสอบจำนวนเต็มบวก
        if (number > 0) {
            System.out.println("เป็นจำนวนเต็มบวก");
        }
        // ตรวจสอบจำนวนเต็มลบ
        else if (number < 0) {
            System.out.println("เป็นจำนวนเต็มลบ");
        }
        // ตรวจสอบจำนวนเต็มศูณย์
        else if (number == 0) {
            System.out.println("เป็นจำนวนเต็มลบ");
        }
    }
}
