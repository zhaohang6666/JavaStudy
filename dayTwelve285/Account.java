package dayTwelve285;
/*
创建程序，在其中定义两个类：Account 和 AccountTest类体会Java的封装性
Account类要求具有属性：姓名（长度为2为3为或4位）、余额（必须>20）
密码必须是6位，如果不满足，则给出提示信息，并给出默认值
通过setXxx的方法给Account 的属性赋值
在AccountTest中测试
 */
public class Account {
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    public Account(){
    }

    public Account(String name, double balance ,String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        }else {
            System.out.println("余额（必须>20）默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        }else {
            System.out.println("密码必须是六位，默认密码为 000000");
            this.pwd = "000000";
        }
    }
    //显示账号信息
    public void showInfo() {
        //增加权限的校验
        System.out.println("账号信息 name=" + name + "\t余额= " + balance + "\t密码" + pwd);
 //       if () {
 //           System.out.println("账号信息 name=" + name + "余额= " + balance + "密码");
 //       }else {
 //           System.out.println("你无权查看...");
 //       }
    }
}
