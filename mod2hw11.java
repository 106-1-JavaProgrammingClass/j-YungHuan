import java.util.Scanner;

public class mod2hw11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum = 0;
        for (int i =0;i<str.length();i++){
            sum=sum+str.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
