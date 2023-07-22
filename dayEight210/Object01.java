package dayEight210;

public class Object01 {
    public static void main(String[] args) {
        /*
        有两只猫：一只叫小白，今年3岁，白色。
        另一只叫小花，今年100岁，花色。请编写一个程序，当用户输入小猫的名字时
        就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，则显示没有这是猫
         */

        //数组===>(1）数据类型不好体现
        //（2）只能通过[下标]获取信息，造成变量名字和内容
        //（3）不能体现猫的行为
        String[] cat1 ={"小白","3","白色"};
        String[] cat2 ={"小花","100","花色"};

        //定义一个猫类Cat -> 自定义的数据类型
        class cat {
            String name;//明字
            int age;//年龄
            String color;//颜色
            //double weight;//体重
        }

    }
}
