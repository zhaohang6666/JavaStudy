package dayThree114;

import java.util.Scanner;//把java.util下的Scanner类导入

public class Input{
    public static void main(String[] args){
        //演示接受用户输入
        /*
        1.引入Scanner类所在的包
        2.创建Scanner对象
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("请输入薪水");
       double salary = scanner.nextDouble();
       System.out.print("name=" + name + "age" + age + "salary=" + salary);
    }
}