/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.Test;

public class CustomStackTest {
    @Test
    void testPush() {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
    }

    @Test
    void testPop() {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    void testPeek() {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
        assertEquals(3, stack.size());
    }
}
