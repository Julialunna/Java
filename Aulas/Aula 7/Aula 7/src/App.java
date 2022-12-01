public class App {
    public static void main(String[] args) throws Exception {

       Conta conta_teste=new Conta();
       ContaCorrente conta_teste2=new ContaCorrente();
       ContaPoupanca conta_teste3=new ContaPoupanca();
       AtualizadorDeContas obj=new AtualizadorDeContas(0.10);
       Banco bancos=new Banco();

       conta_teste.indentificador=1;
       conta_teste2.indentificador=2;
       conta_teste3.indentificador=3;

       conta_teste.depositar(100);
       conta_teste2.depositar(200);
       conta_teste3.depositar(300);

       bancos.adiciona(conta_teste);
       bancos.adiciona(conta_teste2);
       bancos.adiciona(conta_teste3);

       for(int i=0;i<bancos.contas.length;i++){
        obj.roda(bancos.getContas(i));
       }
       

       conta_teste.sacar(10);
       conta_teste2.sacar(20);
       conta_teste3.sacar(30);

    }
}
