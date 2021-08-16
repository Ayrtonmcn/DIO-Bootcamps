package DesafioAritmeticoEmJava;

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima
da diagonal secundária da matriz, conforme ilustrado abaixo (área verde).
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio01AcimaDaDiagonalSecundaria {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < 11; ++i) {
            for (int j = 0; j < 11 - i; ++j) {
                soma += M[i][j];
            }
        }

        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2;

        System.out.println(String.format("%.1f", soma));
    }
}
