package sort;

public class InsertionSort extends Sort {
        @Override
        public Comparable[] sort(Comparable[] array) {
                System.out.println("This is InsertionSort. ");
                // InsertionSort here
                int N = array.length;
                for (int i = 0; i < N; i++) {
                        for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                                swap(array, j, j - 1);
                        }
                }
                return array;
        }
}
