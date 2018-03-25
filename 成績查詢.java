import java.util.Scanner;

public class 成績查詢 {

    public static void main(String[] args) {
        System.out.println("1查某位同學 問第N位");
        System.out.println("2查全部");
        System.out.println("3查某科目平均--1:英文2:國文3:數學");
        System.out.println("4查某同學的總分與平均 問第N位同學");
        student stu[]=new student[5];
         stu [0] =new student("jack","女","財金",90,60,70);
         stu [1] =new student("huan","男","資工",65,80,60);
         stu [2] =new student("wall","男","財法",80,70,90);
         stu [3] =new student("hani","女","護理",99,99,99);
         stu [4] =new student("suna","女","生科",85,65,70);
        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        if (a==1){
            System.out.println("哪位");
            int b =scn.nextInt();
            if (b>5){
                System.out.println("no man");
            }
            else {
                System.out.println("姓名"+"\t"+"性別"+"\t"+"系所"+"\t"+"英文"+"\t"+"國文"+"\t"+"數學");
                stu[b].showinto();

            }
        }
        else if (a==2){
            System.out.println("姓名"+"\t"+"性別"+"\t"+"系所"+"\t"+"英文"+"\t"+"國文"+"\t"+"數學");
            stu[0].showinto();
            stu[1].showinto();
            stu[2].showinto();
            stu[3].showinto();
            stu[4].showinto();
        }
        else if (a==3){
            System.out.println("哪一科 1英文2國文3數學");
            int c =scn.nextInt();
            if (c==1){
                System.out.println("英文平均:"+(stu[0].getEnglish()+stu[1].getEnglish()+stu[2].getEnglish()+stu[3].getEnglish()+stu[4].getEnglish())/5);
            }
            if (c==2){
                System.out.println("國文平均:"+(stu[0].getChinese()+stu[1].getChinese()+stu[2].getChinese()+stu[3].getChinese()+stu[4].getChinese())/5);
            }
            if (c==3){
                System.out.println("數學平均:"+(stu[0].getMath()+stu[1].getMath()+stu[2].getMath()+stu[3].getMath()+stu[4].getMath())/5);
            }
        }
        else if (a==4){
            int d =scn.nextInt();
            System.out.println("總分:"+(stu[d].getEnglish()+stu[d].getChinese()+stu[d].getMath())+"\t"+"平均:"+(stu[d].getEnglish()+stu[d].getChinese()+stu[d].getMath())/3);
        }
    }
}
