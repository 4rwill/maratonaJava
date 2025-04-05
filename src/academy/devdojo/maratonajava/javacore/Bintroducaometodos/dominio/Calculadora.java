package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

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
}
