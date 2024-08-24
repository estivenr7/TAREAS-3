package Main;

import java.util.Scanner;

/**
 *
 * @author Estiven Ramirez
 */
      class Persona {
     int anoNacimiento;

   public Persona(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }
    
    public int calcularEdad(int anoActual) {
        return anoActual - anoNacimiento;
    }
}
  public class Main {
      
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int anoActual = 2024;

        System.out.print("Ingrese el anio de nacimiento de la primera persona: ");
        int anoNacimiento1 = scanner.nextInt();
        Persona persona1 = new Persona(anoNacimiento1);

        System.out.print("Ingrese el anio de nacimiento de la segunda persona: ");
        int anoNacimiento2 = scanner.nextInt();
        Persona persona2 = new Persona(anoNacimiento2);

        
        int edad1 = persona1.calcularEdad(anoActual);
        int edad2 = persona2.calcularEdad(anoActual);

        int diferenciaEdad = Math.abs(edad1 - edad2);

       
        if (edad1 > edad2) {
            System.out.println("La primera persona es mayor "
                    + "que la segunda persona por " + diferenciaEdad + " años.");
        } else if (edad1 < edad2) {
            System.out.println("La segunda persona es mayor"
                    + " que la primera persona por " + diferenciaEdad + " años.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

       
    }
}

  
    
 
        
        
        
      
 
