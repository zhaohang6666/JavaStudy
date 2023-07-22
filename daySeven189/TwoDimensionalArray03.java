package daySeven189;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        /*
        按需求：动态创建下面二维数组，并输出
        i = 0:  1
        i = 1:  2 2
        i = 2:  3 3 3
         */
        int[][] arr = new int[3][];
        for(int i = 0; i < arr.length;i++){//遍历每个一维数组
            //给每个一维数组开空间new
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++){//遍历一维数组，并给每个一维数组的每个元素赋值
                arr[i][j] = i + 1;
            }
        }
        System.out.println("====arr元素====");
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
