import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fifth_Work {
    public static void main(String[] args) {
        count();
    }

    static void count() {
        System.out.println("请输入你想要计算的整数列，用','进行分隔开");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(",");
        Map<String, Integer> count_map = new HashMap<>();
        for (String s : split) {
            if (!count_map.containsKey(s)) {
                count_map.put(s, 1);
            } else {
                count_map.put(s, count_map.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : count_map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() +
                    "出现的次数为：" + stringIntegerEntry.getValue() + "次");
        }
    }
}
