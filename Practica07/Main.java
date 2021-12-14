/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Main{
    /**
     *Metodo principal en el que usamos la clase Empleado y sus hijas
     *@param Args Los argumentos
     **/
    public static void main(String []args){
	
	Empleado empleado = new Empleado("Juan");
	Empleado empleado2 = new Empleado("Jaime");
	Empleado empleado3 = new Empleado();
	Operador operador = new Operador("Jelipe");
	Directivo directivo = new Directivo("JOjojo");
	Oficial oficial = new Oficial();
	Oficial oficial1 = new Oficial();
	Tecnico tecnico = new Tecnico("h");
	//GET
	//SET
	operador.setNombre("");	
	directivo.setNombre("");
	//Trabaja
	System.out.println(oficial.trabaja());
	//toString
	System.out.println(directivo.toString());
	System.out.println(oficial.toString());
	System.out.println(empleado.toString());
	System.out.println(tecnico.toString());
	System.out.println(empleado.toString());
	//equals
	System.out.println(empleado.equals(empleado3));
	System.out.println(oficial1.equals(oficial));
	System.out.println(empleado2.equals(empleado3));
	
	
    }
    
}
