package dayThree114;
import java.util.Scanner;

public class IfExercise03 {

    public static void main(String[] args){
        /*
        输入保国同志的芝麻信用分：
        如果：
        信用分为100封面时。输出 信用极好；
        信用分为（80，99]时，输出 信用优秀；
        信用分为[60,80]，输出 信用一般；
        其他情况， 输出 信用不及格
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的信用分(1-100)");
        int grade = myScanner.nextInt();
        if(grade >= 1 && grade <= 100) {
            if (grade == 100) {
                System.out.println("信用极好");
            } else if (grade > 80 && grade <= 99) {
                System.out.println("信用优秀");
            } else if (grade >= 60 && grade <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else
            System.out.println("信用分需要在1-100，请重新输入：");
    }

}
