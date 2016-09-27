/**
 * Created by jessicatracy on 9/27/16.
 */
public class SortingRunner {
    //Original version
//    public void bubbleSort(int[] arrayToSort) {
//        int initialMax = arrayToSort.length;
//        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
//            for (int counter = 0; counter < currentMax - 1; counter++) {
//                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
//                    swapNumbers(counter, counter + 1, arrayToSort);
//                }
//            }
//            printNumbers(arrayToSort);
//        }
//    }

    //Refactored version, not doing currentMax--
//    public void bubbleSort(int[] arrayToSort) {
//        int initialMax = arrayToSort.length;
////        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
//        while(true) {
//            boolean swapHappened = false;
//            for (int counter = 0; counter < initialMax - 1; counter++) {
//                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
//                    swapNumbers(counter, counter + 1, arrayToSort);
//                    swapHappened = true;
//                }
//            }
//            if (!swapHappened) {
//                break;
//            }
//            printNumbers(arrayToSort);
//        }
//    }




}

