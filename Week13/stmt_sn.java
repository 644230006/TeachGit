package Week13;

public class stmt_sn {
    public static void main(String[]args) {
        String fullname = "นาย ขจรศักดิ์ ผักใบเขียว";

        //.starseith()
        fullname.startsWith(fullname);
        boolean result = fullname.startsWith("นาย");

        if (result) {
            System.out.println(fullname + "เป็นเพศชาย");
        } else {
            System.out.println(fullname + "เป็นเพศหญิง");
        }


        //หาตำแหน่งของตำแหน่งจากด้านหลัง .endwish()
        String code = "356278TH";
        code.endsWith("TH");
        Boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้ารหัส " + code +" มาจากประเทศไทย");
        } else {
            System.out.println("สินค้ารหัส " + code +" ไม่ได้มาจากประเทศไทย");
        }


    }
}
