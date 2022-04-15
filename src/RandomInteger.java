import io.Output;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInteger {
        public static Comparable[] generate(int amount, int origin, int bound) {
                ArrayList<Comparable> arrayList = new ArrayList<>();
                for (int i = 0; i < amount; i++) {
                        arrayList.add(ThreadLocalRandom.current().nextInt(origin, bound));
                }
                Comparable[] array = new Comparable[arrayList.size()];
                for (int i = 0; i < array.length; i++) {
                        array[i] = arrayList.get(i);
                }
                return array;
        }
        
        public static Comparable[] generate(int amount) {
                return generate(amount, 0, 100);
        }
        
        public static Comparable[] generate() {
                // generate 100 integers in [10, 99]
                return generate(100, 10, 100);
        }
        
        public static void writeInTxt() throws IOException {
                final String filename = "./fileForTesting/randomIntegers.txt";
//                Scanner input = new Scanner(Output.castToString(generate()));
                BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
                fw.write(Output.castToString(generate()));
//                input.close();
                fw.close();
                message.Status.say("New 100 random integers generated & succeeded to write in txt file! ");
        }
}
