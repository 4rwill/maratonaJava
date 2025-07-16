package academy.devdojo.maratonajava.poo.Lenum.test;

import academy.devdojo.maratonajava.poo.Lenum.dominio.Cliente;
import academy.devdojo.maratonajava.poo.Lenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.poo.Lenum.dominio.TipoPagamento;

public class clienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Will", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Chris",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorRelatorio("PESSOA_FISICA");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente);

    }
}
