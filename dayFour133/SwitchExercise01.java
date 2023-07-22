package dayFour133;
import java.util.Scanner;

public class SwitchExercise01 {
    public static void main(String[] args){
        //使用switch把小写类型的char转换为大写（键盘输入）
        //只转换a，b，c，d，其他输出"other"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字母(a-d)");
        char c1 = myScanner.next().charAt(0);
        switch(c1){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default :
                System.out.println("other");
        }
        System.out.println("退出switc，继续执行程序");
        //对学生成绩大于60分的，输出"合格"。低于60分的输出"不合格"
        //输入的成绩不能大于100，提示 成绩/60
        //要求用switch
        System.out.println("请输入成绩");
        double score = myScanner.nextDouble();
        if(score >= 0 && score <= 100){
            switch((int)(score / 60)){
                case 1 :
                    System.out.println("合格");
                    break;
                case 0 :
                    System.out.println("不合格");
                    break;
            }
        }else{
            System.out.println("输入成绩范围在（0-100），请重新输入");
        }
    }

}
