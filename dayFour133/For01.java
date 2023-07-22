package dayFour133;

//for（循环变量初始化;循环条件;循环变量迭代）{
        //循环操作（可以多条语句）;
// }
public class For01 {
    public static void main(String[] args) {
        //打印1-100之间所有事9的倍数的整数，统计个数 及 总和；
        int sum = 0;//总和
        int count = 0;//统计9的倍数的个数
        //为了是适应更好的需求，把范围的值改成变量，倍数也改成变量
        int start = 1;
        int end = 100;
        int t = 9;
        for (int i = start; i <= end; i++) {
            if(i % t == 0) {
                System.out.println("i =" + i);
                count++;;
                sum +=i;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}