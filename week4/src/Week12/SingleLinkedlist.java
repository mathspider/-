package Week12;

public class SingleLinkedlist<T> {
    private  SingleNodes<T>  first;

    public SingleLinkedlist() {
    }

    public SingleNodes<T> getFirst() {
        return first;
    }

    public void setFirst(SingleNodes<T> first) {
        this.first = first;
    }
    boolean changeBefore(SingleNodes<T> node){//将node与上一个节点交换
          try {
              if (node == first) {
                  return false; // 节点已经是头结点，无法交换
              }
              SingleNodes<T> current=first;//赋值头结点，遍历找前驱
              while (current.next!=node&&current!=null){//while循环找到node前驱
                  current=current.next;
              }//此时current为node前驱,需要将current和node交换
              if (current == null) {
                  return false; // 没有找到节点node的前驱节点，无法交换
              }
              SingleNodes<T> before=first;
              while (before!=null&&before.next!=current){ //找到node的前驱的前驱
                 before=before.next;
              }
              before.next=node;
              node.next=current;
              current.next=node.next;

          }catch (Exception e){
              return false;
          }
          return true;
    }
    boolean changeAfter(SingleNodes<T> node){//将node与下一个节点交换
        try {
            SingleNodes<T> next=node.next;//next为node的下一个节点
            SingleNodes<T> nextnext=next.next;//node的下两个节点
            SingleNodes<T> current=first;//将first节点给current，用来找前节点
            while (current!=null&&current.next!=node){
                current=current.next;
            }//跳出循环时，current即为node前驱节点
            if (next == null) {
                return false; // 节点已经是尾节点，无法交换
            }
            current.next=next;
            next.next=node;
            node.next=nextnext;
        }catch (Exception e){
            return false;
        }

        return true;
    }

}
