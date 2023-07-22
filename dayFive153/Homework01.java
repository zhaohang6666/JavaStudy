package dayFive153;

public class Homework01 {
    public static void main(String[] args) {
        /*
        某人有100，000元，每经过一次路口，需要交费，规则如下：
        1.现金>50000时，每次交5%
        2.现金<=50000时，每次交1000
         计算该人可以经过多少次路口
         */
        double money = 100000;//还有多少钱
        int count = 0;//累计过路口的次数
        while (true) {
            if(money > 50000){//过路口
                money *= 0.95;//过路口剩余的钱
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            }else {//<1000不够过路口
                break;
            }
        }
        System.out.println(money + "可以过" + count + "次路口");
   }
}
