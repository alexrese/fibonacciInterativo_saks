/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciinterativo;

import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class FibonacciInterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula o N-ésimo elemento da série de Fibonacci.");
        System.out.println("Entre o valor N. Note que o primeiro valor é zero: ");
        int n = Integer.parseInt(scanner.nextLine());
        long tempoInicio = System.currentTimeMillis();
        long resultado = fibonacci(n);
        System.out.println("O "+n+"-ésimo elemento da série Fibonacci é "+resultado+".");
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
    }
    
    static long fibonacci(int n){
        long i = 1;
        long j = 0;
        long t;
        for(int k = 1; k <= n; k++){
            t = i + j;
            i = j;
            j = t;
        }
        return j;
    }
    
}
