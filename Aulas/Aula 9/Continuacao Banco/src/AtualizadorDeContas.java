public class AtualizadorDeContas {
   private double saldoTotal = 0;
   private double selic;

   public AtualizadorDeContas( double selic) {
    this.setSelic(selic);
   }

   public void roda(Conta c){
    System.out.println("Saldo antes: "+c.getSaldo());
    c.atualiza(this.getSelic());
    System.out.println("Saldo depois: "+c.getSaldo());
    this.setSaldoTotal(this.getSaldoTotal()+c.getSaldo());
    System.out.println(this.getSaldoTotal());
   }


public double getSaldoTotal() {
    return saldoTotal;
}
public void setSaldoTotal(double saldoTotal) {
    this.saldoTotal = saldoTotal;
}
public double getSelic() {
    return selic;
}
public void setSelic(double selic) {
    this.selic = selic;
}

}
