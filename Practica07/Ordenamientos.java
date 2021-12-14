/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Random;
public class Ordenamientos{
    /**
     *Metodo principal donde usaremos los algoritmos Quicksort y Bubblesort
     *
     *@param args Los argumentos
     **/
    
    public static void main(String[] args){
	int[] arr = new int [100000];
	Random rnd = new Random();
	for(int i = 0;i<arr.length;i++){
	    arr[i]= rnd.nextInt(100000);
	}
	System.out.println("Arreglo antes de ordenar");
	for(int i = 0; i< arr.length; i++){
	    System.out.print(arr[i]+",");
	}
	System.out.println("");
	System.out.println("------------------------------------");
	System.out.println("Ordenando arreglo mediante Bubblesort");
	System.out.println("Esto puede tardar unos segundos");
	bubblesort(arr);
	for(int i = 0; i< arr.length; i++){
	    System.out.print(arr[i]+",");
	}
	//Quicksort
	int[] arr2 = new int [100000];
	System.out.println("");
	System.out.println("Arreglo a ordenar con Quicksort");
	for(int n = 0; n < arr2.length; n++){
	    arr2[n]= rnd.nextInt(100000);
	}
	for(int n = 0; n < arr2.length; n++){
	    System.out.print(arr2[n]+",");
	}
	System.out.println("");
	System.out.println("-----------------------------------");
	System.out.println("Arreglo ordenado mediante Quicksort:");
	System.out.println("-----------------------------------");
	quicksort(arr2);
	for(int n = 0; n < arr2.length; n++){
	    System.out.print(arr2[n]+",");
	}
    }
    /**
     *Metodo que ordena los valores de un arreglo del menor al mayor
     *
     *@param arr El arreglo a ordenar
     **/
    public static void bubblesort(int[]arr){
	for(int i = 0;i < arr.length;i++){
	    for(int j=0;j<arr.length -1; j++){
		if(arr[j]>arr[j+1]){
		    arr[j]=arr[j]+arr[j+1];
		    arr[j+1]= arr[j]-arr[j+1];
		    arr[j]=arr[j]-arr[j+1];
		}
	    }
	}	
    }
    /**
     *Metodo que ordena un arreglo
     *
     *@param arr2 El arreglo a ordenar  
     **/
    private static void quicksort(int[]arr2){
	quicksort(arr2,0,arr2.length - 1);
    }
    /**
     *Metodo que ordena un arreglo
     *
     *@param arr2 El arreglo a ordenar
     *@param i El indice mas chico del arreglo
     *@param j El indice mas grande del arreglo
     **/
    private static void quicksort(int[]arr2,int i, int j){
	if( i < j){
	    int p = particion(arr2,i,j);
	    quicksort(arr2,i,p-1);
	    quicksort(arr2,p+1,j);
	}
    }
    /**
     *Metodo que divide el arreglo y devuelve el indice del pivote
     *
     *@param arr2 El arreglo a dividir
     *@param i El indice mas chico del arreglo
     *@param j El indice mas grande del arreglo
     *@return k+1 EL inice del pivote
     **/
    private static int particion(int[]arr2,int i, int j){
	int pivote = arr2[j];
	int k = (i-1);
	for(int l = i ; l <= j-1 ;l++){
	    if(arr2[l]<= pivote){
		k++;
		swap(arr2,k,l);	
	    }
	}
	swap(arr2,k+1,j);
	return (k+1);
    }
    /**
     *Metodo que intercambia el valor de dos elementos de un arreglo
     *
     *@param arr2 El arreglo al que pertenecen
     *@param i EL  indice del primer valor
     *@param j El indice del segundo valor
     **/
    
    private static void swap(int [] arr2, int i, int j){
	int temp = arr2[i];
	arr2[i]= arr2[j];
	arr2[j]= temp;
    }
} 

