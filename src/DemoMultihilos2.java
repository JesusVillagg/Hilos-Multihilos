public class DemoMultihilos2 {
    public static void main(String[] args) {

        HiloThread hiloHijo = new HiloThread("hijoT1",500);
        hiloHijo.start();

        HiloThread hiloHijo2 = new HiloThread("hijoT2",250);
        hiloHijo2.start();

        HiloRunnable hiloHijo3 = new HiloRunnable("hijoR1",2000);

        System.out.println("hijoT1 está vivo: "+hiloHijo.isAlive());
        System.out.println("hijoT2 está vivo: "+hiloHijo2.isAlive());
        System.out.println("hijoR1 está vivo: "+hiloHijo3.hiloRunnable.isAlive());

        try {
            hiloHijo.join();
            hiloHijo2.join();
            hiloHijo3.hiloRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("hijoT1 está vivo: "+hiloHijo.isAlive());
        System.out.println("hijoT2 está vivo: "+hiloHijo2.isAlive());
        System.out.println("hijoR1 está vivo: "+hiloHijo3.hiloRunnable.isAlive());

        HiloThread hiloHijo4 = new HiloThread("hijoT4",250);
        hiloHijo4.start();

        System.out.println("Salida del hilo principal");

    }
}
