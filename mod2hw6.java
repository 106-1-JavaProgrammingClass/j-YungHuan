import java.util.Scanner;

public class mod2hw6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 0 ; i<n; i++){
            int a = scn.nextInt();
            sum = sum+a;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}
