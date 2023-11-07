package ReinoAnimal;

public class Terrestre {
	String regiao;
	boolean pelo;
	
	public Terrestre(String especie, String sexo, int i, String regiao, boolean pelo) {
		super();
		this.regiao = regiao;
		this.pelo = pelo;
	}
	
	public void mover() {

		/**
		 * O animal está se movendo.
		 */
		System.out.println("O animal está se movendo...");

	}

	public void comer() {

		/**
		 * Animal está comendo
		 */

		System.out.println("O animal terrestre está comendo...");
	}

	public void perfil() {

		/**
		 * Perfil
		 * 
		 **/
		
		System.out.println("Pertencente a região: " + regiao + "Possui pelo: " + pelo);

	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
}
