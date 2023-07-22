package dayFive153;

public class BreakExercise01 {
    public static void main(String[] args) {
        //1-100以内的数求和，求出 当和第一次大于20的当前数
        int sum = 0;
        int n = 0;
        for(int i = 1; i <= 100;i++){
            sum += i;
            if(sum > 20){
                n = i;
                break;
            }
        }
        System.out.println("当和>20时，i="+n);
    }
}
