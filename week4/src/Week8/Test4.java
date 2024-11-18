package Week8;

public class Test4 {
    public static void main(String[] args) {
        String str="Hello, world.";
        System.out.println(reverse_String1(str));
        System.out.println(reverse_String2(str));


    }
    static String reverse_String1(String str){//迭代
        String[] split = str.split("");
        String [] strings=new String[split.length];
        String last=new String();
        for (int i = 0; i < split.length; i++) {
            strings[split.length-i-1]=split[i];
        }
        for (int i = 0; i < strings.length; i++) {
            last+=strings[i];
        }
        return last;
    }
    static String reverse_String2(String str){
      if (str.isEmpty()){
          return str;
      }else {
          String reversed=reverse_String2(str.substring(1));
          return  reversed+str.charAt(0);
      }
    }
}
