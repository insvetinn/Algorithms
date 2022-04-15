package sort;

public final class SelectionSort extends Sort{
        @Override
        public void sort(Comparable[] array) {
                System.out.println("This is selectionSort. ");
                // selectionSort here
                for (int i = 0; i < array.length; i++) {
                        int min = i;
                        for (int j = i + 1; j < array.length; j++) {
                                if (less(array[j], array[min])) {
                                        min = j;
                                }
                        }
                        swap(array, i, min);
                }
        }
}
