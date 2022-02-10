package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar {
//al usar una interface en una clase te exige implementar los metodos que tiene el interface
//puedes implementar multiples interfaces
//no es necesario extender una clase o transformar en hija en la que trabajamos, podemos implementar interfaces sin extender
//interface te obliga a implementar todos sus metodos y clase no
//usa interfaces cuando sepas que todo lo que contiene sera igual para todas las clases donde lo implementes

	
	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la pelota");
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");

	}

	@Override
	public void baniar() {
		System.out.println("Me gusta el agua");

		
	}

	@Override
	public void moverLaColita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarConCajas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciarse() {
		// TODO Auto-generated method stub
		
	}

}
