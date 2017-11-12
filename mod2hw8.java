import java.util.Scanner;

public class mod2hw8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sum1 = 1;
        int sum2 = 1;
        int sum3 = 1;
        for (int i = 1;i<=n;i++){
            sum1=sum1*i;
        }
        for (int i = 1;i<=m;i++){
            sum2=sum2*i;
        }
        for (int i = 1;i<=n-m;i++){
            sum3=sum3*i;
        }
        System.out.println(sum1/sum2/sum3);
    }
}
