// Control del hilo principal
public class DemoHiloActual {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Hilo actual: " + t);

        t.setName("Mi hilo");
        System.out.println("Después de cambiar el nombre: " + t);

        for (int n = 5; n > 0; n--) {
            System.out.println(n);
        }

    }
}
