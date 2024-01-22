/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 public class CustomStackTest {
 
     @Test
     public void LogicTestPushPop() {
         CustomStack<Integer> stack = new CustomStack<>();
 
         // Prueba push
         stack.push(1);
         assertEquals(1, stack.pop());
 
         // Prueba pop en una pila vacía
         assertNull(stack.pop());
 
         // Prueba push y pop múltiples elementos
         stack.push(2);
         stack.push(3);
         stack.push(4);
         assertEquals(2, stack.pop());
         assertEquals(3, stack.pop());
         assertEquals(4, stack.pop());
         assertNull(stack.pop());
     }
 
     @Test
     public void testCustomStackString() {
         CustomStack<String> stack = new CustomStack<>();
 
         // Prueba push y pop de cadenas
         stack.push("Hola");
         stack.push("Mundo");
         assertEquals("Hola", stack.pop());
         assertEquals("Mundo", stack.pop());
         assertNull(stack.pop());
     }
 }
 