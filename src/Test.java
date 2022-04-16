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
}
