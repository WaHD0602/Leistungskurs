package blatt29_aufgabe2;

public class Node<T> {

    private final T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node<T> next() {
        return next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}