public class Node<T> {
    private T datum;
    private Node<T> next;

    public Node() {
        this.datum = null;
        this.next = null;
    }

    public Node(T datum, Node<T> next) {
        this.datum = datum;
        this.next = next;
    }

    public T getDatum() {
        return datum;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setDatum(T datum) {
        this.datum = datum;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

