public class Produtor implements Runnable{
    PilhaSincronizada pilha;

    public Produtor(PilhaSincronizada pilha){
        this.pilha=pilha;
    }

    public void run(){
        int colorIdx;
        for(int i=0; i<40;i++){
            colorIdx=(int)(Math.random()*i);
            pilha.push(colorIdx);
            System.out.println("Criado: "+colorIdx);
            try{
                Thread.sleep((int)(Math.random()*1000));
            }catch(InterruptedException e){}
        }
    }

}
