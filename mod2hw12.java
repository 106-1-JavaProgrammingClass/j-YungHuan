import java.util.Scanner;

public class mod2hw12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0;
        for (int i = 1 ;i<=a; i++){
            if (a%i==0){
                sum = sum+1;
            }
        }
        if (sum>2){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
