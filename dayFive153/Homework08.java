package dayFive153;

public class Homework08 {
    public static void main(String[] args) {
        //求 1+(1+2)+(1+2+3)+(1+2+3+4)......+(1+2+3+..+100)的结果
        //1.一共有100项
        //2.每一项数字逐渐增加
        //3.i可以表示最后一个数，也可以表示第几项
        int sum = 0;
        for(int i =1;i <= 100;i++){
            for(int j = 1;j <= i;j++){
                sum += j;
            }
        }
        System.out.println("sum=" + sum);
    }
}
