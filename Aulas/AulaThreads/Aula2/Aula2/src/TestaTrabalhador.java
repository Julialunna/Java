public class TestaTrabalhador {
    public static void main(String[] args){
        
        PilhaSincronizada pilha1 = new PilhaSincronizada();
        Consumidor consumidor1 = new Consumidor(pilha1);
        Produtor produtor1 = new Produtor(pilha1);

        Thread t1 = new Thread(produtor1);
        Thread t2 = new Thread(consumidor1);
        t1.start();
        t2.start();
        
    }
}
