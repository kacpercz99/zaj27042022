package pl.kul;

import static pl.kul.ArrayUtils.*;

public class Main {

    public static void main(String[] args) {
        //1)Pobierz liczbę elementów nz klawiatury.
        // Utwórz tablicę o wymiarze n x n.
        // Wypełnij ją losowymi liczbami z zakresu 0 –10.
        // a. Oblicz sumę liczb, znajdujących się na przekątnych.
        // Wykonaj podobne działanie dla tablicy n x n x n.
        // b. Znajdź największą wartość w tablicy wielowymiarowej n x n,
        // wyświetl jej indeksy (który wiersz i kolumna)
        // c. Oblicz, ile liczb jest większych od średniej elementów tablicy
        int[][] tablica = utworzTablice2D();
        printTab2D(tablica);
        System.out.println("Slad macierzy: " + findTraceIn2DArray(tablica));
        int maxInTab = findMaxIn2DArray(tablica);
    }
}