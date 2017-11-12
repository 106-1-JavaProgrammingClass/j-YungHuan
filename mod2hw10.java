import java.util.Scanner;

public class mod2hw10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a = scn.nextInt();
        for (int i = 0 ;i<str.length();i++){
            int word = str.charAt(i)+a;
            System.out.print((char)word);
        }
        System.out.println();
    }
}
