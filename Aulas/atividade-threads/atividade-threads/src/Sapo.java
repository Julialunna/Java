public class Sapo extends Thread{
    public double distanciaPulo;
    public double distanciaPercorrida;
    public double identificadorSapo;
    public double distanciaDaCorrida;
    public static double[] colocacoes;

    /*
    public static double[] getColocacoesGeral() {
        return colocacoes;
    }
    public static void setColocacoesGeral(double[] colocacoes) {
        Sapo.colocacoes = colocacoes;
    }
    public static double getColocacoes(int i) {
        return colocacoes[i];
    }
    public static void setColocacoes(double colocacao, int i) {
        Sapo.colocacoes[i] = colocacao;
    }
    public double getDistanciaDaCorrida() {
        return distanciaDaCorrida;
    }
    public void setDistanciaDaCorrida(double distanciaDaCorrida) {
        this.distanciaDaCorrida = distanciaDaCorrida;
    }
    public double getIdentificadorSapo() {
        return identificadorSapo;
    }
    public void setIdentificadorSapo(double identificadorSapo) {
        this.identificadorSapo = identificadorSapo;
    }
    public double getDistanciaPulo() {
        return distanciaPulo;
    }
    public void setDistanciaPulo(double distanciaPulo){
        this.distanciaPulo = distanciaPulo;
    }
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
     * 
     */


    public void mostraInformacoes(){
        System.out.println("Sapo: "+this.identificadorSapo+" distancia percorrida: "+this.distanciaPercorrida+" distancia pulo: "+this.distanciaPulo);
    }

    Sapo(double distanciaPulo, double identificadorSapo, double distanciaDaCorrida){
        this.distanciaPulo=distanciaPulo;
        this.identificadorSapo=identificadorSapo;
        this.distanciaDaCorrida=distanciaDaCorrida;
    }

    /*public void maisColocacoes(double id){
        if(Sapo.getColocacoesGeral()==null){
            Sapo.colocacoes=new double[1];
            Sapo.setColocacoes(id, 0);

        }else{
            double[] colocacoesReserva = new double[Sapo.getColocacoesGeral().length];
            for(int i=0; i<getColocacoesGeral().length;i++){
                colocacoesReserva[i]=Sapo.getColocacoes(i);
            }

            Sapo.colocacoes= new double [Sapo.getColocacoesGeral().length + 1];

            for(int i=0; i<colocacoesReserva.length;i++){
                Sapo.setColocacoes(colocacoesReserva[i], i);
            }
            Sapo.setColocacoes(id, Sapo.getColocacoesGeral().length-1);
        }
    }

    public static void imprimeColocacoes(){
        for(int i=0;i<Sapo.getColocacoesGeral().length;i++){
            System.out.println(Sapo.getColocacoes(i));
        }
    }*/

    public void run(){
        do{
            this.distanciaPercorrida=this.distanciaPercorrida+this.distanciaPulo;
            mostraInformacoes();
            if(this.distanciaPercorrida>=this.distanciaDaCorrida){
                System.out.println("Sapo: "+this.identificadorSapo+" chegou!");
                //this.maisColocacoes(this.identificadorSapo());
                /*for(int i=0;i<this.getColocacoesGeral().length;i++){
                    System.out.println(this.getColocacoes(i));
                }*/
            }
        }while(this.distanciaPercorrida<this.distanciaDaCorrida);
    }
}
