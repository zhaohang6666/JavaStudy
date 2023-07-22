package daySix170;

public class ArrayExercise01 {
    public static void main(String[] args){
        //创建一个char类型的26个元素的数组，分别放置'A'-'Z',并用for循环访问所有元素并打印出来
        char [] c1 = new char[26];
        for(int i =0;i < c1.length; i++){
            c1 [i] = (char)('A' + i) ;
            System.out.println(c1[i] );
        }


    }

}
