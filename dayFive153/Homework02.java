package dayFive153;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        //实现判断一个整数，属于那个范围：大于0；小于0；等于0.
        Scanner myScanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数");
            int i =myScanner.nextInt();
            if(i > 0){
                System.out.println("大于0");
            } else if (i < 0) {
                System.out.println("小于0");
            }else {
                System.out.println("等于0");
            }
            break;
        }

    }
}
