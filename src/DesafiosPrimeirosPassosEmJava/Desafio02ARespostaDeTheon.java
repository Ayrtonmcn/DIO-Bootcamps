package DesafiosPrimeirosPassosEmJava;

/*
 * Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."
 *
 * Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá
 * fazer depois que Theon der sua resposta.
 *
 * Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a
 * N. Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.
 * Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes
 * que ele será atingido.
 */


import java.io.IOException;
import java.util.Scanner;

public class Desafio02ARespostaDeTheon {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();           // indicará o número de pessoas
        int T, menor = 0, posMenor = 0;

        for (int i = 1; i <= N; i++) {      // i indicará a posição da pessoa
            T = leitor.nextInt();           // será pedido o número de "identificação de cada pessoa

            if (i == 1) {
                menor = T;
                posMenor = i;
            }else if (T < menor) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);
    }
}
