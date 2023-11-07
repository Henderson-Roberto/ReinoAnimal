package ReinoAnimal;

public class Aereo {
	
	double altitude;
	
	/**
	 * @author Henderson Roberto
	 * @param especie
	 * @param sexo
	 * @param i
	 * @param altitude
	 */
	public Aereo(String especie, String sexo, int i, double altitude) {
		super();
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

		/**
		 * Imprime no console os dados do animal
		 **/

		System.out.println("Altitude de vôo: " + altitude);
	}

}
