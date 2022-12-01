public class Banco {
    Conta[] contas;

    public Conta[] getContas_geral() {
        return contas;
    }

    public void setContas_geral(Conta[] contas) {
        this.contas = contas;
    }

    public Conta getContas(int i) {
        return contas[i];
    }

    public void setContas(Conta conta, int i) {
        this.contas[i] = conta;
    }

    void adiciona(Conta c){
        if(this.contas==null){
            this.contas=new Conta[1];
            this.setContas(c, 0);

        }else{
            Conta[] contas_reserva = new Conta[this.contas.length];
            for(int i=0; i<contas.length;i++){
                contas_reserva[i]=this.getContas(i);
            }

            this.contas= new Conta[this.contas.length + 1];

            for(int i=0; i<contas_reserva.length;i++){
                this.setContas(contas_reserva[i], i);
            }
            
            this.setContas(c, this.contas.length-1);
        }
    }

    public Conta pega_conta(int i){
        return getContas(i);
    }

    public int total_de_contas(){
        System.out.println(this.contas.length);
        return this.contas.length;
    }
}
