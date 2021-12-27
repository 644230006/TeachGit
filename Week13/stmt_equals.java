package Week13;

public class stmt_equals {
    public static void main(String[] args) {
        String lastname = "Subboorapakul";
        String lastname2 = "subboorapakul";
        //เปรียบเทียบ 
        Boolean resualt = lastname.equals(lastname2);
        if (resualt) {
            System.out.println(lastname + " เท่ากับ " + lastname2);
        } else {
            System.out.println(lastname + " ไม่เท่ากับ " + lastname2);
        }
        // System.out.println(resualt);

        Boolean resualt2 = lastname.equalsIgnoreCase(lastname2);
        if (resualt2) {
            System.out.println(lastname + " เท่ากับ " + lastname2);
        } else {
            System.out.println(lastname + " ไม่เท่ากับ " + lastname2);
        }
    }
}
