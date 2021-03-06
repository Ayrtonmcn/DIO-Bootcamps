package DesafiosAritmeticoEmJava;

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão abaixo
da diagonal principal da matriz, conforme ilustrado abaixo (área verde).
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio03AbaixoDaDiagonalPrincipal {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++)
                M[i][j] = leitor.nextDouble();
        }

        for (int i = M.length - 1; i > 0; --i) {
            for (int j = 0; j < i; j++) {
                soma += M[i][j];
            }
        }

        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2;

        System.out.println(String.format("%.1f", soma));
    }
}
