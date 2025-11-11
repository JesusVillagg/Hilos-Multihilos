public class DemoMultihilos {
    public static void main(String[] args) {

        HiloThread hiloHijo = new HiloThread("hijoT1",500);
        hiloHijo.start();

        HiloThread hiloHijo2 = new HiloThread("hijoT2",250);
        hiloHijo2.start();

        HiloRunnable hiloHijo3 = new HiloRunnable("hijoR1",2000);
        //hiloHijo3.start();

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Hilo principal: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Salida del hilo principal");

    }
}
