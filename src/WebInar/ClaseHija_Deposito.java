package WebInar;

public class ClaseHija_Deposito extends ClasePadre {


    @Override
    public void setTransaccion() {

        System.out.println("Ingrese la cantidad a depositar");
        HacerDeposito();

        transaccion = getSaldo();

        setSaldo(transaccion + deposito);

        System.out.println("depositaste: " + deposito);
        System.out.println("El balance de tu cuenta es: " + getSaldo());

    }
}
