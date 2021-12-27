package Week13;

public class Stmt_tm {
    public static void main(String[] args) {
        String fullname = "   jarat subboorapakul   ";
        int count = fullname.length();
        System.out.println(count);
        System.out.println("Before =>" + fullname);
        // .trim() ตัดช่องว่าง
        String result = fullname.trim();
        System.out.println("After =>" + result);
        System.out.println(result.length());


        //.indexof()
        System.out.println(fullname.indexOf("ra"));
        System.out.println(fullname.indexOf("ra", 15));


        // .toUppercas() & .toLowercase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());


        // .supString()
        String uni = "Nakornpathum Rajaphat Univercity";
        System.out.println(uni.substring(6,10));

    }
}
