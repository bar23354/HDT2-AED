/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos – sección 40
 * Roberto Barreda – 23354 | Mia Fuentes - 23775
 */

 import java.util.EmptyStackException;
 import java.util.Stack;

public class CalculatorPostfix implements Calculator {
    private Stack<Integer> stack;

    public CalculatorPostfix() {
        stack = new Stack<>();
    }

    @Override
    public int evaluatePostfix(String expression) throws IllegalArgumentException {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperand(token)) {
                stack.push(Integer.parseInt(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Insufficient operands for operation: " + token);
                }

                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = performOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token in expression: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression format");
        }

        return stack.pop();
    }

    //MIaaaaaa!! Llenar aqui

}