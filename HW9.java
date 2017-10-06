import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();

        System.out.println(Math.round(d/600f*10)/10f);
    }
}
