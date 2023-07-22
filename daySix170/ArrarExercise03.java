package daySix170;

public class ArrarExercise03 {
    public static void main(String[] args){
        //请求出一个数组的和 和 平均值
        double [] num = {5.5,6.6,90,80,60};
        double totalNum = 0;
        for(int i =0;i < num.length;i++){
            totalNum += i;
        }
        System.out.println("总和=" + totalNum + "平均值=" + totalNum / num.length );
    }
}
