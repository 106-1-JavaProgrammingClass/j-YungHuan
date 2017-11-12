import java.util.Scanner;

public class mod2hw7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 1;
        for (int i = 1 ; i<=a;i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
