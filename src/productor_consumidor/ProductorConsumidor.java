package productor_consumidor;

public class ProductorConsumidor {

    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Pulse Control+C para finalizar.");
    }
}
