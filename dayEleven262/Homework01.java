package dayEleven262;

public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {5.6,5,-8};
        Double res = a01.max(arr);
        if(res != null) {
            System.out.println("arr的最大值=" + a01.max(arr));
        }else {
            System.out.println("arr输入有误,数组不能为null，或者为{}");
        }
        /*
编写类A01，定义方法max，实现某个double数组的最大值，并返回
 */
    }
}
class A01{
    public Double max(double[] arr) {

        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }else {
            return null;
        }
    }
}
