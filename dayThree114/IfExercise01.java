package dayThree114;
import java.util.Scanner;
public class IfExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        //使用if判断，输出相应信息
        if (age > 18) {
            System.out.println("你的年龄大于18岁，要对自己的行为负责，送入监狱");
        } else {
            System.out.println("你的年龄不大，这次放过你了");


        }

    }
}
