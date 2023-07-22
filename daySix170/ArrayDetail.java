package daySix170;

public class ArrayDetail {
    public static void main(String[] args){
        //1.数组是多个相同类型的组合，实现对这些数据的统一管理

        //int[] arr1={1,2,3,60,"hello"};String -> double
        double [] arr2 = {1.1,2.2,3.3,60.6,100};

        //2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但不能混用
        String [] arr3 = {"北京","jack","milan"};

        //数据创建后，如果没有赋值，有默认值
        //int 0, short 0, byte 0, long 0,
        //float 0.0 ,double 0.0, char \u0000,
        //boolean false, String null,
        short [] arr4 = new short[3];

        for(int i = 0;i < arr4.length; i++){
            System.out.println(arr4[i]);
        }

        //数组的下标必须在指定范围内使用，否则报：下标越界异常，比如
        //int[] arr=new int [5];则有效下标为0-4

        int [] arr =new int[5];
        System.out.println(arr[4]);

    }
}
