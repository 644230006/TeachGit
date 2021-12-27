package Week14;

public class Array_looptest2 {
    public static void main(String[] args) {
        int [] m = new int[1000];
        int number = 1;
        for (int i = 0; i < m.length; i++) {
            m[i] = number;
            number = number+1;
        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
          System.out.print(m[i] + " ");
        }

    }
}
