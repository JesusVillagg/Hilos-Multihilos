package productor_consumidor;

public class Consumer implements Runnable{
    Q q;

    public Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumidor").start();
    }

    @Override
    public void run() {
        while(true){
            q.get();
        }
    }
}
