/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author 60001286
 */
public class Exercicios {
    
    Scanner scanner = new Scanner(System.in);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 1
    public void calcularMedia() {

        int qtdNotas;
        float resultado = 0;

        System.out.println("Informe o numero de notas: ");
        qtdNotas = scanner.nextInt();

        int vetorMedias[] = new int[qtdNotas];

        for (int i = 1; i <= qtdNotas; i++) {
            System.out.println("Informe a " + i + " nota: ");
            vetorMedias[i-1] = scanner.nextInt();
            resultado = resultado + vetorMedias[i-1];
        }
        resultado = resultado / qtdNotas;

        System.out.println("A media entre os numeros informados e : " + resultado);

        if (resultado >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
      
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 2
    public void exibirInformacoesUser() {

        String nome;
        int idade;
        String genero;
        String corfavorita;
        int praticaEsporte;

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Informe o seu genero: ");
        genero = scanner.next();

        System.out.println("Informe a sua cor favorita: ");
        corfavorita = scanner.next();

        System.out.println("Pratica esporte? Digite 1 se sim ou 0 se nao.");
        praticaEsporte = scanner.nextInt();

        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nGenero: " 
                + genero + "\nCor favorita: " + corfavorita + "\nPratica esporte: ");
        switch (praticaEsporte) {
            case 1 ->
                System.out.println("Sim");
            case 0 ->
                System.out.println("Nao");
            default ->
                System.out.println("opcao invalida");
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 3
    public void operacoesAritimeticas() {
        int num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Adicao: " + (num1 + num2) + "\nSubtracao: " + (num1 - num2) 
                + "\nDivisao: " + (num1 / num2) + "\nMultiplicacao: " + (num1 * num2));
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 4
    public void maiorMenor() {
        int num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num1 + " é igual " + num2);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 5
    public void imparPar() {

        int num;

        System.out.println("Informe um numero: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " e par");
        } else {
            System.out.println(num + " e impar");
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 6
    public void exponenciacao() {

        int num;

        System.out.println("Informe um numero: ");
        num = scanner.nextInt();

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(Math.pow(num, i));
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 7
    public void operacoesRelacionais() {
        int num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Informe o primeiro numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }
        if (num1 == num2) {
            System.out.println(num1 + " é igual" + num2);
        } else {
            System.out.println(num1 + " é diferente de " + num2);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 8
    public void valorRelogioAgua() {

        int valorDia1, valorDia30, litrosConsumidos, mediaConsumida;

        System.out.println("Informe o valor no primeiro dia: ");
        valorDia1 = scanner.nextInt();

        System.out.println("Informe o valor do segundo dia: ");
        valorDia30 = scanner.nextInt();

        litrosConsumidos = valorDia30 - valorDia1;
        mediaConsumida = litrosConsumidos / 30;

        System.out.println("A quantidade de litros consumido é " + litrosConsumidos);
        System.out.println("A media consumida no mes e " + mediaConsumida);

    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Exercicio 10
    public void exponenciacaoRaizQuadrada() {
       float num;
      
        System.out.println("Informe um numero: ");
        num = scanner.nextInt();

        if (num > 10 && num < 100) {
            System.out.println(num + " elevado a 2 e " + String.format("%.5f", Math.pow(num, 2)));
        } else {
            System.out.println("A raiz quadrada de " + num + " e " + String.format("%.5f", Math.sqrt(num)));
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
