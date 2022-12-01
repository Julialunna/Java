public class SeguroDeVida implements Tributavel{
    protected double valor;

    public SeguroDeVida(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calculaTributos(){
        return 42;
    }
}
