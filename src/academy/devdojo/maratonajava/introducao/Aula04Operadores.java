package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores básicos: + - * / %
        int n1 = 20;
        int n2 = 10;
        System.out.println("Soma: "+(n1+n2));
        System.out.println("Subtração: "+(n1-n2));
        System.out.println("Multiplicação: "+(n1*n2));
        System.out.println("Divisão: "+(n1/n2));
        System.out.println("Resto: "+(n1%n2));
        //Usa esse pararênteses pra não misturar o + de soma com o + de concatenação7

        //Operadores com saídas Booleanas(True/False)
        boolean isMaior = n1>n2;
        boolean isMenor = n1<n2;
        boolean isIgual = n1 == n2;
        boolean isDiferente = n1 != n2;
        System.out.println(n1 + " é maior que " + n2 + "?: " + isMaior);
        System.out.println(n1 + " é menor que " + n2 + "?: " + isMenor);
        System.out.println(n1 + " é igual a " + n2 + "?: " + isIgual);
        System.out.println(n1 + " é diferente de " + n2 + "?: " + isDiferente);

        //Operadores Lógicos: &&(AND), ||(OR), !(NOT)

        int idade = 20;
        float saldo = 1500F;
        int idadeMin = 18;
        float saldoMin = 500F;
        boolean isPermitidoMenor = idade < idadeMin && saldo >= saldoMin;
        boolean isPermitidoMaior = idade >= idadeMin && saldo >=saldoMin*2;
        System.out.println("É permitido menor: "+isPermitidoMenor);
        System.out.println("É permitido maior: "+isPermitidoMaior);

        double valorCelular = 2000;
        double saldoContaCorrente = 1500;
        double saldoContaPoupanca = 2500;
        boolean isCelularCompravavel = saldoContaCorrente >= valorCelular || saldoContaPoupanca >= valorCelular;

        System.out.println("Celular é comprável?: " + isCelularCompravavel);

        //Operadores de Atribuição : +=, -=, *=, /=
        double saldoB = 2000;
        double bonus = 1000;
        saldoB += bonus;
        System.out.println("O saldo atual é " + saldoB + ", após receber um bonus de " + bonus);

        //Operadores pra Contador = ++, --
        int contador = 0;
        contador++; // Vai somar 1 ao valor do contador
        System.out.println("Contador: " + contador);
        contador--; // Vai diminuir 1 ao valor do contador
        System.out.println("Contador: " + contador);
        // A ordem de adicionar o ++ faz diferença, podendo ser adicionado tanto antes quanto depois do nome da variável


    }
}
