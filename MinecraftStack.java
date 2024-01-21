/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

import java.util.EmptyStackException;

public interface MinecraftStack<T> {
    void push(T element);
    T pop() throws EmptyStackException;
    boolean isEmpty();
    int size(); // agarrar el tamaño del stack
}
