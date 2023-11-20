package ReinoAnimal;



public class Terrestre extends Animal {
	String regiao;
	boolean pelo;
	
	/**
	 * @author Henderson Roberto
	 * @param especie
	 * @param sexo
	 * @param regiao
	 * @param pelo
	 * @param dataNascimento
	 */
	
	public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelo) {
		super(especie, sexo, dataNascimento);
		this.regiao = regiao;
		this.pelo = pelo;
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
	
	public void perfil() {
		super.perfil();
		System.out.println("Região: " + regiao);
		System.out.println("Pelo: " + pelo);
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

}
