package daySix170;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        //循环输入5个成绩，保存到double数组，并输出

        //（1）第一种动态分配方式
        //double scores [] = new double[5];
        //(2)第二种动态分配方式2,5,6,7,8,89,90,34,56
        //（3）第三种静态初始化：
        /*
        int[]={2,5,6,7,8,89,90,34,56},如果知道数组有z多少元素，具体值
        上面用法相当于：int a [] = new int[9];
                     a[0]=2;a[1]=5;a[2]=6;a[3]=7;a[4]=8;a[5]=89;
                     a[6]=90;a[7]=34;a[8]=5;6
         */
        double scores [];
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for(int i =0; i < scores.length; i++ ){//scores.length 表示数组长度/大小
            System.out.println("请输入第" + (i+1) +"个元素值");
            scores [i] = myScanner.nextDouble();
        }
        for(int i = 0; i < scores.length;i++){
            System.out.println("第" + (i + 1) + "个元素值=" + scores[i]);
        }

    }
}
