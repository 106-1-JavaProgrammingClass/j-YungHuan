import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char asd =scn.next().charAt(0);
        char zxc =scn.next().charAt(0);
        System.out.println(str.replace(asd,zxc));


    }
}
