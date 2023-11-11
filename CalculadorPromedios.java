public class CalculadorPromedios {

    public static void main(String[] args) {
        
        int[][] calificaciones = {
                {90, 85, 92},
                {88, 89, 78},
                {80, 92, 70},
                {94, 75, 85}
        };

        
        double[] promediosEstudiantes = calcularPromedioEstudiantes(calificaciones);
        double[] promediosMaterias = calcularPromedioMaterias(calificaciones);

      
        System.out.println("Promedio de calificaciones por estudiante:");
        mostrarArreglo(promediosEstudiantes);

        System.out.println("\nPromedio de calificaciones por materia:");
        mostrarArreglo(promediosMaterias);
    }

  
    public static double[] calcularPromedioEstudiantes(int[][] calificaciones) {
        int numEstudiantes = calificaciones.length;
        int numMaterias = calificaciones[0].length;

        double[] promediosEstudiantes = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            int suma = 0;
            for (int j = 0; j < numMaterias; j++) {
                suma += calificaciones[i][j];
            }
            promediosEstudiantes[i] = (double) suma / numMaterias;
        }

        return promediosEstudiantes;
    }

   
    public static double[] calcularPromedioMaterias(int[][] calificaciones) {
        int numEstudiantes = calificaciones.length;
        int numMaterias = calificaciones[0].length;

        double[] promediosMaterias = new double[numMaterias];

        for (int j = 0; j < numMaterias; j++) {
            int suma = 0;
            for (int i = 0; i < numEstudiantes; i++) {
                suma += calificaciones[i][j];
            }
            promediosMaterias[j] = (double) suma / numEstudiantes;
        }

        return promediosMaterias;
    }

    
    public static void mostrarArreglo(double[] arreglo) {
        for (double valor : arreglo) {
            System.out.print(valor + " ");
        }
    }
}