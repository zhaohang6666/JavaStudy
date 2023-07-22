package dayFour133;

public class DoWhileExercise01 {
    public static void main(String[] args) {
        //打印1-100及总和
        /*int i = 1;
        int sum = i;
        do {
            System.out.println("i=" + i);
            i++;
        }while(i <= 100);
        System.out.println("sum=" + (sum += i));*/
        //统计1-200之间能被5整除但不能被3整除的个数
        int n = 1;
        int e = 200;
        int count = 0;
        do {
            if (n % 5 == 0 && n % 3 != 0) {
                System.out.println("n=" + n);
                count++;
            }
            n++;
        }while(n <= e);
        System.out.println("count=" + count );
    }
}