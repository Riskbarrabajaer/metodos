/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author pclab0.pc10
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenamientos m = new Ordenamientos(); 
        int array[] = {54,26,93,17,77,31,44,55,20};
        menu(array);

        //m.BubleSort(array);
        //m.SelectionSort(array);
        //m.InsertionSort(array);
        //m.ShellSort(array);
        //m.mergeSort(array);
        }
        public static void menu(int[] lista){
            Ordenamientos ordenamientos = new Ordenamientos();
            Scanner leer = new Scanner(System.in);
            
            boolean flag = true;
            while (flag)
            {
                MostrarOpciones();
                
                int eleccion = leer.nextInt();
                
                while (eleccion < 1 || eleccion > 8)
                {
                    System.out.println("Error: Ingrese una opcion valida");
                    eleccion = leer.nextInt();
                }
                switch (eleccion)
                {
                    case 1:
                        ordenamientos.BubleSort(lista);;
                        break;
                        
                    case 2:
                        ordenamientos.SelectionSort(lista);
                        break;
                        
                    case 3:
                        ordenamientos.InsertionSort(lista);
                        break;
                        
                    case 4:
                        ordenamientos.ShellSort(lista);
                        break;
                        
                    case 5:
                        ordenamientos.mergeSort(lista);
                        break;
                        
                    case 7:
                        System.out.println("SALIENDO DEL PROGRAMA");
                        flag = false;
                        break;
                    case 6:
                        ordenamientos.MuestraArray(lista);  
                        ordenamientos.quicksort(lista, 0, lista.length - 1);
                        ordenamientos.MuestraArray(lista);  
    
                    case 8:
                            System.out.println("Restablecer array");
                            int lista2 [] = {54,26,93,17,77,31,44,55,20};
                            lista = lista2;
                            break;
                }
            }


        }
        public static void MostrarOpciones(){
        System.out.println("1 . BubleSort");
        System.out.println("2 . SelectionSort");
        System.out.println("3 . InsertionSort");
        System.out.println("4 . ShellSort");
        System.out.println("5 . mergeSort");
        System.out.println("6 . Quiksort");
        System.out.println("7 . Salir");
        System.out.println("Su eleccion: ");
        }
    }