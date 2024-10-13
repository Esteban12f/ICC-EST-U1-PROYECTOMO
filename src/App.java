import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        ExtraPrograma eP = new ExtraPrograma();
        int w = 1, x, y, z;
        int [] arreglo = {};
        int lengthArray;


        while (w != 0) {
            System.out.println("Menu principal: ");
            System.out.println("1. Ingresar un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. Salir");
            System.out.print(" Escoga una opcion: ");
            w = leer.nextInt();

            switch (w) {
                case 1:
                    System.out.print("Ingresar el tamaño del arreglo: ");
                    lengthArray = leer.nextInt();
                    for (int i = 0; i < lengthArray; i++){
                       System.out.println("Ingrese el numero en la posicion " + (i+1) + "del arreglo: ");
                       arreglo[i] = leer.nextInt();
                    }
    
                    break;
    
                case 2:
                    System.out.println("Metodos de ordenamiento:");
                    System.out.println("1. Metodo burbuja");
                    System.out.println("2. Metodo Seleccion");
                    System.out.println("3. Metodo Insercion");
                    System.out.println("4. Metodo Burbuja Mejorado");
                    System.out.println("0. Volver al Menu principal");
                    System.out.print("Escoja una opcion: ");
                    x = leer.nextInt();
    
                    switch (x) {
                        case 1:
                            mO.sortBubble(arreglo, false, false);
                            System.out.println( "El arreglo ordenado por Burbuja: " + java.util.Arrays.toString(arreglo));
                            break;
                    
                        case 2:
                            mO.sortSelection(arreglo, false, false);
                            System.out.println( "El arreglo ordenado por Seleccion: " + java.util.Arrays.toString(arreglo));
                            break;

                        case 3:
                            mO.sortInsertion(arreglo, false, false);
                            System.out.println( "El arreglo ordenado por Insercion : " + java.util.Arrays.toString(arreglo));
                            break;
                        
                        case 4:
                            mO.sortBubbleAdvance(arreglo, false, false);
                            System.out.println( "El arreglo ordenado por Burbuja Mejorado: " + java.util.Arrays.toString(arreglo));
                            break;

                        default:
                            if (x == 0){
                                break;
                            }
                    }
            
                default:
                    break;
            }
        }
        
    }
}
