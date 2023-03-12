import java.io.Console;

public class Trabalhador extends Thread{
    String produto;
    int tempo;
    boolean parar=false;

    public Trabalhador(String produto, int tempo){
        this.produto=produto;
        this.tempo= tempo;
    }

    public void parar(){
        /* 
        { Thread.sleep(10000); } 
        catch (InterruptedException ex) {
            System.out.println("Erro");
        } 
        */ 
        this.parar=true;
    }

    public void run(){
        for(int i=0;this.parar==false;i++){
            System.out.println(i+" "+this.produto);
            try{
                sleep((long)(Math.random()*this.tempo));
            }catch(InterruptedException e){}
            if(i>90){
                this.parar();
            }
        }
        System.out.println("Terminei "+produto);
    }
}