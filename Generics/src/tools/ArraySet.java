package tools;

public class ArraySet<E> implements ISet<E> {
    E[] data;
    int size;
    public ArraySet(int capacity){
        size =0;
        data = (E[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty(){
        return size ==0;
    }

    public boolean remove(E elt){
        for (int i=0;i<size;i++){
            if(data[i].equals(elt)){
                for(int j=i;j<size-1;j++){
                    data[j] = data[j+1];//shift all elements to left
                }
                data[size-1] = null;//removing empty box left from shift
                size -=1;
                return true;
            }
        }
        return false;

    }
    public int size(){
        return size;

    }
    public boolean contains(E elt){
        for (int i=0;i<size;i++){
            if (data[i].equals(elt)){
                return true;//check if element exists within array
            }
        }
        return false;

    }
    public void clear(){
        for (int i =0;i< size;i++){
            data[i] = null; //resets each element in array to null
        }
        size = 0;

    }
    public boolean add(E elt){
        if (!contains(elt)){//checking if it exists to avoid duplicates
            data[size] = elt;//add to array
            size++;//increment size
            return true;
        }
        return false;
       

    }

}
