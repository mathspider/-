package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test_Compare {
    public static void main(String[] args) {
        Student student = new Student("李白", 100, 180);
        Student student1 = new Student("李白1", 200, 160);
        Student student2 = new Student("李白2", 300, 170);
        Student student3 = new Student("李白3", 400, 190);
        Tescher tescher1 = new Tescher("李老师", 120, 170);
        Tescher tescher2 = new Tescher("王老师", 130, 150);
        Tescher tescher3 = new Tescher("刘老师", 150, 190);
        List<Tescher> teschers=new ArrayList<>();
        teschers.add(tescher1);
        teschers.add(tescher2);
        teschers.add(tescher3);
        FindMIN_height(teschers);
        FindMIN_weight(teschers);
        List<Student>studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student);
        studentList.add(student3);
        FindMIN_weight(studentList);
        FindMIN_height(studentList);
    }

    static void FindMIN_height(List<? extends People> list) {
       list.sort((Comparator<People>)(o1,o2)->(int)(o1.gethight()-o2.gethight()));
        System.out.println("最矮的身高为：" + list.get(0).gethight());

    }
    static void FindMIN_weight( List<? extends People> list) {
       list.sort((Comparator<People>) (o1, o2) -> (int) (o1.getweight()-o2.getweight()));
        System.out.println("最低体重为：" + list.get(0).getweight());
    }
}
//    class compare_hight implements Comparator<People> {
//        @Override
//        public int compare(People o1, People o2) {
//            return (int) (o1.gethight() - o2.gethight());
//        }
//    }
//
//    class compare_weight implements Comparator<People> {
//
//        @Override
//        public int compare(People o1, People o2) {
//            return (int) (o1.getweight() - o2.getweight());
//        }
//    }
