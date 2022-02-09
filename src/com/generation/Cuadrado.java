package com.generation;


public class Cuadrado extends FiguraGeometrica {
	//extends despues del nombre de la clase, con el nombre de la clase que heredara
	//con esto Cuadrado se vuelve la sub clase o hija de FiguraGeometrica (superclase o clase padre)
	
	//herencia de constructor
	//llamaremos al constructor padre con la palabra super y debe ser la primer linea que tenga el constructor
	public Cuadrado() {
		super("Cuadrado");//Al crear el objeto se llama Cuadrado
	}
	//con esto pone los nombres de los objetos en automatico por que hereda las caracteristicas del constructor padre

	
	//podemos tener varios constructores en un hijo como en un padre pero:
	//no podemos tener varias veces el constructor padre en el mismo constructor hijo
	
	
	//el metodo abstracto me obliga a hacer polimosrfismo en las hijas para establecer el metodo
	@Override
	public float calcularArea() {
		return getAlto() * getLargo();
	}

	@Override
	public float perimetro() {
		return (getAlto() + getLargo() *2);
	}
	
	
	
}
