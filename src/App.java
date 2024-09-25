

public class App {
    public static void main(String[] args) throws Exception {

        Metodos metodosOrdenamiento = new Metodos();
        int[] arreglo = {5,7,30,12,9};
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        
           metodosOrdenamiento.prntArreglo(arregloOrdenado);



        Metodos metodosOrdemanieto = new Metodos();
        int[] arregloOrdenadodesc = metodosOrdemanieto.sortByBubbleDesc(arreglo);
        
        metodosOrdemanieto.prntArreglodesc(arregloOrdenadodesc);

        String cadena = "Este es un ejemplo de texto a ordenar";
         String[] palabras = cadena.split(" ");
        String[] PalabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdemanieto.prntArregloP(PalabrasOrdenadas);
        
    }

    

}
