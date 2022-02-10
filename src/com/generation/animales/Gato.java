package com.generation.animales;

public class Gato extends Animal implements Mascota{

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
	
}
