import java.util.Arrays;

public class MetodosOrdenamiento {
    public int[] sortBubble(int[] arreglo, boolean ascendente, boolean logs){
        int lengthArray = arreglo.length;

        for (int i = 0; i < lengthArray; i++){
            for (int j = i + 1; j < lengthArray; j++){

                if (ascendente){
                    if (arreglo[j] < arreglo[i]){
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                } else {
                    if (arreglo[j] > arreglo[i]){
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }

            }
        }
        return arreglo;
    }

    public int[] sortSelection(int[] arregloOriginal, boolean ascendente, boolean logs) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        if (ascendente){
            for (int i = 0; i < arreglo.length - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] < arreglo[minimo]) {
                        minimo = j;
                    }
                }
                int menor = arreglo[minimo];
                arreglo[minimo] = arreglo[i];
                arreglo[i] = menor;
            }
        } else {
            for (int i = 0; i < arreglo.length - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] > arreglo[minimo]) {
                        minimo = j;
                    }
                }
                int menor = arreglo[minimo];
                arreglo[minimo] = arreglo[i];
                arreglo[i] = menor;
            }
        }
        return arreglo;
    }

    public int[] sortInsertion(int[] arreglo, boolean ascendente, boolean logs){
        if (ascendente){
            for (int i = 1; i < arreglo.length; i++){
                int aux = arreglo[i];
                int j = i - 1;           
                while (j >= 0 && arreglo[j] > aux) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = aux;
            }
        } else {
            for (int i = 1; i < arreglo.length; i++){
                int aux = arreglo[i];
                int j = i - 1;           
                while (j >= 0 && arreglo[j] > aux) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = aux;
            }
        }
        return arreglo;
    }

    public int [] sortBubbleAdvance(int[] arreglo, boolean ascendente, boolean logs){

        int n = arreglo.length;
        boolean intercambio = false;

        if (ascendente){
            for (int i = 0; i < n; i++){
            intercambio = false;
                for (int j = 0; j < n-1-i; j++){
                    if (arreglo[j] > arreglo[j + 1]){
                //Intrecambio 
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                    }
                }
                //Si no hubo intercambio
                if (!intercambio){
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++){
                intercambio = false;
                for (int j = 0; j < n-1-i; j++){
                    if (arreglo[j] > arreglo[j + 1]){
                    //Intrecambio 
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                    }
                }
                    //Si no hubo intercambio
                    if (!intercambio){
                        break;
                    }
            }
        }
    return arreglo;
    }
}
