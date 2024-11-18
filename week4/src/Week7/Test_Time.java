package Week7;

public class Test_Time {
    public static void main(String[] args) {
        Time time=new Time(18,34,50);
        time.addHour(4);
        time.addMinute(10);
        time.addSecond(3);
        time.subHour(8);
        time.subMinute(10);
        time.subSecond(3);
    }
}
