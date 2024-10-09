package Agregacao;

public class Principal {

	public static void main(String[] args) {

		Motor motor = new Motor ("VS");
		
		Carro carro = new Carro ("Mustang", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
		
	}

}
