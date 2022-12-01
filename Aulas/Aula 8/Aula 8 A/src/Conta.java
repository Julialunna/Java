public abstract class Conta {
    protected double saldo=0;
    int indentificador;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double pegar_saldo (){
        System.out.println(this.saldo);
        return this.saldo;
    }

    public double depositar (double valor){
        this.setSaldo(this.getSaldo()+valor);
        System.out.println(this.saldo);
        return this.saldo;
    }

    public double sacar (double valor){
        this.setSaldo(this.getSaldo()-valor);
        System.out.println(this.saldo);
        return this.saldo;
    }
    
    public abstract void atualiza(double taxa);

}
