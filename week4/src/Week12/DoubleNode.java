package Week12;

public class DoubleNode <T>{
    T data;
    DoubleNode<T> prev,next;

    public DoubleNode(T data, DoubleNode<T> prev, DoubleNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DoubleNode() {
    }
}
