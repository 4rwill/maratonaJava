package academy.devdojo.maratonajava.poo.Lenum.dominio;

public enum TipoPagamento {
    DEBITO(1),
    CREDITO(2);

    public final int valor;

    TipoPagamento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
