package dayTwelve285;

public class Encapsulation01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());

    }
}
/*
不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认年龄，必须在1-120，
年龄，工资不能直接查看，name的长度在2-6个字符之间
 */
class Person{
    public String name;
    private int age;//age私有化
    private double salary;
    //setXxx 和 getXxx ,快捷键 alt + insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("名字长度需要在（2-6）个字符");
            this.name = "无名氏";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("年龄需要在1-120");
            this.age = 18;//默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info(){
        return "信息为 name=" + name + "\tage=" +age + "\t薪水=" + salary;
    }

}