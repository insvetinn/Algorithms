import sort.SelectionSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
        @org.junit.Test
        public void selectionSortTest() throws IOException {
                RandomInteger.writeInTxt();
                final String filename = "./fileForTesting/randomIntegers.txt";
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.process(new File(filename));
        }
        
        @org.junit.Test
        public void randomIntegerGenerationTesting() throws IOException {
                RandomInteger.writeInTxt();
        }
}
