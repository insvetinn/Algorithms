import compare.SortCompare;
import io.Input;
import io.Output;
import sort.InsertionSort;
import sort.SelectionSort;
import sort.ShellSort;
import sort.Sort;

import java.io.File;
import java.io.IOException;

public class Test {
        private final static String filename = "./fileForTesting/randomIntegers.txt";
        @org.junit.Test
        public void selectionSortTest() throws IOException {
                RandomInteger.writeInTxt();
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void randomIntegerGenerationTesting() throws IOException {
                RandomInteger.writeInTxt();
        }
        
        @org.junit.Test
        public void insertionSortTest() throws IOException {
                RandomInteger.writeInTxt();
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void shellSortTest() throws IOException {
                RandomInteger.writeInTxt();
                ShellSort shellSort = new ShellSort();
                shellSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void sortTinyTxt() throws IOException {
                final String filename = "./../../dev/algs4-data/tiny.txt";
                io.Output.print(io.Input.toArray(new File(filename)));
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.process(new File(filename));
        }
        
//        // NOTICE: It's too large. Don't run it. Otherwise, computer's temperature will arise sharply.
//        @org.junit.Test
//        public void sortLargeEWDTxt() throws IOException {
//                final String filename = "./../../dev/algs4-data/largeEWD.txt";
//                io.Output.print(io.Input.toArray(new File(filename)));
//                SelectionSort selectionSort = new SelectionSort();
//                selectionSort.process(new File(filename));
//        }
        
        @org.junit.Test
        public void writeInTxtNonRepetitiveTesting() throws IOException{
                RandomInteger.writeInTxtNonRepetitive();
                Output.phalanxPrint(Input.toArray(new File(filename)));
        }
        
        @org.junit.Test
        public void writeInTxtNonRepetitiveSortedTesting() throws IOException {
                RandomInteger.writeInTxtNonRepetitive();
                Output.phalanxPrint(Input.toArray(new File(filename)));
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void simpleWriteInTxtNonRepetitiveSortedTesting() throws IOException {
                RandomInteger.simpleWriteInTxtNonRepetitive();
                Output.phalanxPrint(Input.toArray(new File(filename)));
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void testSortTime() {
                Comparable[] notSortedArray = new Sort().sort(RandomInteger.generateNonRepetitive(10_000, 10_000, 100_000));
                System.out.println("Sorting a not sorted array. ");
                SortCompare.getTime(SortCompare.SELECTION_SORT, notSortedArray);
                SortCompare.getTime(SortCompare.INSERTION_SORT, notSortedArray);
                SortCompare.getTime(SortCompare.SHELL_SORT, notSortedArray);
                
                Comparable[] sortedArray = new SelectionSort().sort(RandomInteger.generateNonRepetitive(10_000, 10_000, 100_000));
                System.out.println("Sorting a sorted array. ");
                System.out.println(SortCompare.time(SortCompare.SELECTION_SORT, sortedArray));
                System.out.println(SortCompare.time(SortCompare.INSERTION_SORT, sortedArray));
                System.out.println(SortCompare.time(SortCompare.SHELL_SORT, sortedArray));
        }
}
