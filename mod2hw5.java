import java.util.Scanner;

public class mod2hw5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sum = 0;
        for (int i = a ;i<=b; i++){
            if (i%c==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
