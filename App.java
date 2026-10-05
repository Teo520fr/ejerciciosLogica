import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean NoLogeado = true;
        int acumulador = 0;

        Scanner leer = new Scanner(System.in);

        while (NoLogeado) {

            System.out.println("Ingrese su PIN: ");
            int pin = leer.nextInt();

            if (pin == Pin.PIN_SECRETO) {
                System.out.println("PIN correcto. Acceso permitido.");
                NoLogeado = false;
            } else {
                System.out.println("PIN incorrecto. Intente de nuevo.");
            }
            acumulador++;
            if (acumulador>=3) {

                System.out.println("intentos agotados, cuenta bloqueada");
                NoLogeado = false;
                
            }

        }
    }
}