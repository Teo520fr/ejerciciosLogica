import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        

           Scanner leer = new Scanner(System.in);

           System.out.println("Ingrese su PIN: ");
           int pin = leer.nextInt();

           if (pin == Pin.PIN_SECRETO) {
            System.out.println("PIN correcto. Acceso permitido.");
           } else {
            System.out.println("PIN incorrecto. Acceso denegado y cuenta bloqueada por seguridad.");
           }

    }
}