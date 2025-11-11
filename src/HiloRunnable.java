public class HiloRunnable implements Runnable {

    Thread hiloRunnable;
    int tiempoSleep;

    public HiloRunnable(String name, int tiempoSleep){
        hiloRunnable = new Thread(this, name);
        this.tiempoSleep = tiempoSleep;
    }

    @Override
    public void run() {
        try {
            for(int i=5; i>0; i--) {
                System.out.println("Hilo "+hiloRunnable.getName()+" :"+i);
                Thread.sleep(tiempoSleep);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Salida del hilo "+hiloRunnable.getName());
    }
}
