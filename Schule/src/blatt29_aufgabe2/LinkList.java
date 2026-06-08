package blatt29_aufgabe2;

public class LinkList<T> {

    private Node<T> head;

    public LinkList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {

        int count = 0;
        Node<T> current = head;

        while (current != null) {
            count++;
            current = current.next();
        }

        return count;
    }

    public T get(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next();
        }

        return current.getValue();
    }

    public boolean contains(T value) {

        Node<T> current = head;

        while (current != null) {

            if (current.getValue().equals(value)) {
                return true;
            }

            current = current.next();
        }

        return false;
    }

    public void add(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.hasNext()) {
            current = current.next();
        }

        current.next = newNode;
    }

    public void add(int index, T value) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next();
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public T remove(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            T value = head.getValue();
            head = head.next;
            return value;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next();
        }

        T value = current.next.getValue();
        current.next = current.next.next;

        return value;
    }

    public void clear() {
        head = null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node<T> current = head;

        while (current != null) {

            sb.append(current.getValue());

            if (current.hasNext()) {
                sb.append(" -> ");
            }

            current = current.next();
        }

        return sb.toString();
    }
}