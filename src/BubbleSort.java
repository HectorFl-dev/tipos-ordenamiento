public class BubbleSort {
    public static void main(String[] args) {

        int[] arreglo = {40, 29, 18, 65, 79, 50, 14, 25};

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    // Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("Arreglo ordenado:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}