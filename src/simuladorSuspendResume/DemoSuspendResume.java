package simuladorSuspendResume;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoSuspendResume {
    public static void main(String[] args) {
        HiloRunnable hiloHijo1 = new HiloRunnable("hijoR1",200);
        HiloRunnable hiloHijo2 = new HiloRunnable("hijoR2",200);

        try {
            Thread.sleep(1000);
            System.out.println("Suspensión del hiloR1");
            hiloHijo1.mysuspend();

            Thread.sleep(1000);
            System.out.println("Reanudación del hiloR1");
            hiloHijo1.myresume();

            System.out.println("Suspensión del hiloR2");
            hiloHijo2.mysuspend();

            Thread.sleep(1000);
            System.out.println("Reanudación del hiloR2");
            hiloHijo2.myresume();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("Hilo Principal Espera la finalización de los otros hilos");
            hiloHijo1.hiloRunnable.join();
            hiloHijo2.hiloRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hilo Principal finaliza");

    }
}
