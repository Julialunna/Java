public class ContaPoupanca extends Conta implements Tributavel{
    @Override
    public void atualiza(double taxa){
        taxa=taxa*3;
        this.setSaldo(this.getSaldo()*taxa+this.getSaldo());
        System.out.println(this.saldo);
    }
    public double calculaTributos(){
        return 0.01*this.getSaldo();
    }
}
