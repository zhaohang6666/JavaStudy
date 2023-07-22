package dayTen251;

public class VarScopeDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.say();//当执行say方法是，say方法的局部变量比如name,会创建，当say执行完毕后
        //name局部变量就销毁，但是属性(全局变量)仍然可以使用

    }
}
class Person{
    String name = "jack";

    public void say(){
        //属性和局部变量可以重名，访问时遵循就近原则
        String name = "king";
        System.out.println("say() name=" + name);
    }
    public void hi(){
        String address = "北京";
        String name = "zh";
    }
}

