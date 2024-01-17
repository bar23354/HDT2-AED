public class Node<T> {
    T data;
    Node<T> next;
    public TgetData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setData(T newData){
        data = newData;
    }

    public void setNext(Node<T>n)
    next =n;

}

