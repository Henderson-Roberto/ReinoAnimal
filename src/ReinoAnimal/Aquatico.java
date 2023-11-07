package ReinoAnimal;

public class Aquatico {

	boolean escamoso;
	private String aquatico;

	/**
	 * @author Henderson Roberto
	 * @param especie
	 * @param sexo
	 * @param i
	 * @param tipoAgua
	 * @param escamoso
	 */
	public Aquatico(String especie, String sexo, int i, String tipoAgua, boolean escamoso) {
		super();
		this.aquatico = aquatico;
		this.escamoso = escamoso;
	}

	public void nadar() {

		/**
		 * Define que o animal está nadando.
		 */
		System.out.println("O animal está nadando...");

	}

	public boolean isEscamoso() {
		return escamoso;
	}

	public void setEscamoso(boolean escamoso) {
		this.escamoso = escamoso;
	}

	public String getAquatico() {
		return aquatico;
	}

	public void setAquatico(String aquatico) {
		this.aquatico = aquatico;
	}

	/**
	 * Define que o animal está comendo.
	 */
	public void comer() {

		System.out.println("O animal aquatico está comendo...");
	}

	public void perfil() {

		/**
		 * Perfil animal.
		 * 
		 **/
		System.out.println("Tipo de água: " + aquatico + "Escamoso: " + escamoso);

	}
}
