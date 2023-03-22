import javax.print.event.PrintEvent;

public class PilhaSincronizada {
    private int index=0;
    private int[]buffer =new int [10];
    public synchronized int pop(){
        while (index==0){
            try{
                this.wait();
            }catch(InterruptedException e){} 
        }
        this.notify();
        index--;
        return buffer[index];
    }

    public synchronized void push(int i){
        while(this.index==this.buffer.length){
            try{
                this.wait();
            }catch(InterruptedException e){}
        }
        this.notify();
        this.buffer[this.index]=i;
        this.index++;
    }
}
