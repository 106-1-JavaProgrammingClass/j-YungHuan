import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int v1 =scn.nextInt()%2;
        if(v1==1){
            System.out.println("奇數");}
        if (v1==0){System.out.println("偶數");
        }
    }
}
