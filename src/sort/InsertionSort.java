package sort;

public final class InsertionSort extends Sort {
        @Override
        public void sort(Comparable[] array) {
                System.out.println("This is InsertionSort. ");
                // InsertionSort here
                for (int i = 0; i < array.length; i++) {
                        for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                                swap(array, j, j - 1);
                        }
                }
        }
}
