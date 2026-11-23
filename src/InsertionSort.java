class InsertionSort {
     public static void main(String[] args) {

        int[] arreglo = {40, 29, 18, 65, 79, 50, 14, 25};

        for (int i = 1; i < arreglo.length; i++) {

            int actual = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > actual) {

                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = actual;
        }

        System.out.println("Arreglo ordenado:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
