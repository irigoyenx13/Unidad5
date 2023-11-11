public class Operaciones{

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero");
            return Double.NaN; // NaN (Not a Number) puede ser utilizado para representar un resultado no válido
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double resultadoSuma = suma(5, 3);
        double resultadoResta = resta(5, 3);
        double resultadoMultiplicacion = multiplicacion(5, 3);
        double resultadoDivision = division(5, 3);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}