package daySix170;
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args){
        //原始数组使用静态分配int[] arr={1,2,3}
        //增加的元素，直接放在数组的最后 arr = {1，2，3，4}
        //用户可以通过下面方法决定是否继续添加，添加成功，是否继续？y/n

        /*
        分析：
        1.定义初始数组   int [] arr = {1,2,3};//下标为0-2
        2.定义一个新数组 int [] arrNew = new  int[arr.length + 1];
        3.遍历 arr 数组，依次将arr的元素拷贝到arrNew数组
        4.将4 赋给  arrNew[arrNew.length -1] = 4;4赋给最后一个元素
        5.将arr 指向 arrNew ; arr = arrNew ; 原数组arr就被销毁
        6.创建一个Scanner可以接受用户输入
        70因为用户什么时候退出不确定，用do-while + break来控制
         */
        Scanner myScanner = new Scanner(System.in);
        int [] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];

            }
            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
            System.out.println("是否继续添加 y/n");
            char key = myScanner.next().charAt(0);
            if(key == 'n'){
                break;
            }
        }while(true);

    }
}
