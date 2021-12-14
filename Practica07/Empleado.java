/**
 *Clase que representa un empleado
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Empleado{
    //Atributos
    public String nombre;
    //Constructores
     /**
     *Constructor con Args
     *
     *@param nombre El nombre del empleado
     **/
    public Empleado(String nombre){
	this.nombre = nombre;
    }
     /**
     *Constructor con valores preestablecidos
     **/
    public Empleado(){
	this.nombre = "Jaime";
    }
    //get,set
    /**
     *Metodo que devuelve el nombre del empleado
     *
     *@return nombre EL nombre del empleado
     **/
    public String getNombre(){
	return this.nombre;
    }
     /**
     *Metodo que cambia el nombre del empleado
     *
     *@param nombre EL nuevo nombre del empleado
     **/
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
     /**
     *Metodo que devuelve una cadena de texto con los datos del empleado 
     **/
    public String toString(){
	return "Empleado : " + nombre; 
    }
     /**
     *Metodo que devuelve si dos empleados son equivalentes
     *@param empleado Un objeto de la clase Empleado
     **/
    public boolean equals(Object obj){
	Empleado empleadoComparacion = (Empleado)obj;
	return this.getNombre().equals(empleadoComparacion.getNombre());
    }   
}
