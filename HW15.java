import java.util.Scanner;

public class HW15 {
    public static void main(String[]age) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int qwe = Integer.valueOf(str, 16);
        System.out.println((char) qwe);
    }
}
