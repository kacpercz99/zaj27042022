import java.util.Random;
import java.util.Scanner;

public class Main {

    //zad1
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
        findMaxIn2DArray(tablica);
    }
}