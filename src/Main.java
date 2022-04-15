import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static final Pattern ROMAN_CHECK = Pattern.compile("");


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
        String[] expressionArray = input.split(" ");
        if (expressionArray.length != 3) {
            throw new Exception("Invalid format of operation: must be only 2 operands and 1 operator (+, -, /, *)");
        }
        Expression expression = new Expression(expressionArray[0], expressionArray[1], expressionArray[2]);
        return expression.calculate();
    }
}
