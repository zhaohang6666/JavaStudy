package dayFive153;

public class Homework07 {
    public static void main(String[] args) {
        //求出1-1/2+1/3-1/4.......1/100的和
        //分析：
        //(1/1)-(1/2)+(1/3)-(1/4)......1/100,当分母为奇数时，前面是+，分母是偶数时，前面是-
        double sum =0;
        for (int i =1 ; i <= 100;i++){
            if(i % 2 == 0){//分母为偶
                sum -= 1.0/i;
            }else {
                sum += 1.0/i;
            }
        }
        System.out.println("sum=" + sum);

    }
}
