package sort;

public final class SelectionSort extends Sort{
        @Override
        public void sort(Comparable[] array) {
                System.out.println("This is SelectionSort. ");
                // SelectionSort here
                int N = array.length;
                for (int i = 0; i < N; i++) {
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
