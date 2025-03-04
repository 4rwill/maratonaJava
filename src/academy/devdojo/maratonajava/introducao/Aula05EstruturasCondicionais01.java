package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // Operador: IF
        int idade = 2;
        boolean isPermitidoDirigir = idade >= 18;
        if (isPermitidoDirigir) {
            System.out.println("Pode dirigir");
        }
        if (!isPermitidoDirigir){
            System.out.println("Não pode dirigir");
        }
    }
}
