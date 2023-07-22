package dayFour133;
import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        //如果李三不还钱，则老韩将使出五连鞭，直到李三说出还钱为止
       Scanner myScanner = new Scanner(System.in);
       char answer = ' ';
        do {
            System.out.println("使出五连鞭");
            System.out.println("还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("回答是" + answer);
        }while(answer != 'y');


    }
}
