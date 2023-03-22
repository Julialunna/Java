public class Consumidor implements Runnable{
    PilhaSincronizada pilha;

    public Consumidor(PilhaSincronizada pilha){
        this.pilha=pilha;
    }

    public void run(){
        int colorIdx;
        for(int i=0; i<20;i++){
            colorIdx=pilha.pop();
            System.out.println("Usado: "+colorIdx);
            try{
                Thread.sleep((int)(Math.random()*5000));
            }catch(InterruptedException e){}
        }
    }

}
