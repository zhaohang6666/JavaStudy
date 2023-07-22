package daySeven189;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
    /*
    请用二维数组输出如下图形
      0 0 0 0 0 0
      0 0 1 0 0 0
      0 2 0 3 0 0
      0 0 0 0 0 0
     */
        //1.定义上看int[][]
        //2.可以这样理解，原来的一维数组的每个元素是一维数组
        int[][] arr = {{0, 0, 0, 0, 0, 0},
                       {0, 0, 1, 0, 0, 0},
                       {0, 2, 0, 3, 0, 0},
                       {0, 0, 0, 0, 0, 0}};
        System.out.println("二维数组的元素个数=" + arr.length);
        //输出二维图形
        for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
            //遍历二维数组的每个元素
            for(int j = 0; j < arr[i].length; j++){//arr[i].length 得到对应每个一维数组的长度
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();//换行

        }
    }
}
