package Banco;

public class Cliente extends Thread{

    private CuentaBancaria cuenta;
    private int cantidadRetiro;

    public Cliente(CuentaBancaria cuenta, int cantidadRetiro){
        this.cuenta = cuenta;
        this.cantidadRetiro = cantidadRetiro;
    }

    public void run(){
        cuenta.retirar(cantidadRetiro);
    }

}
