package Week7;

public class People {
    private String name;
    private  int age;

    public People() {
    }
    public  People(String name,int age){
        this.age=age;
        this.name=name;
    }
    public  void display(){
        System.out.println("姓名为："+name+"\n"+"年龄为："+age);
    }
}
