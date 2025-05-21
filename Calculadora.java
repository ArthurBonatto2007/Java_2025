/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author ARTHURBONATTODALLAGN
 */


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("====Calculadora=====");
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int n1 = ler.nextInt();
        
        System.out.println("Digite outro numero:");
        int n2 = ler.nextInt();
        
        System.out.println("Digite a operação (+, -, *, /):");
        String op = ler.next();
        
        if(op.equals("+")) {
            int soma = n1 + n2;
            System.out.println("A soma é: " + soma);
            
        } else if(op.equals("-")) {  
            int sub = n1 - n2;
            System.out.println("A subtração é: " + sub);
            
        } else if(op.equals("*")) {  
            int mul = n1 * n2;
            System.out.println("A multiplicação é: " + mul);
            
        } else if(op.equals("/")) {  
            if(n2 != 0) {
                int div = n1 / n2;
                System.out.println("A divisão é: " + div);
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }
        
        }
    }
}
