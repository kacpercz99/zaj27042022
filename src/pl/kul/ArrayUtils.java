package pl.kul;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    public static int[][] utworzTablice2D() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(System.currentTimeMillis());
        int n;
        do {
            System.out.println("Podaj wymiar tablicy 2D:");
            n = sc.nextInt();
        } while (n < 1);

        int[][] tab = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = rd.nextInt(11);
            }
        }

        return tab;
    }

    public static void printTab2D(int[][] tab) {
        for (int[] row : tab) {
            for (int element : row) {
                System.out.printf("%-3d ", element);
            }
            System.out.println();
        }
    }

    public static int findTraceIn2DArray(int[][] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i][i];
        }
        return sum;
    }

    public static int findMaxIn2DArray(int[][] tab) {
        int maxX = 0;
        int maxY = 0;
        int max = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] > max) {
                    max = tab[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }
        System.out.printf("Max w tablicy: %d\n Wiersz: %d\n Kolumna: %d\n", max, maxY + 1, maxX + 1);
        return max;
    }

    public static double findMeanIn2DArray(int[][] tab) {
        double sum = 0;
        for (int[] row : tab) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum / (tab.length * tab[0].length);
    }

    public static int findHowManyElementsIn2DArrayAreLargerThanMean(int[][] tab) {
        int counter = 0;
        double mean = findMeanIn2DArray(tab);
        for (int[] row : tab) {
            for (int element : row) {
                if (element > mean) {
                    counter++;
                }
            }
        }
        return counter;
    }
}