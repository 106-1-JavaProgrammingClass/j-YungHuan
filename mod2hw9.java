import java.text.DecimalFormat;
import java.util.Scanner;

public class mod2hw9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        float d = scn.nextFloat();
        float e = scn.nextFloat();
        float f = scn.nextFloat();
        float g = scn.nextFloat();
        float h = scn.nextFloat();
        float i = scn.nextFloat();
        float j = scn.nextFloat();
        float sum1 =Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a,b),c),d),e),f),g),h),i),j);
        float sum2 =Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a,b),c),d),e),f),g),h),i),j);
        System.out.println(df.format(sum1));
        System.out.println(df.format(sum2));
    }

}
