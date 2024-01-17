/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

public class Node<T> {
    T data;
    Node<T> next;
    public Node(T value) {
        data = value;
        next = null;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNextNode(){
        return next;
    }

    public void setData(T newData){
        data = newData;
    }

    public void setNextNode(Node<T>n){
        next = n;
    }

}

