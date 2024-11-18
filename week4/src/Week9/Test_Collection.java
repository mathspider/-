package Week9;

import java.util.Arrays;

public class Test_Collection {
    public static void main(String[] args) {

        Collection collection=new Collection(new Tescher[]{new Tescher("李白")});
        System.out.println("collection.IsEmpty() = " + collection.IsEmpty());
        collection.makeEmpty();
        System.out.println("collection.IsEmpty() = " + collection.IsEmpty());
          collection.insert(0,new Tescher("杜甫"));
        System.out.println("collection.IsEmpty() = " + collection.IsEmpty());
        System.out.println("collection.isPresent(new Tescher(\"杜甫\")) = " + collection.isPresent(new Tescher("杜甫")));
    }
}
