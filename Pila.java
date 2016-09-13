
package pedro.utils.data;

/**
 * Pila generica de tipo T Implementa push y pop, asi como size y clear
 *
 * @author Pedro
 */
public class Pila<T> {

    private class Node<T> {

        T t;
        Node next;
    }
    Node primero;
    int size;

    public Pila() {
        primero = null;
    }

    public void Push(T t) {
        Node curr = new Node();
        curr.t = t;
        curr.next = primero;
        primero = curr;
        size++;
    }

    public T Pop() {
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        T t = (T) primero.t;
        primero = primero.next;
        size--;
        return t;
    }

    public int size() {
        return size;
    }

    public void clear() {
        primero = null;
    }

    public static void main(String[] args) {
        Pila<String> g = new Pila<>();

        g.Push("!");
        g.Push("World");
        g.Push("Hello, ");

        System.out.println(g.Pop() + g.Pop() + g.Pop()); // Hello, World!
    }
}
