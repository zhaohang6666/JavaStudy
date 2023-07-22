package dayEleven262;

public class Homework02 {
    public static void main(String[] args) {
        String[] strs = {"jack","tom","mary","mila"};
        A02 a02 = new A02();
        int index = a02.find("zh",strs);
        System.out.println("查找的index=" + index);
    }
}
//编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引
//如果找不到，返回-1
class A02{
    public int find(String findStr,String[] strs){
        for(int i = 0;i < strs.length; i++){
            if(findStr.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }
}
