package DesafiosAvancadosEmJava;

/*
Nesse desafio você terá que desenvolver um programa que leia um valor e apresente o número de
Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série
de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele.
Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio01FibonacciEmVetor {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for (int i = 0; i < T; i++) {
            int N = leitor.nextInt();
            long anterior = 0, atual = 1, proximo = anterior + atual;
            for (int j = 0; j < N; j++) {
                atual = anterior;
                anterior = proximo;
                proximo = anterior + atual;
            }
            System.out.println("Fib("+ N +") = " + anterior);
        }
    }
}
