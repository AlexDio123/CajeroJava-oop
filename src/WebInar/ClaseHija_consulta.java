package WebInar;

public class ClaseHija_consulta extends ClasePadre {
    @Override
    public void setTransaccion() {
        System.out.println("--------------------------------");
        System.out.println("Tu cuenta tiene un balance de:" + getSaldo());
        System.out.println("-----------------------------------");

    }
}
