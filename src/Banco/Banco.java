package Banco;

public class Banco {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(100);

        Cliente cliente1 = new Cliente(cuenta,50);
        Cliente cliente2 = new Cliente(cuenta,50);
        Cliente cliente3 = new Cliente(cuenta,100);

        cliente1.start();
        cliente2.start();
        cliente3.start();

        try {
            cliente1.join();
            cliente2.join();
            cliente3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("saldo final: "+cuenta.obtenerSaldo());

    }
}
