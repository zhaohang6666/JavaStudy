package dayFive153;

public class Homework05 {
    public static void main(String[] args){
        //输出1-100之间的不能被5整除的数，每5个一行；
        int n =100;
        int count = 0;
        for(int i = 1;i <= n;i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");
                //每满5个就输出一个换行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

