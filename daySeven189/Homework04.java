package daySeven189;

public class Homework04 {
    public static void main(String[] args) {
        /*
        随机生成10个整数(1-100的范围)保存到数组
        并倒序打印以及求平均值、求最大值和最大值的下标
        并查找里面是否有8
         */
     int[] arr = new int[10];

     for(int i = 0;i < arr.length;i++){
         arr[i] = (int)(Math.random() * 100) + 1;
     }
     System.out.println("====arr元素的情况====");
     for(int i = 0;i < arr.length;i++){
         System.out.println(arr[i] + "\t");
     }
     System.out.println("====arr元素的情况（倒序）");
     for(int i = arr.length - 1;i >= 0;i--){
         System.out.println(arr[i] + "\t");
     }
     double sum = arr[0];
     int max = arr[0];
     int maxIndex = 0;
     for(int i = 1;i < arr.length;i++){

         sum += arr[i];

         if(max < arr[i]){
             max = arr[i];
             maxIndex = i;
         }
     }
     System.out.println("\nmax=" + max +  "\nmaxIndex=" + maxIndex);
     System.out.println("sum=" + sum);


     int findNum = 8;
     int index = -1;
     for(int i = 0;i < arr.length;i++){
         if(findNum == arr[i]){
             System.out.println("找到数" + findNum + "下标=" + i);
             index = i;
             break;
         }
     }
        if(index == -1){
            System.out.println("没有找到数字" + findNum);
        }



    }
}
