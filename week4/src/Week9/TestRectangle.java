package Week9;

import java.util.Arrays;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(5,5);
        Rectangle rectangle2=new Rectangle(4,6);
        Rectangle rectangle3=new Rectangle(12,2);
        Rectangle rectangle4=new Rectangle(5,6);
        Rectangle rectangle5=new Rectangle(3,10);
        Rectangle rectangle6=new Rectangle(30,1);
        Rectangle[]rectangles={rectangle1,rectangle2,rectangle3
        ,rectangle4,rectangle5,rectangle6};
        Arrays.sort(rectangles);
        System.out.println(rectangles[rectangles.length-1].toString());
    }
}
