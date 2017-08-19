package algorithm;

/**
 * This class will validate a Luhn sequence (most mainstream credit cards).
 */
public class Luhn {

    /**
     * @param luhnSequence sequence of numbers to check
     * @return true if sum end with a zero
     */
    public static boolean isValid(String luhnSequence) {
        int sum = 0;
        boolean isOddIndex = false;

        for (int i = luhnSequence.length() - 1; i > -1; i--) {

            // convert ASCII to Decimal
            int number = luhnSequence.charAt(i) - '0';

            if (isOddIndex) {
                number *= 2;
                if (number > 9) {
                    number -= 9;
                }
            }

            sum += number;
            isOddIndex = !isOddIndex;
        }

        return (sum % 10 == 0);
    }
}
