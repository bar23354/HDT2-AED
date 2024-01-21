/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

import java.util.EmptyStackException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MinecraftStack<Integer> stack = new Stack64<>();

        // L E E R
        List<String> expressions = FileReader.readExpressions("datos.txt");

        Calculator calculator = new CalculatorPostfix(stack);

        // Evaluar cada expresión e imprimir el resultado
        for (String expression : expressions) {
            try {
                int result = calculator.evaluatePostfix(expression);
                System.out.println("Resultado: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error al evaluar la expresión: " + expression);
            } catch (EmptyStackException e) {
                System.out.println("Error: La expresión tiene un formato incorrecto");
            }
        }
    }
}
