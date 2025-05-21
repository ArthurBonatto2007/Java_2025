

package com.mycompany.meutrabalhojava;

import java.util.Scanner;

/**
 *
 * @author ARTHURBONATTODALLAGN
 */
public class MeuTrabalhoJava {

    public static void main(String[] args) {
        System.out.println("1️⃣ Números pares de 1 a 10:");
        numerosPares();

        System.out.println("\n2️⃣ Números de 1 a 10 e se são pares ou ímpares:");
        parOuImpar();

        System.out.println("\n3️⃣ Tabuada de um número:");
        tabuada();

        System.out.println("\n4️⃣ Dobro dos números de 1 a 10:");
        dobro();

        System.out.println("\n5️⃣ Quadrado dos números de 1 a 10:");
        quadrado();

        System.out.println("\n6️⃣ Contagem regressiva de 10 a 1:");
        contagemRegressiva();
    }

    // Exercício 1
    public static void numerosPares() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Exercício 2
    public static void parOuImpar() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }
    }

    // Exercício 3
    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Exercício 4
    public static void dobro() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dobro de " + i + " é " + (2 * i));
        }
    }

    // Exercício 5
    public static void quadrado() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Quadrado de " + i + " é " + (i * i));
        }
    }

    // Exercício 6
    public static void contagemRegressiva() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
