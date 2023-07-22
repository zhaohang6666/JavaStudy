package dayEight210;

public class Object03 {
    public static void main(String[] args) {

        AA a = new AA();
       //if(a.isOdd(1)){
       //    System.out.println("是奇数");
       //}else {
       //    System.out.println("是偶数");
       //}
        a.print(4,4,'#');

    }
}
//编写类AA，有一个方法： 判断一个数是奇数odd还是偶数，返回boolean
class AA{
    public boolean isOdd(int num){
        //if(num % 2 != 0){
        //    return true;
        //}else {
        //   return false;
        //}
        return  num % 2 != 0;
    }
    //根据行、列、字符打印 对应数和列数的字符，
//比如：行：4，列：4，字符#，则打印相应的效果
/*
####
####
####
####
 */
//思路：
//1.方法的返回类型void
//2.方法的明字 print
//3.方法的形参（int row, int col , char c）
//4.方法体，循环
    public void print(int row, int col ,char c){
        for(int i = 0; i < row; i++){
            for(int j = 0;j < col;j++){
                System.out.print(c);
            }
            System.out.println();//换行
        }

    }

    public void swap(AA a, int b) {
    }
}


