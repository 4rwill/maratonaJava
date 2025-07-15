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
    }
}
