package Week13;

public class Stmt {
    public static void main(String[] args) {
        String name = "JARAT";  
        String city = new String ("SAMUTSAKORN");

        System.out.println(name);
        System.out.println(city);
        
        //การต่อ String conctatenation

        System.out.println(name + city);


        String result = name + city;
        System.out.println(result);


        String result1 = name + city + ".com";
        System.out.println(result1);


        //concat


        System.out.println(result1.concat(".ac.th"));
        System.out.println(result1 + ".ac.th");


        //ความยาวสติง .length()

        System.out.println(name.length());


        int count = name.length();
        System.out.println(count);


        //หาตำแหน่งตัวอักษรในข้อความ  .charAt()


        System.out.println(name.charAt(3));


        Character characters = name.charAt(3);
        System.out.println(characters);
    }

}
