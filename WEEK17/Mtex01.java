package WEEK17;

public class Mtex01 {
    public static void main(String[] args) {
        // ไม่มีค่าจาก mettoi และไ่ม่มีการส่งกลับ
        showname();
        Openfile();
        playfile();
        stopfile();
        playfile();
    }

    static void showname() {
        System.out.println("Jarat Suebboorapakul");
    }

    static void Openfile() {
        System.out.println("Openfile");
    }

    static void playfile() {
        System.out.println("playfile");
    }

    static void stopfile() {
        System.out.println("stopfile");
    }
    static void closefile() {
        System.out.println("Exitfile");
    }
}