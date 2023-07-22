package dayFive153;

public class Diamond {
    public static void main(String[] args) {
        int floor = 10;
        int floor1 = floor / 2 +1;
        int floor2 = floor / 2;
        for (int i = 1; i <= floor1; i++) {
            for (int k = 1; k <= floor1  - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//控制星数
                if(j == 1 || j == 2 * i -1) {
                    System.out.print("*");
                    }else {
                    System.out.print(" ");
                      }
                }
            System.out.println(" ");
            }
        for(int i =floor2;i >= 1 ;i--){//控制层数
            for(int k = 1;k <= floor2 + 1 - i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j <= 2 * i - 1;j++){//控制*数
                if(j == 1 || j == 2 * i -1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }
        }
    }
