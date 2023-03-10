public class CorridaDeSapo {
    public int distanciaCorrida;
    public int numSapos;

    /*public int getDistanciaCorrida() {
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
    }*/

    public CorridaDeSapo(int distanciaCorrida, int numSapos){
        this.numSapos=numSapos;
        this.distanciaCorrida=distanciaCorrida;
    }

    public void mostraInformacoes(){
        System.out.println(this.distanciaCorrida);
        System.out.println(this.numSapos);
    }

    public void criaSapos(){
        double puloMinimo=0.5;

        for(double i=1;i<this.numSapos+1;i++){
            new Sapo(puloMinimo+i/4.0, i, this.distanciaCorrida).start();
        }
    
    }
}


