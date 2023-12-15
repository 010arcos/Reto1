import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int ipOpcion;

        do {

            try {
                System.out.println("Pulsa 1. ¿Quieres validar IP?");
                System.out.println("Pulsa 0. Salir");

                ipOpcion = sc.nextInt();
                sc.nextLine(); // importantisimo esto!!!

                switch (ipOpcion){
                    case 0:
                        System.out.println("Saliendo programa");
                        break;
                    case 1:
                        boolean salir= false;
                        System.out.println("Introduce la IP");

                        do {


                            try {
                                String ip = sc.next();
                                String octeto[]= ip.split(("\\.")); /*divide una cadena de Java con un separador que puede un carácter, cadena o una expresión regular*/
                                int primeroOcteto = Integer.parseInt(octeto[0]);
                                int segundoOcteto = Integer.parseInt(octeto[1]);
                                int tercerOcteto = Integer.parseInt(octeto[2]);
                                int cuartoOcteto = Integer.parseInt(octeto[3]);

                                System.out.println(primeroOcteto + " " + segundoOcteto + " " + tercerOcteto + " " + cuartoOcteto);
                                salir=true;


                            }catch (IndexOutOfBoundsException e) {
                                System.out.println("Longitud errónea");
                                sc.nextLine();
                                System.out.println("Introduce una ip válida");
                            }

                            catch (NumberFormatException e){
                                System.out.println("Carácter erróneo");
                                sc.nextLine();
                                System.out.println("Introduce una ip válida");
                            }


                        }while (!salir);


                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;

                }




            }catch (InputMismatchException e){
                System.out.println("Carácter no válido");
                sc.nextLine();
                ipOpcion=-1;

            }

        }while (ipOpcion!=0);











    }
}








