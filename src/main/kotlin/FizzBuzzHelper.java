public class FizzBuzzHelper {
    public static String calculateTextField(String inputText) {

        try {
            int value = Integer.parseInt(inputText);
            if (value == 0) {
                return "buzz";
            }
            if (value % 3 == 0) {
                return "fizz";
            }
            if (value % 5 == 0 && value % 3 == 0) {
                return "Fizz Buzz";
            } else {
                return "no";
            }
        } catch (Exception e) {
            return "please insert a number";
        }
    }
}