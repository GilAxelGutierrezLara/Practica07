/**
 *Clase que representa a un operador y que hereda de Empleado
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
//La clase Operador hereda de la clase Empleado
public class Operador extends Empleado{
/**
 *Constructor con Args que manda a llamar al constructor del padre
 **/
    public Operador(String nombre){
	super(nombre);	
    }
    /**
     *Constructor sin Args que manda a llamar a el constructor del padre
     **/
    public Operador(){
	super();	
    }
    /**
     *Metodo que devuelve una cadena de texto con los datos del Operador
     **/
    public String toString(){
	return "Operador: " + nombre;
    }
    
}
