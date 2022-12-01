public class Quadrado implements AreaCalculavel{
    double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calculaArea(){
        return Math.pow(this.getLado(), 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
