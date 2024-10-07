public class MyStack<T> implements MyStackInterface<T> {
    private Node<T>  top;
    private int count;

    public MyStack() {
        top = null;
        count = 0;
    }

    /**
     * @param item
     */
    @Override
    public void push(T item) {
        Node<T> newNode = new Node<T>(item, null);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        count +=1;
    }

    /**
     * @return
     * @throws StackUnderflowException
     */
    @Override
    public T pop() throws StackUnderflowException {
        T topElement = null;
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        } else {
            topElement = top.getDatum();
            if (count == 1) {
                top = null;
            } else {
                top = top.getNext();
            }
            count -= 1;
        }
        return topElement;
    }

    /**
     * @return
     * @throws StackUnderflowException
     */
    @Override
    public T peek() throws StackUnderflowException {
        T topElement = null;
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        } else {
            topElement = top.getDatum();
        }
        return topElement;
    }

    /**
     * @return
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }
}
