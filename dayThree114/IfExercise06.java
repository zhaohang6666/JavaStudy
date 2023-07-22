package dayThree114;
import java.util.Scanner;

public class IfExercise06 {
    public static void main(String[] args){
        //出票系统：根据淡旺季的月份和年龄，打印票价
        /*
        4-10旺季：
               成人(18-60):60
               儿童（<18）:半价
               老人（>60）:1/3
         淡季：
               成人：40
               其他：20
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        if(month >= 4 && month <=10){
            System.out.println("旺季");
            System.out.println("请输入年龄");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("成人票 60");
            }else if(age < 18){
                System.out.println("儿童票 半价");
            }else{
                System.out.println("老人票 1/3");
            }

        }else{
            System.out.println("淡季");
            System.out.println("请输入年龄");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("票价40");
            }else{
                System.out.println("票价20");
            }

        }

    }

}
