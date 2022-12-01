public class Casa{
 String cor;
 int total_de_portas=0;
 Porta portas[];

 public void pinta (String cor_da_casa){
   this.cor=cor_da_casa;
 }

public void adiciona_porta (Porta p){
    Porta portas_reserva[]=new Porta[this.total_de_portas];
    int i;
    if (this.total_de_portas==0){
        this.portas=new Porta[1];
        this.portas[0]=p;
        this.total_de_portas++;
        
    }else{

      for(i=0;i<total_de_portas;i++){
        portas_reserva[i]=this.portas[i];
      }

      this.total_de_portas++;
      this.portas =new Porta[this.total_de_portas];

      for(i=0;i<portas_reserva.length;i++){
        this.portas[i]=portas_reserva[i];
      }
      this.portas[this.portas.length-1]=p;
    }
}

public void mostra_total_de_portas (){
    System.out.println(this.total_de_portas);
}

public void quantasPortasEstaoAbertas (){
    int i, portas_abertas=0;
    for(i=0;i<this.total_de_portas;i++){
        if(this.portas[i].esta_aberta==true){
            portas_abertas++;
        }
    }
    System.out.println(portas_abertas);
}

public void mostra_porta (){
    int i;
    for(i=0;i<this.total_de_portas;i++){
        System.out.println(this.portas[i].identificador);
        System.out.println(this.portas[i].cor);
        System.out.println(this.portas[i].esta_aberta);
    }
}

}