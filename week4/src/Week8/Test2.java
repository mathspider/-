package Week8;

public class Test2 {
    public static void main(String[] args) {//负整数补码,32位
        func(-7);
    }

    static void func(int n) {//n为负整数
        StringBuffer str = new StringBuffer();
        n = -n;
        while (n != 1) {
            str.append(n % 2);
            n = n / 2;
        }
        str.append(n);
        if (str.length() <= 32) {
            int i = 32 - str.length();
            for (int i1 = 0; i1 < i; i1++) {
                str.append(0);
            }
        }
        str = str.reverse();
        String string = str.toString();
        String s = fan_ma(string);
        System.out.println(s);
    }

    static String fan_ma(String str) {
        String[] split = str.split("");
        String last = new String();
        String strings[] = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            split[i] = fan(split[i]);
        }//取反
        strings = bu_ma(split);
        for (int i = 0; i < strings.length; i++) {
            if ((i + 1) % 8 == 0) {
                strings[i] = strings[i] + " ";
            }//分隔
            last += strings[i];
        }
        return last;
    }

    static String fan(String s) {//取反
        if (s.equals("0")) {
            return "1";
        } else
            return "0";
    }

    static String[] bu_ma(String[] strings) {//第三步+1
        boolean out = true;
        int i = strings.length - 1;
        while (out) {
            if (strings[i].equals("0")) {
                strings[i] = "1";
                for (int j = i + 1; j < strings.length; j++) {
                    strings[j] = "0";
                }
                out = false;
            } else i--;
        }
        return strings;
    }
}
