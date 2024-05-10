/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author pclab0.pc10
 */
public class Ordenamientos {
    public static final String SOYELANGRIBIRDROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String IAMBLUE = "\u001B[34m";
    public static int c = -1;
    public void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }
        System.out.println("");
        System.out.println("");        
        }
    public void MuestraArrayBonito(int [] a,  int temp){
            for (int i=0;i<a.length;i++){
                if (a[i] == temp ){
                    System.out.print("["+SOYELANGRIBIRDROJO + a[i] + RESET+"]");  
                }
                
                else{
                System.out.print("["+a[i]+"]");}
                }
            System.out.println("");
            System.out.println("");        
            }
    public void MuestraArrayBonito2(int [] a,  int temp){
            for (int i=0;i<a.length;i++){
                if (a[i] == temp ){
                    System.out.print("["+IAMBLUE + a[i] + RESET+"]");  
                }
                else{
                System.out.print("["+a[i]+"]");}
                }
            System.out.println("");
            System.out.println("");        
            }

    public void BubleSort(int [] a){
        int comparaciones = 0;
        this.MuestraArray(a);
        int n = a.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){ 
                comparaciones++;  
                if(a[j-1] > a[j]){  
                    //Intercambio
                    
                    temp = a[j-1];
                    MuestraArrayBonito2(a, a[j]); 
                    a[j-1] = a[j];  
                    a[j] = temp; 
                    this.MuestraArrayBonito(a, temp);  
                    }          
                }  
            } 
        this.MuestraArray(a);
        System.out.println("Comparaciones: " + comparaciones);        
        }

    public void SelectionSort(int[] a) {
        this.MuestraArray(a);
        int comparaciones = 0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    }
                }
            // Intercambiar arreglo[i] 
            //y arreglo[indiceMinimo]
            int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
            this.MuestraArrayBonito(a, temp); 
           }
        this.MuestraArray(a);
        System.out.println("Comparaciones: " + comparaciones);
        } 
        
    public void InsertionSort(int[] a) {
        int comparaciones = 0;
        this.MuestraArray(a);
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                comparaciones++;  
                j--;
                }
            a[j + 1] = valorActual;
            this.MuestraArrayBonito(a, valorActual); 
            }
        this.MuestraArray(a);
        System.out.println("Comparaciones: " + comparaciones);
        }

    public void ShellSort(int[] a) {
        this.MuestraArray(a);
        int comparaciones = 0;       
        int n = a.length;
        int incremento = n;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    comparaciones++;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        MuestraArrayBonito2(a, a[j]); 
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        this.MuestraArrayBonito(a, tmp); 
                        j -= incremento;
                        }
                    }
                }
            } 
        while (incremento > 1);
        System.out.println("Comparaciones: " + comparaciones);
        this.MuestraArray(a);  
        }
    
    public void mergeSort(int[] a) {
        c++;
        if (a.length < 2) {return;}
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
        this.MuestraArray(a);
        System.out.println("Comparaciones: " + c);  
        }
     
    
    public void merge(int[] arr, int[] left, int[] right) {
        c++;
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public void intercambiar(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        MuestraArrayBonito2(a, a[j]); 
        a[j] = temp;
        this.MuestraArrayBonito(a, temp); 
    }
    public void quicksort(int a[], int primero, int ultimo){
    int i, j, central;
    int pivote;
    central = (primero + ultimo)/2;
    pivote = a[central];
    i = primero;
    j = ultimo;
    do {
        while (a[i] < pivote) i++;
        while (a[j] > pivote) j--;
        if (i <= j)
        {
            intercambiar(a, i, j);
            i++;
            j--;
        }
    }while (i <= j);
    if (primero < j)
        quicksort(a, primero, j); // mismo proceso con sublista izqda
    if (i < ultimo)
        quicksort(a, i, ultimo); // mismo proceso con sublista drcha
    }
    /* ejemplo procedente de
 * Zohonero Martínez, L., & Aguilar, J. (Eds.). (2012). *Estructuras de datos en Java* [Libro electrónico].
 * McGraw-Hill España. https://www.978844815373937
 * se puede encontrar en la biblioteca de la ua
 */







                
}
