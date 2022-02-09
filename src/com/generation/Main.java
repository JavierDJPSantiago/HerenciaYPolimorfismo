package com.generation;

public class Main {

	public static void main(String[] args) {
		//Herencia: cuando una clase hereda de otra, esta tiene los metodos y atributos
		//al heredar los metodos y atributos de las clases, te ahorras escribir mucho codigo
		
		/*
		//Trabajando con clase Cuadrado
		Cuadrado cuadrado1 = new Cuadrado();
		
		//Herencia: cuadrado1 surge de Cuadrado y Cuadrado es hija de FiguraGeometrica
		//cuadrado1 hereda todos los metodos del padre FiguraGeometrica
		//cuadrado1.setNombre("Cuadrado");
		
		System.out.println(cuadrado1.getNombre());//Cuadrado//lleva parentesis por que ya no es propuedad es metodo
		*/
		
		/*
		//Trabajando con clase Triangulo
		Triangulo triangulo1 = new Triangulo();
		//triangulo1.setNombre("Triangulo");
		System.out.println(triangulo1.getNombre());//Triangulo
		*/
		
		//Orden de ejecucion: primero el constructro padre y luego el hijo:
		//por que el constructor hijo tiene adentro al padre
		/*Constructor padre
		 * constructor cuadrado
		 * constructor padre
		 * constructor triangulo
		 */
		
		
		//---------------------------------------Trabajando con metodos//
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		System.out.println("El area del " + cuadrado1.getNombre() + "es " + cuadrado1.calcularArea());//100.0
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		System.out.println("El area del " + triangulo1.getNombre() + "es " + triangulo1.calcularArea());//75.0
		//por el polimorfismo
		
		
		
		
	}

}


//set establece valores (para que demos valores) y get devuelve valores (el valor establecido lo regresa)
