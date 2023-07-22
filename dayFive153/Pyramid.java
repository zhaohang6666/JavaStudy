package dayFive153;

public class Pyramid {

    public static void main(String[] args) {
        //打印空心金字塔
        int total = 5;
        for (int i = 1; i <= total; i++) {//i为金字塔层数
            for(int k =1;k <= total - i;k++){//输出空格
                System.out.print(" ");
            }
                for (int j = 1; j <= 2 * i - 1; j++) {//j为*数
                    if(j == 1 || j == 2 * i - 1 || i == total){//当前行第一个位置是*，最后一个位置也是*，最后一层全是*
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

            }
            System.out.println("");
        }
    }
}