/**
 * Created by jessicatracy on 9/27/16.
 */
public class RecursionRunner {
    static private long trackIterations = 0;
//    int currentFibNumber = 0;

    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
//        runner.recursionTest(0, 25);
        long myFib = runner.getFib(4);
        System.out.println("My fib number for " + 4 + ": " + myFib);
        System.out.println("Iterations: " + trackIterations);
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

//    public long getFib(long fibSeqNum) {
//        trackIterations++;
//        if (fibSeqNum == 0 || fibSeqNum == 1) {
//            return fibSeqNum;
//        }
//        return getFib(fibSeqNum - 1) + getFib(fibSeqNum - 2);
//    }

    public long getFib(long fibSeqNum) {
        return fastFib(0, 1, fibSeqNum);
    }

//    public long fastFib(int sliderNum1, int sliderNum2,long fibSeqNum) {
//        if (fibSeqNum == 0) {
//            return 0;
//        } else if (fibSeqNum == 1) {
//            return 1;
//        }
//        if (sliderNum2 < (fibSeqNum - 1)) {
//            System.out.println("Inside if statement");
//            currentFibNumber = sliderNum1 + sliderNum2;
//            return fastFib(sliderNum2, currentFibNumber, fibSeqNum);
//        }
//
//        return currentFibNumber;
//    }

    public long fastFib(long sliderNum1, long sliderNum2,long fibSeqNum) {
        if (fibSeqNum == 0) {
            return 0;
        } else if (fibSeqNum == 1) {
            return sliderNum2;
        }
        long currentFibNumber = sliderNum1 + sliderNum2;
        fibSeqNum--;
        return fastFib(sliderNum2, currentFibNumber, fibSeqNum);
    }


}
