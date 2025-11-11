package productor_consumidor;

public class Producer implements Runnable{

    Q q;

    public Producer(Q q){
        this.q = q;
        new Thread(this, "Productor").start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
