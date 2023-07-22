package dayFive153;
import java.util.Scanner;

public class Homework03 {
    //判断一个年份是否为闰年
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = myScanner.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
