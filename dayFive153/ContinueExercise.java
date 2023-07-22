package dayFive153;

public class ContinueExercise {
    public static void main(String[] args) {
        int i =1;
        while(i <= 4){
            i++;
            if(i == 2){
                continue;
            }
            System.out.println("i=" + i);
        }
        label1:
        for(int j =0; j < 2; j++){
            label2:
            for(int k =0;k < 10; k++){
                if( k == 2){
                    continue label1;
                    // continue;//continue等于continue label2
                }
                System.out.println("k=" + k);
            }
        }
    }
}
