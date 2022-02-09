package com.generation;

//public class FiguraGeometrica {

public abstract class FiguraGeometrica {
	//clases abstractas
	//clases que pueden o no contener metodos abstractos
	//no pueden generar objetos
	//la usamos para heredar pero no la queremos para crear objetos
	//Metodo abstracto: es un metodo que te dice que hacer pero no te dice como hacerlo, utilidad:
	//es util en trabajos en equipo para que cada persona trabaja con el mismo nombre del metodo que creamos
	//pero ellos crean su propio metodo

	
	
	//recomedado que las variables en java sean privadas
	//solo podran ser modificadas dentro de esta clase
	//el encapsular evita que alguien modifique nuestros datos originales
	//accedemos al atributo sin tocarlo
	//ejemplo: con esto no te cambian tu cuenta bancaria 
	private String nombre;
	private float alto;
	private float largo;
	
	//Constructor que recibe un string y ese string que reciba lo asocia al nombre de los objetos
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
		
	//se ponemos la condicion
	public void setNombre(String nombre) { 
			this.nombre = nombre;
			
	}
	
	
	public float getAlto() {
		return this.alto;
	}
		
	//se ponemos la condicion
	public void setAlto(float alto) { 
			this.alto = alto;
			
	}
	

	public float getLargo() {
		return this.largo;
	}
		
	public void setLargo(float largo) { 
			this.largo = largo;
			
	}
	
	/*cometada para el ejercicio abstract
	public float calcularArea() {
		return alto * largo;
	}
	*/
	
	//metodo abstracto
	//le decimos que es sin el metodo, clases hijas se encargan del metodo
	public abstract float calcularArea();
	
	public abstract float perimetro();
}





