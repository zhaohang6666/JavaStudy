package dayFive153;

public class Homework06 {
    public static void main(String[] args) {
        //输出小写的a-z 以及大写的Z-A

        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + " " );
        }
        for (char c2 = 'Z'; c2 >= 'A'; c2--) {
            System.out.print(c2 + " ");
        }
    }
}
