package Banco;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(int cantidad) {
        if (saldo >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " retirando: " + cantidad);
            saldo -= cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para " + Thread.currentThread().getName());
        }
    }

    public int obtenerSaldo() {
        return saldo;
    }
}
