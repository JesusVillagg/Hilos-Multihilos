public class DemoPrioridadHilos {
    public static void main(String[] args) {
        HiloThread hilo1 = new HiloThread("Hilo-Bajo",0);
        HiloThread hilo2 = new HiloThread("Hilo-Medio",0);
        HiloThread hilo3 = new HiloThread("Hilo-Alto",0);

        //Establecer prioridades
        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);

        // Iniciar hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
