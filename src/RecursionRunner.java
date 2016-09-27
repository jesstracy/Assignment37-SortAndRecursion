/**
 * Created by jessicatracy on 9/27/16.
 */
public class RecursionRunner {
    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
        runner.recursionTest(0, 25);
    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count + 1, max);
    }

    public int getFactorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * getFactorial(number - 1);
    }

}
