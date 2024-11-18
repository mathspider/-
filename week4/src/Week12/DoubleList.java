package Week12;

public class DoubleList <T>{
        boolean changeBefore(DoubleNode<T> node){
            try {
                DoubleNode<T> preview=node.prev;
                DoubleNode<T> prevprev=preview.prev;
                DoubleNode<T> nodenext=node.next;//先将node后继存入
                prevprev.next=node;
                node.prev=prevprev;
                node.next=preview;
                prevprev.prev=node;
                prevprev.next=nodenext;
            }catch (Exception e){
                return false;
            }
           return true;
        }
        boolean changeAfter(DoubleNode<T> node){
            try {
                DoubleNode<T> before=node.prev;
                DoubleNode<T> last=node.next.next;
                DoubleNode<T> after=node.next;
                before.next=after;
                after.prev=before;
                after.next=node;
                node.prev=after;
                node.next=last;
                last.prev=node;
            }catch (Exception e){
                return false;
            }
            return true;
        }
}
