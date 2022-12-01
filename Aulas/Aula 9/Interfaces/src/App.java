public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado=new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 2);
        Circulo circulo=new Circulo(4);
        System.out.println(circulo.calculaArea());
        System.out.println(quadrado.calculaArea());
        System.out.println(retangulo.calculaArea());
    }
}
