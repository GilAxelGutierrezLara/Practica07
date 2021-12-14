/**
 *Clase que representa a unn oficial y que hereda de Operador
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
//La clase Oficial hereda de la clase Operador
public class Oficial extends Operador{
    /**
     *Constructor que llama a el constructor del Padre
     **/
    public Oficial(String nombre){
	super(nombre);
    }
    /**
     *Constructor sin args que llama al constructor del padre
     **/
    public Oficial(){
	super();
    }
    /**
     *Metodo que devuelve una cadena de texto con la accion que realiza
     **/
    public String trabaja(){
	return "Oficial: Estoy trabajando";
    }
    /**
     *Metodo que devuelve una cadena de texto con los datos del Oficial
     **/
    public String toString(){
	return "Oficial: " + nombre;
    }
}
