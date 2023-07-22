package dayEight210;

public class MethodParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //创建BB对象
        AA aa = new AA();
        aa.swap(aa,b);

        System.out.println("main方法 a=" + a + "b=" + b);
    }
}
class BB{
    public void swap(int a ,int b){
        System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);
        }

}
