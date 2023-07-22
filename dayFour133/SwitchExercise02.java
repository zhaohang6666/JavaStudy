package dayFour133;
import java.util.Scanner;

public class SwitchExercise02 {
    public static void main(String[] args){
        //根据用于指定月份，打印该月份所属的季节。3，4，5春季6，7，8夏季9，10，11秋季12.1.2冬季
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default :
                System.out.println("你输入的数值有误，请在[1-12]之间输入一个值");
        }

    }
}
