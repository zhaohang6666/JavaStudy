package daySeven189;

public class Homework06 {
    public static void main(String[] args) {
        //冒泡排序
        //从小到大
        int[] arr = {20,-1,89,2,890,7};

        int temp = 0;
        for(int i = 0; i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("====排序后====");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +  "\t");
        }
    }
}
