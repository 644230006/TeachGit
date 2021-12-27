package Week14;

public class Array_loop {
    public static void main(String[] args) {
        String[] car = { "BENZ", "FORD", "HONDA", "BMW" };
        for (int i = 0; i < car.length; i++) {
            System.out.println("สามชิกตำแหน่งที่ " + i + " มีค่าเท่ากับ  " +  car[i]);
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println("สามชิกช่องที่ " + (i+1) + " มีค่าเท่ากับ  " +  car[i]);
        }
    }
}
