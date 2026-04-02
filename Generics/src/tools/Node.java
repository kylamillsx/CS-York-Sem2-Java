package tools;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(){
        this.data = null;
        next = null;
    }

    public Node(T data){
        this.data = data;
        next = null;
    }

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public void setData(T data){
        this.data = data;
    }
}