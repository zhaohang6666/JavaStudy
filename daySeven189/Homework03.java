package daySeven189;

public class Homework03 {
    public static void main(String[] args) {
        //已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：
        //{10,12,45,90},添加23后，数组为{10,12,23,45,90}
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;//index就是要差于的位置

        //遍历 arr数组，如果发现insertNum<=arr[i],说明i就是要插入的位置
        //使用index保留index= i；
        //如果遍历完后，没有发现insertNum<=arr[i],说明index = arr.length
        //即： 添加到arr的最后
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
            if (index == -1) {
                index = arr.length;
            }
        }
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr[j];
                j++;
            }else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        System.out.println("====插入后，arr数组的元素情况====");
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i] +"\t");
        }
    }
}
