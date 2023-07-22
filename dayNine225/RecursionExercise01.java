package dayNine225;

public class RecursionExercise01 {
    public static void main(String[] args) {
       T t1 = new T();
        //int n = 7;
        //int res = t1.fibonacci(n);
        //if(res != -1) {
        //   System.out.println("当n=" + n + "  对应的雯波那契数=" + res);
        //}
        //桃子问题
        int day = 1;
        int peachNum = t1.peach(day);
        if(peachNum != -1){
            System.out.println("第"+ day + "有" + peachNum + "个桃子");
        }

    }
}
class T {
    /*
    使用递归的方式求出雯波那契数1，1，2，3，5，8，13.。。给你一个整数n,求出它的值是多少

     */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n >= 1 的整数");
            return  -1;
        }
    }
    //猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一般，并再多吃一个
    //以后每天猴子都吃其中的一半，然后再多吃一个。当道第10天时
//在多吃（即还没吃），发现只有一个桃子。问题：最初共多少个桃子
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        }else {
            System.out.println("day在1-10");
            return -1;
        }
    }

    public void findWay(int[][] map, int i, int j) {
    }
}

