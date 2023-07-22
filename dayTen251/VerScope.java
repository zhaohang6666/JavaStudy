package dayTen251;

public class VerScope {
    public static void main(String[] args) {

    }
}
class Cat{
    //全局变量：也就是属性，作用域为在整个类体 Cat类：cry eat 等方法使用属性
    //属性在定义是，可以直接赋值
    int age = 10;
    double weight;

    public void hi(){
        //局部变量必须赋值后，才能使用，因为没有默认值
        int num = 1;
        String address = "北京的猫";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);
    }

    public void cry() {
        String name = "jack";
        System.out.println("在cry中使用属性 age=" + age);
    }
    public void eat() {

        System.out.println("在eat中使用属性 age=" + age);
    }
}
