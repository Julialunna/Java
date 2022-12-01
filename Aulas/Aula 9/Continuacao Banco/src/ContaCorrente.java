public class ContaCorrente extends Conta{
    @Override
    public void atualiza(double taxa){
        taxa=taxa*2;
        this.setSaldo(this.getSaldo()*taxa+this.getSaldo());
        System.out.println(this.saldo);
    }
    @Override

    public double depositar (double valor){
        this.setSaldo(this.getSaldo()-0.10);
        this.setSaldo(this.getSaldo()+valor);
        System.out.println(this.saldo);
        return this.saldo;
    }
}
