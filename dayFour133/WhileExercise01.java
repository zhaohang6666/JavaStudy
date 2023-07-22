package dayFour133;

public class WhileExercise01 {
    public static void main(String[] args) {
        //打印1-100之间所有能被3整除的数
        int i = 1;
        int t = 3;
        int n = 100;
        while(i <= n ){
            if(i % t == 0) {
                System.out.println("i=" + i);
            }
            i++;
        }
        //打印40-200之间所有的偶数
        int d = 40;
        while(d <= 200){
            if(d % 2 == 0){
                System.out.println("d=" + d);
            }
            d++;
        }

    }
}