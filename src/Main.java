
import java.util.Scanner;

import java.sql.SQLOutput;
   /*Una empresa desea registrar la información de cada empleado
     para ello un empleado debe ingresar con su usuario y contraseña
     una vez ingresado el empleado debe registrar la siguiente información:
     1 - Nombre completdo
     2 - Documento de identidad
     3 - valor hora
     4 - Cantidad de horas
     5 - Seleccionar un día de descanso a la semana (L-V)
     El sistema le debe mostrar al empleado:
     Su salario Neto, Salario Bruto, Deducción por Pensión, Deducción por salud, auxilio de transporte (si aplica) y bonificación del 10%
     Si no supera 2 2 SMMLV (sin incluir auxilio de transporte)
     Toda la información del empleado se debe mostrar en un mensaje descriptivo
      */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String usuario, contraseña, nombreCompleto, documentoIdentidad, diaDescanso, noGanaNada = "";
        double valorHora, cantidadHoras, salarioNeto, salarioBruto,auxilioTransporte, bonificacion = 0;
        double deduccionPensionSalud = 54190*2;
        double salarioMinimo = 1400000;


        System.out.println("Ingrese su usuario");
        usuario = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        contraseña = sc.nextLine();

        if (usuario.equals("mefisto") && contraseña.equals("mefisto")){
                System.out.println("usted ha ingresado correctamente");
                System.out.println("Ingrese su nombre");
                nombreCompleto = sc.nextLine();
                System.out.println("Ingrese su documento");
                documentoIdentidad = sc.nextLine();
                System.out.println("Ingrese su dìa de descanso (L-V");
                diaDescanso = sc.nextLine();
                System.out.println("ingrese el valor de la hora");
                valorHora = sc.nextDouble();
                System.out.println("Ingrese la cantidad de horas trabajadas al mes");
                cantidadHoras = sc.nextDouble();

                salarioBruto =  valorHora * cantidadHoras;


                if (salarioBruto > salarioMinimo*2){
                        bonificacion = 0;
                        auxilioTransporte = 0;
                        noGanaNada = "Y No recibe ninguna bonificaciòn, y auxilio de transporte";
                        salarioNeto = salarioBruto - deduccionPensionSalud;



                    }else {
                        bonificacion = (salarioBruto * 0.1);
                        auxilioTransporte = 200000;
                        salarioNeto = salarioBruto + bonificacion + auxilioTransporte - deduccionPensionSalud;

                    }

                System.out.println(nombreCompleto + " Le confirmo lo siguiente: ");
                System.out.println("Su salario bruto es: " + salarioBruto);
                System.out.println("Bonificaciòn: " + bonificacion);
                System.out.println("Su auxilio de transporte es de: " + auxilioTransporte);
                System.out.println("Deducción salud y pensión: " + deduccionPensionSalud);
                System.out.println("Su salario neto es de: " + salarioNeto + " " + noGanaNada);




        }




        else {
            System.out.println("usted ha ingresado incorrectamente");

        }








    }
}