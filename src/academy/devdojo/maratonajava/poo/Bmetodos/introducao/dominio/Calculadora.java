package academy.devdojo.maratonajava.poo.Bmetodos.introducao.dominio;

public class Calculadora {
    public void somaDoisNum(){
        System.out.println(7+7);
    }
    public void subtraiDoisNum(){
        System.out.println(14-7);
    }
    public void multiplicandoNumero(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideNumero(double num1, double num2){
        if(num2==0){
            return 0;
        }
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisNum(double num1, double num2){
        if (num2==0){
            System.out.println("Não existe divisão por zero");
            return; //funciona tipo um if else só que mais limpo
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros (int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro da alteraDoisNumeros");
        System.out.println("numero1: "+numero1);
        System.out.println("numero2: "+numero2);

    }

    public void somaArray (int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
