package daySix170;

public class ArrayReverse {
    public static void main(String[] args){
        //把int[] arr = {11,22,33,44,55,66};数组进行翻转
        int[] arr = {11,22,33,44,55,66};
        int temp = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2;i++){
            temp = arr[len - 1 -i];
            arr[len -1 -i] = arr [i];
            arr [i] = temp;
        }
        System.out.println("====反转后的数组====");
        for(int i = 0;i < len;i++){
            System.out.println(arr[i] + "\t");
        }
    }
}
