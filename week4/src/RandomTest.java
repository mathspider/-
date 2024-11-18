public class RandomTest {
    public static void main(String[] args) {
        print();
    }
    public static void  print(){
        int count=0;
        while (true){
            double random = Math.random();
            count++;
            if (random>0.999){
                System.out.printf("第一次大于0.999的次数：%d%n", count);
                System.out.printf("随机数：%.5f%n", random);
                break;
            }
        }
    }
}
