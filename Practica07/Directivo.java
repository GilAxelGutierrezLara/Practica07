/**
 *Clase que representa a un directivo y que hereda de Empleado
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
//La clase Directivo hereda de la clase Empleado
public class Directivo extends Empleado{
    /**
     *Constructor con Args que llamar al constructor del padre
     **/
    public Directivo(String nombre){
	super(nombre);
    }
    /**
     *Constructor que manda a llamar a el constructor del padre
     **/
    public Directivo(){
	super();	
    }
    /**
     *Metodo que devuelve una cadena de texto con los datos del directivo
     **/
    public String toString(){
	return "Directivo: " + nombre;
    }
}
