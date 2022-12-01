public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa){
        taxa=taxa*3;
        this.setSaldo(this.getSaldo()*taxa+this.getSaldo());
        System.out.println(this.saldo);
    }
}
