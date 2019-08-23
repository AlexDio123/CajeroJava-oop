package WebInar;

import java.util.Scanner;

public abstract class ClasePadre {

    protected int transaccion, deposito, retiro;
    private static  int Saldo;

    Scanner sc = new Scanner(System.in);

    public void Operaciones(){

        int valor =0;
        int seleccion=0;



        do {
            do{

                System.out.println("Por favor seleccione una opcion");
                System.out.println("    1. Consulta");
                System.out.println("    2. deposito de efectivo");
                System.out.println("    3. retiro de efectivo");
                System.out.println("    4.Salir");

                seleccion = sc.nextInt();

                if (seleccion >=1 && seleccion<=4){

                    valor=1;
                } else
                {
                    System.out.println("--------------------------------------------------------**");
                    System.out.println("Opcion no disponile, volver a intentar");
                    System.out.println("-----------------------------------------------------------");
                }


            }while (valor==0);

            if (seleccion ==1){

                ClasePadre trans = new ClaseHija_consulta();

                trans.setTransaccion();


            } else if (seleccion ==2){

                ClasePadre trans = new ClaseHija_Deposito();
                trans.setTransaccion();

            }

            else if (seleccion ==3){

                ClasePadre trans  = new ClaseHija_Retiro();
                trans.setTransaccion();
            } else if (seleccion ==4){

                System.out.println("Bye bye");
                valor=2;

            }
        } while (valor != 2);



    }


    public void HacerDeposito(){
        deposito = sc.nextInt();
    }

    public void HacerRetiro(){
        retiro = sc.nextInt();
    }

    public abstract void setTransaccion();

    // getter y setters de Saldo


    public static int getSaldo() {
        return Saldo;
    }

    public static void setSaldo(int saldo) {
        Saldo = saldo;
    }
}
