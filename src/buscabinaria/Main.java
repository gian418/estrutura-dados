package buscabinaria;

import java.util.Scanner;

/**
 * Busca binaria é mais performatico que a linear
 * É necessario que esteja ordenado o vetor
 * Vai divividindo ao meio o vetor e verificando se a posicao de cada MEIO encontrado é igual, maior ou menor que o numero buscado.
 *  se for menor, utilizar a metade da frente do vetor. Se maior, utilizar a metade de tras. E fazendo dessa maneira, ate encontrar o numero a ser buscado.
 *
 *  Quando a busca nao é encontrada, o fim e o inicio se invertem
 *
 *  Complexidade é O(log n)
 */
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int  i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(i +" - "+ vetor[i]);
        }

        System.out.printf("Qual numero vc busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            
            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        if (achou) {
            System.out.println("Achei o numero " + buscado + " na posicao " + meio);
        } else {
            System.out.println("Nao achei =(");
        }
    }
}
