package tools;

public class LinkedListSet<E> implements ISet<E> {
    Node<E> head;//start of linked list
    int size;
    public LinkedListSet(){
        head = null;
        size = 0;
    }

    //Inner Node Class
    private static class Node<E>{
        E data;
        Node<E> next;
        //Constructor
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;

        }
        //Methods
        public E getData(){
        return data;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> next){
            this.next = next;
        }

        public void setData(E data){
            this.data = data;
        }
    }
    //Methods 
    public boolean isEmpty(){
        return size==0;
    }
    public boolean remove(E elt){
        if (head.getData().equals(elt)){//checking if its at start
            head = head.getNext();//updating the head
            size --;
            return true;
        }
        Node<E> current = head;
        while(current.getNext()!=null){//until end is reached
            if (current.getNext().getData().equals(elt)){
                current.setNext(current.getNext());
                size --;
                return true;
            }
            current = current.getNext();
        }
        return false;


    }
    public int size(){
        return size;
    }
    public boolean contains(E elt){
        Node<E> current = head;//start at head
        while (current!=null){//stop when we reach tail
            if (current.getData().equals(elt)){
                return true;
            }
            current = current.getNext();//move to next item in linked list
        }
        return false;

    }
    public void clear(){
        Node<E> current = head;//start at head
        while (current!=null){//stop when we reach tail
            current.setData(null);
            current = current.getNext();//move to next item in linked list
        }

    }
    public boolean add(E elt){
        if(!contains(elt)){//to avoid duplicates
            Node<E> newNode = new Node<>(elt,head);//uses Node constructor
            head = newNode;//insert at head
            size++;
            return true;
        }
        return false;
        

    }




}
