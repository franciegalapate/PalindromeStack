public interface MyStackInterface<T> {
    public void push(T item);
    public T pop() throws StackUnderflowException;
    public T peek() throws StackUnderflowException;
    public int size();
    public boolean isEmpty();
}
