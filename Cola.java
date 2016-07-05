/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.utils.data;

/**
 * Clase de cola generica Implementa enqueue,dequeue,size,clear.
 *
 * @author Pedro
 */
public class Cola<T> {

    public class Node<T> {

        T t;
        Node next;
    }

    private Node primero, ultimo;
    private int size;

    public Cola() {
        size = 0;
        primero = null;
        ultimo = null;
    }

    public void Enqueue(T t) {
        Node curr = new Node();
        curr.t = t;
        if (size > 0) {
            ultimo.next = curr;
            ultimo = curr;
            size++;
        } else {
            primero = curr;
            ultimo = curr;
            size++;
        }
    }

    public T Dequeue() {
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

    public void Clear() {
        primero = null;
        ultimo = primero;
        size = 0;

    }
    
    public static void main (String[] args){
    Cola<String> greeting  = new Cola<>();

greeting.Enqueue("Hello");
greeting.Enqueue(", ");
greeting.Enqueue("World!");

System.out.println(greeting.Dequeue()+greeting.size() + greeting.Dequeue()+greeting.size() + greeting.Dequeue()+greeting.size());
    }
}
