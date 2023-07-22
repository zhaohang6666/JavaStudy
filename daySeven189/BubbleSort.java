package daySeven189;

public class BubbleSort {
    public static void main(String[] args) {
        //数组{24，69，80，57，13}
        //第一轮排序：目标把最大数放在最后
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
                System.out.println("第" + (j + 1) + "轮");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + "\t");
                }
            }
        }
    }
