import java.util.Scanner;

public class ExtraPrograma {

    Scanner leer = new Scanner(System.in);
    boolean ascendente;
    boolean logs;
    int x, y;

    public void menuOrden(){
        System.out.println("Menu de Orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        x = validacion(leer, "Escoja una opcion: ", true);
        
        switch (x) {
            case 1:
                ascendente = true;
                break;
        
            case 2:
                ascendente = false;
                break;

            default:
                System.out.println("Opcion ingresada no valida :/");
                break;
        }
    }

    public void menuLogs(){
        System.out.println("¿Imprimir pasos?");
        System.out.println("1. Si");
        System.out.println("2. No");
        y = validacion(leer, "Escoja una opcion: ", true);

        switch (y) {
            case 1:
                logs = true;
                break;
        
            case 2:
                logs = false;
                break;

            default:
                System.out.println("Opcion ingresada no valida :/");
                break;
        }
    }

    public void menuGeneral(){
        
        Scanner leer = new Scanner(System.in);
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        ExtraPrograma eP = new ExtraPrograma();

        int [] arreglo = null;
        int [] arregloOriginal = null;
        int w = 1, x, y;
        boolean ordenado = false;

            do{
                System.out.println("Menu principal: ");
                System.out.println("1. Ingresar un arreglo");
                System.out.println("2. Ordenar arreglo");
                System.out.println("0. Salir");
                w = validacion(leer, "Escoja una opcion: ", true);
        
                switch (w) {
                    case 1:
                        int lengthArray = validacion(leer, "Ingrese el tamaño del arreglo (entero positivo): ", false);
                        arreglo = new int[lengthArray];

                        for (int i = 0; i < lengthArray; i++){
                           arreglo[i] = validacion(leer, "Ingrese el numero en la posicion " + (i+1) + " del arreglo: ", true);
                        }
                        arregloOriginal = arreglo.clone(); 
                        ordenado = false;
                        System.out.println( "El arreglo creado es: " + java.util.Arrays.toString(arreglo));

                    break;
        
                    case 2:
                        if (arreglo == null){
                            System.out.println("Todavia no se ha ingresado un arreglo " + 
                            "para poder ingresar un arreglo seleccione la opcion 1");
                        } else {


                            do {

                                if (ordenado){
                                    System.out.println("El arreglo ya esta ordenado");
                                    System.out.println("¿Desea reordenarlo?");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    y = validacion(leer, "Escoja una opcion: ", true);
                                    if (y == 2){
                                        break;
                                    } 
                                    arreglo = arregloOriginal.clone(); 
                                }

                                System.out.println("Metodos de ordenamiento:");
                                System.out.println("1. Metodo burbuja");
                                System.out.println("2. Metodo Seleccion");
                                System.out.println("3. Metodo Insercion");
                                System.out.println("4. Metodo Burbuja Mejorado");
                                System.out.println("0. Volver al Menu principal");
                                x = validacion(leer, "Escoja una opcion: ", true);

                                switch (x) {
                                case 1:
                                    eP.menuOrden();
                                    eP.menuLogs();
                                    mO.sortBubble(arreglo, eP.ascendente, eP.logs);
                                    System.out.println( "El arreglo ordenado por Burbuja: " + java.util.Arrays.toString(arreglo));
                                    ordenado = true;
                                    break;
                            
                                case 2:
                                    eP.menuOrden();
                                    eP.menuLogs();
                                    mO.sortSelection(arreglo, eP.ascendente, eP.logs);
                                    System.out.println( "El arreglo ordenado por Seleccion: " + java.util.Arrays.toString(arreglo));
                                    ordenado = true;
                                    break;
        
                                case 3:
                                    eP.menuOrden();
                                    eP.menuLogs();
                                    mO.sortInsertion(arreglo, eP.ascendente, eP.logs);
                                    System.out.println( "El arreglo ordenado por Insercion : " + java.util.Arrays.toString(arreglo));
                                    ordenado = true;
                                    break;
                                
                                case 4:
                                    eP.menuOrden();
                                    eP.menuLogs();
                                    mO.sortBubbleAdvance(arreglo, eP.ascendente, eP.logs);
                                    System.out.println( "El arreglo ordenado por Burbuja Mejorado: " + java.util.Arrays.toString(arreglo));
                                    ordenado = true;
                                    break;
        
                                default:
                                    if (x != 0){
                                        System.out.println("Opcion ingresada invalida :/");
                                    }
                                }
                            } while (x != 0);
                        }
                    break;
                    default:
                        if (w != 0){
                            System.out.println("La opcion ingresada no es valida :/");
                        }
                }
            } while (w != 0); 
    }

    public static int validacion(Scanner leer, String mensaje, boolean permitirNegativos){
            
            int arrayLength = 0;
    
            do{
                System.out.print(mensaje);
                while (!leer.hasNextInt()) {
                    System.out.println("Debes ingresar un entero valido :/");
                    System.out.print(mensaje);
                    leer.next();
                }
                arrayLength = leer.nextInt();
                if (!permitirNegativos && arrayLength <= 0){
                    System.out.println("El tamaño debe ser entero positivo mayor a 0 :/");
                }
            } while(! permitirNegativos && arrayLength <= 0);
            return arrayLength;
        
    }
    

}
