package daySix170;
import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        //有一个数组{1,2,3,4,5},可将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩下一个元素，提示，不能缩减
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        do{
            int[] arr2 = new int[arr.length - 1];
            for(int i = 0;i < arr2.length;i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            System.out.println("====缩减后的情况====");
            for(int i = 0;i <arr2.length;i++){
                System.out.println(arr2[i] + "\t");
            }
            System.out.println("====是否继续缩减y/n?====");
            char c1 = myScanner.next().charAt(0);
            if(c1 == 'n'){
                break;
            }
            if(arr2.length == 1){
                System.out.println("====当前只剩下一个元素不可再缩减");
                break;
            }
        }while (true);
    }
}