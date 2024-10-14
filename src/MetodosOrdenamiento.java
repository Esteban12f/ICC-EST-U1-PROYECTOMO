import java.util.Arrays;

public class MetodosOrdenamiento {
    ExtraPrograma extra = new ExtraPrograma();

    // LISTO
    public int[] sortBubble(int[] arregloOriginal, boolean ascendente, boolean logs){
        int lengthArray = arregloOriginal.length;

            for (int i = 0; i < lengthArray; i++){
                for (int j = i + 1; j < lengthArray; j++){
                    if (logs){
                        System.out.println("i = " + i + "  j = " + j + "  [i] = " + arregloOriginal[i] + "  [j] = " + arregloOriginal[j]);
                    }
                    if (ascendente){
                        if (arregloOriginal[j] < arregloOriginal[i]){
                            if (logs) {
                                System.out.println("\tIntercambiamos " + arregloOriginal[j] + " con " + arregloOriginal[i + 1]);
                            }
                            int aux = arregloOriginal[i];
                            arregloOriginal[i] = arregloOriginal[j];
                            arregloOriginal[j] = aux;
                            if (logs) {
                                System.out.println("\t--------" + Arrays.toString(arregloOriginal));
                            }
                        }
                    } else {
                        if (arregloOriginal[j] > arregloOriginal[i]){
                            if (logs) {
                                System.out.println("\tIntercambiamos " + arregloOriginal[j] + " con " + arregloOriginal[i + 1]);
                            }
                            int aux = arregloOriginal[i];
                            arregloOriginal[i] = arregloOriginal[j];
                            arregloOriginal[j] = aux;
                            if (logs) {
                                System.out.println("\t--------" + Arrays.toString(arregloOriginal));
                            }
                        }
                    }
                }
            }
        return arregloOriginal;
    }

    // LISTO
    public int[] sortSelection(int[] arreglo, boolean ascendente, boolean logs){
        int lengthArray = arreglo.length;

        if (ascendente){
            for ( int i = 0; i < lengthArray; i++){
                int indice = i;
    
                for (int j = i + 1; j < lengthArray; j++){
                    if (logs) {
                        System.out.println("i = " + i + "  j = " + j + "  [indice] = " + arreglo[indice] + "  [j] = " + arreglo[j]);
                    }
                    if (arreglo[j] < arreglo[indice]){
                        indice = j;
                    }
                }
                if (logs) {
                    System.out.println("\tIntercambiamos " + arreglo[i] + " con " + arreglo[indice]);
                }
                // Intercambio de indice
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[i];
                arreglo[i] = aux;
                if (logs) {
                    System.out.println("\t--------" + Arrays.toString(arreglo));
                }
            }
        } else {
            for ( int i = 0; i < lengthArray; i++){
                int indice = i;
    
                for (int j = i + 1; j < lengthArray; j++){
                    if (logs) {
                        System.out.println("i = " + i + "  j = " + j + "  [indice] = " + arreglo[indice] + "  [j] = " + arreglo[j]);
                    }
                    if (arreglo[j] > arreglo[indice]){
                        indice = j;
                    }
                }
                if (logs) {
                    System.out.println("\tIntercambiamos " + arreglo[i] + " con " + arreglo[indice]);
                }
                // Intercambio de indice
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[i];
                arreglo[i] = aux;
                if (logs) {
                    System.out.println("\t--------" + Arrays.toString(arreglo));
                }
            }
        }
        return arreglo;
    }

    // LISTO 
    public int[] sortInsertion(int[] arreglo, boolean ascendente, boolean logs){
        if (ascendente){
            for (int i = 1; i < arreglo.length; i++){
                int aux = arreglo[i];
                int j = i - 1;   
                if (logs) {
                    System.out.println("i = " + i + "  j = " + j + "  [aux] = " + aux);
                }        
                while (j >= 0 && arreglo[j] > aux) {
                    if (logs) {
                        System.out.println("\tComparando " + aux + " con " + arreglo[j]);
                    }
                    arreglo[j + 1] = arreglo[j];
                    j--;
                    if (logs) {
                        System.out.println("\t--------" + Arrays.toString(arreglo));
                    }
                }
                arreglo[j + 1] = aux;
            }
        } else {
            for (int i = 1; i < arreglo.length; i++){
                int aux = arreglo[i];
                int j = i - 1;           
                if (logs) {
                    System.out.println("i = " + i + "  j = " + j + "  [aux] = " + aux);
                } 
                while (i > 0 && arreglo[i] < aux) {
                    if (logs) {
                        System.out.println("\tComparando " + aux + " con " + arreglo[j]);
                    }
                    arreglo[j + 1] = arreglo[j];
                    j++;
                    if (logs) {
                        System.out.println("\t--------" + Arrays.toString(arreglo));
                    }
                }
                arreglo[j + 1] = aux;
            }
        }
        return arreglo;
    }

    // LISTO
    public int [] sortBubbleAdvance(int[] arreglo, boolean ascendente, boolean logs){

        int n = arreglo.length;
        boolean intercambio = false;

            if (ascendente){
                for (int i = 0; i < n; i++){
                System.out.println("Pasada "+ i);
                intercambio = false;
                    for (int j = 0; j < n-1-i; j++){
                        if (logs) {
                            System.out.println(" i = " + i + "  j = " + j + "  [i] = " + arreglo[i] + "  [j] = " + arreglo[j]);
                        }
                        if (arreglo[j] > arreglo[j + 1]){
                            if (logs) {
                                System.out.println("\tIntercambiamos " + arreglo[j] + " con " + arreglo[i + 1]);
                            }
                    //Intrecambio 
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                        if (logs) {
                            System.out.println("\t--------" + Arrays.toString(arreglo));
                        }
                        }
                    }
                    //Si no hubo intercambio
                    if (!intercambio){
                        break;
                    }
                }
            } else {
                for (int i = 0; i < n; i++){
                    System.out.println("Pasada "+ i);
                    intercambio = false;
                    for (int j = 0; j < n-1-i; j++){
                        if (logs) {
                            System.out.println(" i = " + i + "  j = " + j + "  [i] = " + arreglo[i] + "  [j] = " + arreglo[j]);
                        }
                        if (arreglo[j] < arreglo[j + 1]){
                            if (logs) {
                                System.out.println("\tIntercambiamos " + arreglo[j] + " con " + arreglo[i + 1]);
                            }
                        //Intrecambio 
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = aux;
                            intercambio = true;
                            if (logs) {
                                System.out.println("\t--------" + Arrays.toString(arreglo));
                            }
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
