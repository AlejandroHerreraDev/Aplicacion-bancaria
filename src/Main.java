import java.util.*;

public class Main {
    public static  void main(String[] args) {
        String nombre = "Tony Shark";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("**********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de es cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible es : " + saldo);
        System.out.println("\n**********************************************");

        String menu = """
                *****Escriba un numero para realizar una accion*****
                1. Consultar saldo;
                2. Retirar dinero;
                3. Depositar;
                9. Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            if (opcion == 1){
                System.out.println("Su saldo es: " + saldo);
            }
            else if (opcion == 2){
                System.out.println("Ingrese la cantidad a retirar: ");
                double valorARetirar = teclado.nextDouble();
                if (valorARetirar > saldo){
                    System.out.println("Saldo insuficiente");
                }else{
                    saldo = saldo - valorARetirar;
                    System.out.println("El saldo actual es: " + saldo);
                }
            }
            else if(opcion == 3){
                System.out.println("Ingrese la cantidad a depositar: ");
                double valorADepositar = teclado.nextDouble();
                saldo = saldo + valorADepositar;
                System.out.println("El saldo actual es: " + saldo);
            }
            else if(opcion == 9){
                System.out.println("Gracias por usar el programa");
            }
            else{
                System.out.println("Opcion no valida\n");
            }
        }
    }
}