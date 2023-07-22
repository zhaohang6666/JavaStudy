package dayFive153;
import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        //实现登录验证，有3次机会，如果用户名为"丁真"，密码"666"提示登陆成功，否则提示还有几次机会，请使用for +break完成
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;//3次机会，登陆一次就减少一次
        for(int i = 1;i <= 3;i++) {
            System.out.print("请输入用户名");
            name = myScanner.next();
            System.out.print("请输入密码");
            passwd = myScanner.next();
            //补充说明字符串的内容 比较 使用的 方法 equals
            if ("丁真".equals(name) && "666".equals(passwd)) {
                System.out.print("恭喜你，登陆成功~");
                break;

            }
            chance--;
            System.out.println("你还有" + chance + "次登录机会");

        }
    }
}
