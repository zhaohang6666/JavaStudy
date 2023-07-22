package dayFive153;


public class Homework04 {
    public static void main(String[] args){
        //判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身
        //列如：153=1*1*1 + 3*3*3 + 5*5*5
        //先得到 百位，十位。个位上的数，再用if 判断
        /*n的百位= n / 100；
        //n的十位= n % 100 / 10;
        n的个位= n % 100;*/
        int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 /10;
        int n3 = n % 10;
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n){
            System.out.println(n + "是水仙花数");
        }else {
            System.out.println(n + "不是水仙花数");
        }
    }

}
