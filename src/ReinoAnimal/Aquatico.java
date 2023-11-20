package ReinoAnimal;

public class Aquatico extends Animal {

	private boolean escamoso;
	private String aquatico;

	/**
	 * @author Henderson Roberto
	 * @param especie
	 * @param sexo
	 * @param tipoAgua
	 * @param escamoso
	 * @param dataNascimento
	 */
	public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean escamoso) {
		super(especie, sexo, dataNascimento);
		this.aquatico = tipoAgua;
		this.escamoso = escamoso;
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

	

	public void perfil() {
		super.perfil();
		System.out.println("Escamoso: " + escamoso);
		System.out.println("Tipo de água: " + aquatico);
	}
	
	public void nadar() {

		/**
		 * Define que o animal está nadando.
		 */
		System.out.println("O animal está nadando...");

	}
	
	/**
	 * Define que o animal está comendo.
	 */
	public void comer() {

		
	}
}
