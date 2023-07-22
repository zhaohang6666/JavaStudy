package dayThree114;
import java.util.Scanner;

public class IfExercise02 {
    Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args){

        //声明两个double型变量并赋值
        //判断第一个数大于10.0，且第二个数小于20.0，打印两数之和
        double d1 = 15.0;
        double d2 = 15.5;
        if(d1 > 10.0 && d2 <20.0){
            System.out.println("两数之和=" + (d1 + d2));
        }
        //定义两个变量int，判断二者的和
        //是否能被3整除又能被5整除，打印提示信息
        int num1 = 21;
        int num2 = 35;
        int num = num1 +num2;
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("可以被3和5整除");
        }else{
            System.out.println("不能被3和5整除");
        }
        //判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
        /*(1)年份能被4整除，但不能被100整除。
          （2）能被400整除。
         */
       int year = 2023;
       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
           System.out.println(year + "是 闰年");
       }else{
           System.out.println(year + "不是 闰年");
       }
    }
}
