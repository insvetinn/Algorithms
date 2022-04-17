import io.Output;
import org.junit.runner.manipulation.InvalidOrderingException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TransferQueue;

public class RandomInteger {
        final static String filename = "./fileForTesting/randomIntegers.txt";
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
        
        public static Comparable[] generateNonRepetitive(int amount, int origin, int bound) {
                // TODO: 4/17/22 判断式是正确的吗...
                if (amount > bound - origin) {
                        message.Status.say("The amount of number is larger than the range. ");
                        System.exit(-1);
                }
                ArrayList<Comparable> arrayList = new ArrayList<>();
                arrayList.add(ThreadLocalRandom.current().nextInt(origin, bound));
                for (int i = 1; i < amount; i++) {
                        int flag = 0;
                        int num = ThreadLocalRandom.current().nextInt(origin, bound);
                        for (int j = 1; j < arrayList.size(); j++) {
                                if (arrayList.get(j).equals(num)) {
                                       flag++;
                                }
                        }
                        if (flag == 0) {
                                arrayList.add(num);
                        } else {
                                // conhe value of i, cancel this time's i++
                                i--;
                                continue;
                        }
                }
                Comparable[] array = new Comparable[arrayList.size()];
                for (int i = 0; i < array.length; i++) {
                        array[i] = arrayList.get(i);
                }
                return array;
        }
        
        public static Comparable[] generateNonRepetitive(int amount) {
                return generateNonRepetitive(amount, 100, 1000);
        }
        
        public static Comparable[] generateNonRepetitive() {
                // generate random 100 non-repetitive integers ranged in [100, 999]
                return generateNonRepetitive(100, 100, 1000);
        }
        
        public static void writeInTxt() throws IOException {
//                final String filename = "./fileForTesting/randomIntegers.txt";
//                Scanner input = new Scanner(Output.castToString(generate()));
                BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
                fw.write(Output.castToString(generate()));
//                input.close();
                fw.close();
                message.Status.say("New 100 random integers generated & succeeded to write in txt file! ");
        }
        
        public static void writeInTxtNonRepetitive() throws IOException {
                BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
                fw.write(Output.castToString(generateNonRepetitive()));
                fw.close();
                message.Status.say("New 100 random integers generated & succeeded to write in txt file! ");
        }
        
        public static void simpleWriteInTxtRepetitive() throws IOException {
                BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
                fw.write(Output.castToString(generate(20)));
                fw.close();
                message.Status.say("New 20 random integers generated & succeeded to write in txt file! ");
        }
        
        public static void simpleWriteInTxtNonRepetitive() throws IOException {
                BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
                fw.write(Output.castToString(generateNonRepetitive(20)));
                fw.close();
                message.Status.say("New 20 random integers generated & succeeded to write in txt file! ");
        }
}
