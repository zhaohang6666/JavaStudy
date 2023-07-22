package dayFour133;

public class MultiplyExercise02 {
    public static void main(String[] args){
        for(int i = 1;i <= 9;i++) {//控制行数
            for (int j = 1; j <= i; j++) {//控制列数
                System.out.print(j + "*" + i +"=" + (j * i)+"\t");
            }
            System.out.println();
        }
    }
}
