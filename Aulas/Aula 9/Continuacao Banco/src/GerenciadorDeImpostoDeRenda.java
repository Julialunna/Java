public class GerenciadorDeImpostoDeRenda {
    double valor;
    public double calculaTributos(Tributavel...conta){
        for (Tributavel i : conta) {
            valor=valor+i.calculaTributos();
        }
        return valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
