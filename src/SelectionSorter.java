/**
 * Created by jessicatracy on 9/27/16.
 */
public class SelectionSorter extends BaseSorter {
    public void sort(int[] arrayToSort) {
        for (int startingPlace = 0; startingPlace < arrayToSort.length; startingPlace++) {
            for (int currentPlace = startingPlace; currentPlace < arrayToSort.length; currentPlace++) {
                if (arrayToSort[currentPlace] < arrayToSort[startingPlace]) {
                    swapNumbers(currentPlace, startingPlace, arrayToSort);
                }
            }
            printNumbers(arrayToSort);
        }
    }
}
