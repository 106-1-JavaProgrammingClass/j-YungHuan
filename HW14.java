import java.util.Scanner;

public class HW14 {
    public static void main(String[]age) {
        Scanner scn = new Scanner(System.in);
        char v1 = scn.next().charAt(0);
        int c1 = (int) v1;
        System.out.println(Integer.toHexString(c1));
    }
}