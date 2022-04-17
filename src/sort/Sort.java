package sort;

import io.Input;
import io.Output;

import java.io.File;
import java.io.FileNotFoundException;

public class Sort {
        public Comparable[] sort(Comparable[] array) {
                System.out.println("This is Sort. ");
                // do nothing here
                return array;
        }
        
        protected static boolean less(Comparable v, Comparable w) {
                return v.compareTo(w) < 0;
        }
        
        protected static void swap(Comparable[] array, int i, int j) {
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
        }
        
        protected static boolean isSorted(Comparable[] array) {
                for (int i = 1 /* not 0 */; i < array.length; i++) {
                        if (less(array[i], array[i - 1])) {
                                return false;
                        }
                }
                return true;
        }
        
        public void process(File filename) throws FileNotFoundException {
                Comparable[] array = Input.toArray(filename);
                sort(array);
//                assert isSorted(array);
                // TODO: 4/15/22 assert need learning...
//                Output.print(array);
                Output.phalanxPrint(array);
                message.Status.saySuccess();
        }
}
