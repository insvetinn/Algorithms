package sort;

public class ShellSort extends Sort {
        @Override
        public void sort(Comparable[] array) {
                System.out.println("This is ShellSort. ");
                // ShellSort here
                int N = array.length;
                int h = 1;
                while (h < N / 3) {
                        h = h * 3 + 1;
                }
                while (h >= 1) {
                        for (int i = h; i < N; i++) {
                                for (int j = i; j > h && less (array[j], array[j - h]); j--) {
                                        swap(array, j, j - h);
                                }
                        }
                        h /= 3;
                }
        }
        
        // TODO: 4/16/22 first integer not sorted in ShellSort...
//        OUTPUT i.e.
//        New 100 random integers generated & succeeded to write in txt file!
//        This is ShellSort.
//        50 10 11 13 17 18 19 19 20 23 24 25 26 28 28 29 29 29 30 32
//        33 33 34 34 37 38 38 39 40 40 41 42 43 44 44 45 46 47 48 49
//        49 49 50 51 53 53 54 56 57 58 61 62 62 63 64 64 64 67 67 70
//        70 72 73 77 77 77 77 79 80 80 80 81 81 81 83 83 83 84 87 87
//        87 87 88 88 88 89 89 91 91 93 94 94 95 95 97 97 97 97 98 98
//        SUCCESS!
}
