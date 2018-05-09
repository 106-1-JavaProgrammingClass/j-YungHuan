import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum1 =0;
        int sum2 =0;
        int sum3 =0;
        for (int i=0;i<6;i++){
            int a =scn.nextInt();
            if (a>0){
                sum1=sum1+1;
            }
            else if (a==0){
                sum2=sum2+1;
            }
            else if (a<0){
                sum3=sum3+1;
            }
        }
        System.out.println("+="+sum1);
        System.out.println("0="+sum2);
        System.out.println("-="+sum3);
    }
}
