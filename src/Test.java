import edu.princeton.cs.algs4.Selection;
import sort.InsertionSort;
import sort.SelectionSort;
import sort.ShellSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
        private final String filename = "./fileForTesting/randomIntegers.txt";
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
}
