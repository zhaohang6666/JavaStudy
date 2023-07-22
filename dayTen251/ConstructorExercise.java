package dayTen251;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class ConstructorExercise {
    public static void main(String[] args) {
        person p1 = new person();
        System.out.println("p1的信息 name=" + p1.name + "age=" + p1.age);

        person p2 = new person("scott",50);
        System.out.println("p2的信息 name=" + p2.name + "age=" + p2.age);

    }
}
/*
在前面定义的Person类中添加两个构造器；
在第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
第二个带pName和pAge两个参数的构造器；
使得每次创建person对象的同时初始化对象的age属性值和name 属性值
分别使用不同的构造器，创建对象

 */
class  person {
    String name;
    int age;

    public person() {
        age = 18;
    }
    public person(String pName, int pAge){
        name = pName;
        age  = pAge;
    }
}
