package ReinoAnimal;

public class Aereo extends Animal {
	
	double altitude;
	
	/**
	 * @author Henderson Roberto
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param altitude
	 */
	public Aereo(String especie, String sexo, String dataNascimento, double altitude) {
		super(especie, sexo, dataNascimento);
		this.altitude = altitude;
	}
	

	public void voar() {

		/**
		 * Define o animal voando.
		 */
		System.out.println("O animal está se voando...");

	}
	
	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public void comer() {

		/**
		 * Animal comendo
		 */

		System.out.println("O animal aéreo está comendo...");
	}
	
	public void perfil() {
		super.perfil();
		System.out.println("Altitude: " + altitude);
	}

}
