package simuladorSuspendResume;

// creación de un hilo implementando la interfaz Runnable con simulación de suspend (wait) y resume (notify).
public class HiloRunnable implements Runnable {

    Thread hiloRunnable;
    int tiempoSleep;
    boolean suspendFlag;

    public HiloRunnable(String name, int tiempoSleep){
        hiloRunnable = new Thread(this, name);
        this.tiempoSleep = tiempoSleep;
        suspendFlag = false;
        hiloRunnable.start();
    }

    @Override
    public void run() {
        try {
            for(int i=15; i>0; i--) {
                System.out.println("Hilo "+hiloRunnable.getName()+" :"+i);
                Thread.sleep(tiempoSleep);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Salida del hilo "+hiloRunnable.getName());
    }

    public void mysuspend(){
        suspendFlag = true;
    }

    public synchronized void myresume(){
        suspendFlag = false;
        notify();
    }

}
