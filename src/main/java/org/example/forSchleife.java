package org.example;

public class forSchleife {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i * j) / 10 == 0) {
                    System.out.print(" ");
                }
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
