import java.util.Scanner;

public class HW12 {
    public static void main(String[] age) {
        Scanner scn = new Scanner(System.in);
        double z = scn.nextDouble();
        int x = scn.nextInt();
        System.out.println(Math.round(z*Math.pow(10,x))/Math.pow(10,x));
    }
}
