package Week7;

public class Time {
    private  int hour;
    private  int minute;
    private  int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public  void  display(){
        System.out.println(hour+"时"+minute+"分"+second+"秒");
    }
    public void addSecond(int sec){
        System.out.println("加上为："+sec+second+"秒");
    }
    public void addMinute(int min){
        System.out.println("加上为："+min+second+"分");
    }
    public  void  addHour(int hou){
        System.out.println("加上为： "+hour+hou+"时");
    }
    public void subSecond(int sec){
        System.out.println("减去为："+(second-sec)+"秒");
    }
    public void subMinute(int min){
        System.out.println("减去为："+(second-min)+"分");
    }
    public  void  subHour(int hou){
        System.out.println("减去为： "+(hour-hou)+"时");
    }
}
