package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
        public static Comparable[] toArray(File filename) throws FileNotFoundException {
                ArrayList<Comparable> arrayList = new ArrayList<>();
                Scanner input = new Scanner(filename);
                while (input.hasNext()) {
                        arrayList.add(input.next());
                }
                input.close();
                Comparable[] array = new Comparable[arrayList.size()];
                for (int i = 0; i < array.length; i++) {
                        array[i] = arrayList.get(i);
                }
                return array;
        }
}
