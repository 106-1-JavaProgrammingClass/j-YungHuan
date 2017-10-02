import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c1 = scn.nextInt();
        if(c1>=60){
            System.out.println("及格");
        }

        if(c1<60){
            System.out.println("NO PASS");

        }
    }
}
