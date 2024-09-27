public class Metodos {

    public int[] sortByBubble(int[] arreglo) {

        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            for (int j = i + 1; j < tam; j++) {

                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }
            }
        }
        return arreglo;
    }

    public void prntArreglo(int[] arreglo) {
        System.out.print("Menor a mayor = ");
        for (int elemento : arreglo) {

            System.out.print(" " + elemento + " ");

        }
    }

    public int[] sortByBubbleDesc(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }
            }
        }
        int arreglodesc[] = arreglo;

        return arreglodesc;
    }

    public void prntArreglodesc(int[] arreglodesc) {
        System.out.print("Mayor a menor = ");
        for (int elemento : arreglodesc) {

            System.out.print(" " + elemento + " ");

        }

    }

    public String[] sortByBubblePalabras(String[] palabras) {

        int tam = palabras.length;

        for (int i = 0; i < tam; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;

                }
            }
        }
        return palabras;
    }

    public void prntArregloP(String[] palabras) {
        System.out.print("Orden Alfabetico = ");
        for (String elemento : palabras) {

            System.out.print(" " + elemento + " ");

        }
    }

}
