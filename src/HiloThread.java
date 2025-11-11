public class HiloThread extends Thread {

    int tiempoSleep;

    public HiloThread(String name, int tiempoSleep){
        setName(name);
        this.tiempoSleep = tiempoSleep;
    }

    public void run(){
        try {
            for(int i=100; i>0; i--) {
                System.out.println("Hilo "+getName()+" :"+i);
                Thread.sleep(tiempoSleep);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Salida del hilo "+getName());
    }

}
