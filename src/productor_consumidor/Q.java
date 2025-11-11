package productor_consumidor;

// Cola (productor_consumidor.Q) para el problema de productor / consumidor
public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consume: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Produce " + n);
        notify();
    }
}
