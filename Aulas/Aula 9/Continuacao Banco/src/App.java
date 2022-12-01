public class App {
    public static void main(String[] args) throws Exception {

       Conta conta_teste=new ContaCorrente();
       ContaCorrente conta_teste2=new ContaCorrente();
       ContaPoupanca conta_teste3=new ContaPoupanca();
       SeguroDeVida seguro=new SeguroDeVida(100);
       double valor;
       AtualizadorDeContas obj=new AtualizadorDeContas(0.10);
       Banco bancos=new Banco();
       GerenciadorDeImpostoDeRenda gerente=new GerenciadorDeImpostoDeRenda();

       conta_teste.indentificador=1;
       conta_teste2.indentificador=2;
       conta_teste3.indentificador=3;

       conta_teste.depositar(100);
       conta_teste2.depositar(100);
       conta_teste3.depositar(100);
       valor=conta_teste3.calculaTributos();
       System.out.println(valor);
       valor=seguro.calculaTributos();
       System.out.println(valor);
       gerente.calculaTributos(seguro, conta_teste3);
       System.out.printf("O saldo e: %.2f", gerente.getValor());

    }
}
