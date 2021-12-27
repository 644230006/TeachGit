package Week11;

public class While_True {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("รอบที่ "+count+" Java");
            count++;
            if (count == 1000) {
                break;
            }
        }
    }
}
