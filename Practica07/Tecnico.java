/**
 *Clase que representa a un tecnico y que hereda de Operador
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
//La clase Tecnico hereda de Operador
public class Tecnico extends Operador{
    /**
     *Constructor con Args que llama al constructor del padre
     **/
    public Tecnico(String nombre){
	super(nombre);
    }
    /**
     *Constructor sin Args que llama al constructor del padre
     **/
    public Tecnico(){
	super();
    }
    
    /**
     *Metodo que devuelve una cadena de texto con la accion que realiza
     **/
    public String trabaja(){
	return "Tecnico: Estoy trabajando";
    }
    /**
     *Metodo que devuelve una cadena de texto con los datos del Tecnico
     **/
    public String toString(){
	return "Tecnico : " + nombre;
    }
}
