package daySix170;

public class ArrayExercise02 {
    public static void main(String[] args) {
        //求出一个数组int[]的最大值{4，-1，9，10，23}，并得到对应的下标
        int [] num = {4,-1,9,10,23};
        int max = num[0];
        int maxIndex = 0;
        for(int i = 1;i < num.length;i++){
            if(max < num[i]){
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println("max=" + max + "maxIndex=" + maxIndex);

    }
}
