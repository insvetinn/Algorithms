package compare;

import edu.princeton.cs.algs4.Stopwatch;
import sort.InsertionSort;
import sort.SelectionSort;
import sort.ShellSort;

public class SortCompare {
        final private static String filename = "./fileForTesting/randomIntegers.txt";
        final public static String SELECTION_SORT = "SELECTION_SORT";
        final public static String INSERTION_SORT = "INSERTION_SORT";
        final public static String SHELL_SORT = "SHELL_SORT";
        // TODO: 4/17/22 enum usage...
//        public static enum SortMethod {
//                SORT,
//                SELECTION_SORT,
//                INSERTION_SORT,
//                SHELL_SORT
//        }
       
        public static double time(String sortMethod, Comparable[] array) {
                Stopwatch timer = new Stopwatch();
                switch (sortMethod) {
//                        case "SORT":
//                                // do nothing here
//                                break;
                        case INSERTION_SORT:
                                new InsertionSort().sort(array);
                                break;
                        case SELECTION_SORT:
                                new SelectionSort().sort(array);
                                break;
                        case SHELL_SORT:
                                new ShellSort().sort(array);
                                break;
                        default:
                                //do nothing here
                                break;
                }
                return timer.elapsedTime();
        }
        
        public static void getTime(String sortMethod, Comparable[] array) {
                System.out.println(time(sortMethod, array));
        }
}
