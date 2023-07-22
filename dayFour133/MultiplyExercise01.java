package dayFour133;
import java.util.Scanner;
public class MultiplyExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //统计3个班的成绩情况，每个班有5名同学。
        //求出每个班的平均分 和 所有班级的平均分。
        //统计三个班及格人数，每个班有5名同学。
        double totalScore = 0;//三个班的总成绩
        int passNum = 0;//累计 及格人数
        int classNum = 3;
        int stuNum = 5;
        for (int i = 1; i <= classNum; i++) {

            double sum = 0;//一个班的总成绩
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请输入第" + i + "个班第" + j + "同学的成绩");
                double score = myScanner.nextDouble();
                if(score >= 60){
                    passNum++;
                }
                sum += score;
            }
            System.out.println("总分=" + sum + "平均分" + sum / stuNum);
            totalScore += sum;
        }
        System.out.println("三个班总分=" + totalScore + "平均分" + totalScore / (classNum * stuNum));
        System.out.println("及格人数=" + passNum);
    }
}
