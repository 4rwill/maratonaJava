package academy.devdojo.maratonajava.exercicios.exercicio01;

public class Calculadora {
    double num1;
    double num2;
    String operador;
    double resultado;
    public void init(double num1, double num2, String operador){
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }
    public void calcular(){
        if (this.operador == "+"){
            resultado = this.num1 + this.num2;
        }
        if (this.operador == "-"){
            resultado = this.num1 - this.num2;
        }
        if (this.operador == "*"){
            resultado = this.num1 * this.num2;
        }
        if (this.operador == "/"){
            if (this.num2== 0){
                System.out.println("Divida por um número diferente de 0");
                return;//vai fazer não continuar o bloco, nao imprimindo o resultado
            }
            resultado = this.num1 / this.num2;
        }
        System.out.println(resultado);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
