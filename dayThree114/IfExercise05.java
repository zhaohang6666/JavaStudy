package dayThree114;
import java.util.Scanner;

public class IfExercise05 {
    public static void main(String[] args) {
        //参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰，并且根据性别提示进入男子组或女子组。
        // 【可以让学院先练习一下】，输入成绩和性别，进行判断和输出信息。
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入歌手的成绩");
        double score =myScanner.nextDouble();
        if(score > 8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("进入男子组");
            }else if(gender == '女'){
                System.out.println("进入女子组");
            }else{
                System.out.println("你的性别有误，不能参赛");
            }
        }else{
            System.out.println("sorry,你被淘汰了");
        }
    }
}