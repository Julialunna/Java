public class App {
    public static void main(String[] args){
        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota",500);
        severino.start();
        raimundo.start();
        /*PilhaSincronizada pilha1 = new PilhaSincronizada();
        Consumidor consumidor1 = new Consumidor(pilha1);
        Produtor produtor1 = new Produtor(pilha1);

        Thread t1 = new Thread(produtor1);
        Thread t2 = new Thread(consumidor1);
        t1.start();
        t2.start();*/
        
    }
}
