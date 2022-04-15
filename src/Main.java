import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println(calc(reader.readLine()));;
            }
        } catch (Exception e) {
            if (e instanceof IOException) {
                e.printStackTrace();
            } else {
                throw new Exception(e.getMessage());
            }
        }
    }

    public static String calc(String input) throws Exception {
        String[] expressionElements = input.split(" ");
        if (expressionElements.length != 3) {
            throw new Exception("Invalid format of operation: must be only 2 operands and 1 operator (+, -, /, *)");
        }
        Expression expression = new Expression(expressionElements[0], expressionElements[1], expressionElements[2]);
        return expression.calculate();
    }
}
