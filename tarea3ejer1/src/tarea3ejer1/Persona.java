package tarea3ejer1;
     public class Persona {
    // Atributos
    private int anoNacimiento;

    // Constructor
    public Persona(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    // Método para obtener el año de nacimiento
    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    // Método para calcular la edad actual
    public int calcularEdad(int anoActual) {
        return anoActual - anoNacimiento;
    }
    
    
}