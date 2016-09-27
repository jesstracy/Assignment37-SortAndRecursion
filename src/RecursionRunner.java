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

    public long getFactorial(long number) {
        if (number == 1) {
            return number;
        }
        return number * getFactorial(number - 1);
    }

    public long getFib(long fibSeqNum) {
        if (fibSeqNum == 0 || fibSeqNum == 1) {
            return fibSeqNum;
        }
        return getFib(fibSeqNum - 1) + getFib(fibSeqNum - 2);
    }

}
