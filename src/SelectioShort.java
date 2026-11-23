
public class SelectioShort {
    public static void main(String[] args) {

        int[] arreglo = {9, 3, 7, 2, 8};

        for (int i = 0; i < arreglo.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[j] < arreglo[menor]) {
                    menor = j;
                }
            }

            // Intercambio
            int aux = arreglo[i];
            arreglo[i] = arreglo[menor];
            arreglo[menor] = aux;
        }

        System.out.println("Arreglo ordenado:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
