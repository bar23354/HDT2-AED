/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

public class CustomStack<T>{
private Node<T> lastNode;
private Node<T> fistNode;
    public void push (T data){
        Node<T> node = new Node<T>(data);
        if (fistNode == null){
            fistNode = node;
            lastNode = node;
        }else{
            lastNode.setNextNode(node);
            lastNode = node;
        }
    }

    public T pop(){
        if (fistNode == null){
            return null;
        }else{
            T data = (T) fistNode.getData();
            fistNode = fistNode.getNextNode();
            return data;
        }
    }
}
