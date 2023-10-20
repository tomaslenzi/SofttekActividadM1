import java.util.Scanner;

public class SumarNumeros {


    // Metodo para solicitar al usuario 2 numeros y mostrar el resultado de la suma por pantalla
    public void sumarYMostrarResultado() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);

    }

}
