import java.util.Scanner;

public class mod2hw2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a%4==0){
            if (a%100==0){
                if (a%400==0){
                    System.out.println("Bissextile Year");
                }else{
                    System.out.println("Common Year");
                }
            }else{
                System.out.println("Bissextile Year");
            }
        }else{
            System.out.println("Common Year");
        }
    }
}
