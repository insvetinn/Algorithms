package io;

public class Output {
        public static void print(Comparable[] array) {
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
                System.out.println();
        }
        
        // phalanx 方阵
        public static void phalanxPrint(Comparable[] array, int amountInRow) {
                for (int i = 0; i < array.length; i++) {
                        if ((i + 1) % amountInRow == 0) {
                                System.out.println(array[i] + " ");
                                // TODO: 4/15/22 format printing failed...
//                                System.out.printf("|%d|\d", array[i]);
                        } else {
                                System.out.print(array[i] + " ");
//                                System.out.printf("|%d|", array[i]);
                        }
                }
        }
        
        public static void phalanxPrint(Comparable[] array) {
                phalanxPrint(array, 20);
        }
        
        public static String castToString(Comparable[] array) {
                String string = "";
                for (int i = 0; i < array.length; i++) {
                        string += array[i] + " ";
                }
                return string;
        }
}
