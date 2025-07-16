package academy.devdojo.maratonajava.poo.Lenum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Jurídica"),
    PESSOA_FISICA(2, "Pessoa Física");

    public final int valor;
    public final String relatorio;

    TipoCliente(int valor, String relatorio) {
        this.valor = valor;
        this.relatorio = relatorio;
    }

    public static TipoCliente tipoClientePorRelatorio(String relatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getRelatorio().equals(relatorio)){
                return tipoCliente;
            }
            
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getRelatorio() {
        return relatorio;
    }
}
