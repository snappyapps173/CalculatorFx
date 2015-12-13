package sample.com.snappyapps.model;

/**
 * Created by jeromeraymond on 12/13/15.
 */
public class Model {
    public float calculate(long number1, long number2, String operator) {
        if (operator.equals("+")) {
            return number1 + number2;
        } else if (operator.equals("-")) {
            return number1 - number2;
        } else if (operator.equals("*")) {
            return number1 * number2;
        } else if (operator.equals("/")) {
            if (number2 == 0)
                return 0;
            return number1 / number2;
        } else {
            return 0;
        }

    }
}
