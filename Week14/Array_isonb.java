package Week14;

public class Array_isonb {
    public static void main(String[] args) {
      int  [] x = new int [10];
      for (int i = 0; i < x.length; i++) {
          System.out.print(x[i]+ " ");
      }
      int number = 1;
      for (int i = 0; i < x.length; i++) {
          x[i] = number;
          number = number+2;
      }
      System.out.println();
      for (int i = 0; i < x.length; i++) {
        System.out.print(x[i] + " ");
      }
    }
}
