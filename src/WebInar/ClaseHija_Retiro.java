package WebInar;

public class ClaseHija_Retiro extends ClasePadre{


    @Override
    public void setTransaccion() {
        System.out.println("Ingrese la cantidad a depositar");
          HacerRetiro();

          if (retiro <= getSaldo()){

              transaccion = getSaldo();

              setSaldo(transaccion - retiro);

              System.out.println("depositaste: " + retiro);
              System.out.println("El balance de tu cuenta es: " + getSaldo());

          } else {

              System.out.println("No tiene saldo suficiente");
          }


    }
}
