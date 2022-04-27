package pl.kul;
import java.util.Random;

import static java.util.Arrays.*;

public class Zad6 {
    public static void zad6() {
        int[][] macierz = new int[5][5];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = -5 + rand.nextInt(21);
            }
        }

        System.out.println("Wylosowana macierz 5 x 5:");

        stream(macierz).forEach(row -> {
            stream(row).forEach(element -> System.out.print(element + " "));
            System.out.println();
        });

        int[] maximums = {-6, -6, -6, -6, -6};
        int[] minimums = {16, 16, 16, 16, 16};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (macierz[j][i] < minimums[i]) minimums[i] = macierz[j][i];
                if (macierz[j][i] > maximums[i]) maximums[i] = macierz[j][i];
            }
        }

        System.out.println("Minima dla każdej kolumny:");
        stream(minimums).forEach(e -> System.out.print(e + " "));
        System.out.println("\nMaxima dla każdej kolumny:");
        stream(maximums).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}