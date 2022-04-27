package pl.kul;

import java.util.Random;

import static java.util.Arrays.fill;
import static java.util.Arrays.stream;

public class Zad6 {
    public static void zad6() {
        zad6ZParametrami(5,-5, 15);
    }

    public static void zad6ZParametrami(int n, int min, int max) {
        Random rand = new Random(System.currentTimeMillis());
        //tworze macierz n x n
        int[][] macierz = new int[n][n];

        //wypełniam utworzoną macierz losowymi elementami od min do max
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j] = min + rand.nextInt(max - min + 1);
            }
        }

        //wypisuje całą macierz
        System.out.printf("Wylosowana macierz %d x %d:\n",n,n);
        stream(macierz).forEach(row -> {
            stream(row).forEach(element -> System.out.printf("%-4d", element));
            System.out.println();
        });

        //tworze tablice na minima i maxima
        int[] maximums = new int[n];
        int[] minimums = new int[n];

        //wypełniam tablice, odpowiednimi wartościami, aby można je było poprawnie porównywać
        fill(maximums, min);
        fill(minimums, max);

        //szukam minimów i maximów dla każdej kolumny
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (macierz[j][i] < minimums[i]) minimums[i] = macierz[j][i];
                if (macierz[j][i] > maximums[i]) maximums[i] = macierz[j][i];
            }
        }

        //wypisuje minima i maxima dla każdej kolumny
        System.out.println("Minima dla każdej kolumny:");
        stream(minimums).forEach(e -> System.out.print(e + " "));
        System.out.println("\nMaxima dla każdej kolumny:");
        stream(maximums).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}