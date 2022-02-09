package com.generation;

public class Triangulo extends FiguraGeometrica{

	public Triangulo() {
		super("Triangulo");//Al crear el objeto se llama triangulo
	}
	
	
	//polimorfismo:
	//se heredan los metodos del padre pero podemos manipular su comportamiento
	//polimorfismo = a sobreescribir
	//@Override: Señalar un metodo al que se le hara polimorfismo
	//debemos cambiar nuestros atributos de privated a protected para que podamos acceder desde una clase hija
	//oooo podemos: usar los getAlto y getLargo
	//accedemos a los valores en otra clase a travez de los get
	
	
	
	
	
	
	
	
	//metodo abstracto obliga a hacer polimorfismo
	@Override
	public float calcularArea() {
		return (getAlto() * getLargo())/2;
	}

	/*Podemos hacerlo abstracto tambien pero no es recomendable
	 * public abstract float perimetro() {
	} 
	 */
	
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
