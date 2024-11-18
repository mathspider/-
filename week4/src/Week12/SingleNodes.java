package Week12;

public class SingleNodes<T> {
    T data;
    SingleNodes<T> next;

    public SingleNodes(T data, SingleNodes<T> next) {
        this.data = data;
        this.next = next;
    }
}
