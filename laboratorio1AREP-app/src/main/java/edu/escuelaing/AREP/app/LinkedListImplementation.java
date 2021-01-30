package edu.escuelaing.AREP.app;
import edu.escuelaing.AREP.app.Node;

import java.io.Serializable;
import java.util.Iterator;

public class LinkedListImplementation<E> implements Iterable<E>, Serializable {
    Node head;
    public void insert (int data){
        Node node = new Node();
        node.data = data;

        if (head==null){
            head=node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next = node;
            right (n);
        }
    }
    public Node right (Node data) throws IndexOutOfBoundsException{
        return data;
    }
    public void show() throws IndexOutOfBoundsException{
        Node node = head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtStart(int data) throws IndexOutOfBoundsException{
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public  LinkedListImplementation remove (int value, LinkedListImplementation list) throws IndexOutOfBoundsException{
        Node n = head;
        Node n1 = null;
        if ((n != null) && n.data != value){
            list.head = n.next;
            return list;
        }
        while (n !=null && n.data!= value){
            n1 = n;
            n = n.next;
        }
        if (n!=null){
            n1.next = n.next;
        }
        if(n==null){
        }
        return list;
    }

    @Override
    public Iterator<E> iterator() throws IndexOutOfBoundsException{
        return null;
    }
}
