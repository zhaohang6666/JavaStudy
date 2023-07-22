package dayFive153;

public class ReturnExercise {
    public static void main(String[] args) {

        for(int i = 1;i <=5; i++){

            if(i == 3){
                System.out.println("你好" + i);
                return;//跳出方法(main); break终止for循环; continue终止本次循环

            }
            System.out.println("发家");
        }
        System.out.println("致富");
    }
}
