public class CorridaDeSapo {
    private int distanciaCorrida;
    private int numSapos;

    public int getDistanciaCorrida() {
        return distanciaCorrida;
    }
    public void setDistanciaCorrida(int distanciaCorrida) {
        this.distanciaCorrida = distanciaCorrida;
    }
    public int getNumSapos() {
        return numSapos;
    }
    public void setNumSapos(int numSapos) {
        this.numSapos = numSapos;
    }

    public CorridaDeSapo(int distanciaCorrida, int numSapos){
        this.setNumSapos(numSapos);
        this.setDistanciaCorrida(distanciaCorrida);
    }

    public void mostraInformacoes(){
        System.out.println(this.getDistanciaCorrida());
        System.out.println(this.getNumSapos());
    }

    public void criaSapos(){
        double puloMinimo=0.5;

        for(double i=1;i<this.getNumSapos()+1;i++){
            new Sapo(puloMinimo+i/4.0, i, this.getDistanciaCorrida()).start();
        }
    
    }
}


