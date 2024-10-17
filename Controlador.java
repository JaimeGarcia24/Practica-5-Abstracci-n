import java.util.Scanner;

public class Controlador {

    public static void main(String[] args) {
        
        new Thread(new Reloj()).start();
       
        new Thread(new Ejecutor("calc", 0)).start();
    }
}
