package pl.kul;

import static pl.kul.ArrayUtils.*;

public class Main {

    public static void main(String[] args) {
        int[][] tablica = utworzTablice2D();
        printTab2D(tablica);
        System.out.println("Ślad macierzy: " + findTraceIn2DArray(tablica));
        ElementAndIndexes maxAndIAndJ = findMaxIn2DArray(tablica);
        System.out.printf(
                """
                Max: %d
                Na indeksie [%d][%d]
                """,
                maxAndIAndJ.element,
                maxAndIAndJ.i,
                maxAndIAndJ.j
        );
        double mean = findMeanIn2DArray(tablica);
        System.out.println("Średnia tablicy: " + mean);
        System.out.println("Jest " + findHowManyElementsIn2DArrayAreLargerThanMean(tablica) +
                " większych od średniej tablicy.");
    }
}