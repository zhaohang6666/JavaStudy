package dayThirteen305;
//编写PC子类，继承Computer类，添加特有属性【品牌brand】
public class PC extends Computer{

    private String brand;
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void  printInfo(){
        System.out.println("PC信息=");
//        System.out.println(getCpu() + getMemory() + getDisk());
        System.out.println(getDetails() + "brand=" + brand);
    }
}
