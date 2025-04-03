//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         *Una empresa desea registrar la información de cada empleado
         * para ello un empleado debe ingresar con su usuario y contraseña
         * una vez ingresado el empleado debe registrar la siguiente información
         * 1-nombre completo
         * 2-Documento de identidad
         * 3- Valor de la hora
         * 4- Cantidad de horas
         * 5- seleccionar un día de descanso a la semana (L-V)
         * El sistema le debe mostrar al empleado:
         * Su salario neto, salario Bruto, Deducción por pensión, deducció por salud, auxilio de transporte (si aplica)
         * y bonificación del 10% si no supera 2SMMLV (Sin incluir auxilio de transporte)
         * Toda la información del empleado se debe mostrar en un mensaje descriptivo
         */
        /*Definición y asignación de variables */
        Scanner sc = new Scanner(System.in);
        String NombreEmpleado = "";
        String Documentoidentidad = "";
        String DiaDescanso = "";
        String UsuarioEmpleado = "";
        String ContrasenaUsuario = "";
        double SalarioBruto = 0;
        double SalarioNeto = 0;
        double RetencionSalud = 0;
        double RetencionPension= 0;
        double ValorHora = 0;
        double CantidadHoras = 0;
        double BonificacionEmpleado = 0;
        double ValorSalarioMinimo = 0;
        int AuxilioTransporte = 2000000;

        System.out.print("Ingrese su usuario:");
        UsuarioEmpleado = sc.nextLine();
        System.out.print("Ingrese su contrasena:");
        ContrasenaUsuario = sc.nextLine();
        if(UsuarioEmpleado.equals("admin") && ContrasenaUsuario.equals("admin")){
            System.out.print("Ha ingresado de forma correcta");
            System.out.println("Ingrese en nombre del empleado: ");
            NombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento del identidad: ");
            Documentoidentidad = sc.nextLine();
            System.out.println("ingrese el día de descanso (lunes-viernes): ");
            DiaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la  hora: ");
            ValorHora = sc.nextDouble();
            System.out.println("ingresa la cantidad de horas trabajadas: ");
            CantidadHoras = sc.nextDouble();
            SalarioBruto = ValorHora *  CantidadHoras;
            System.out.println("Ingrese el valor de salario minimo para este año: ");
            ValorSalarioMinimo = sc.nextDouble();

            if(SalarioBruto > (ValorSalarioMinimo*2)){
                BonificacionEmpleado = 0;
                AuxilioTransporte = 0;
            }else {
                BonificacionEmpleado = SalarioBruto*0.1;
                AuxilioTransporte = 200000;
                SalarioNeto = SalarioBruto + BonificacionEmpleado + AuxilioTransporte;
                System.out.println("El salario neto es: " + SalarioNeto);
            }

            }else {
            System.out.println("Error de credenciales");
        }
    }
}
