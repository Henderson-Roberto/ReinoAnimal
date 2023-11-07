package ReinoAnimal;

/**
 * 
 * @author Henderson Roberto
 *
 */

public class Animal {

	public String especie;
	public String sexo;
	public String dataNascimento;

	static int contagem = 0;;

	/**
	 * Construção de Animal
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 */

	public Animal(String especie, String sexo, String dataNascimento) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		contar();
	}

	/**
	 * Metodo para definir se o animal está se alimentando.
	 */

	public void comer() {
		System.out.println("O animal está sendo alimentado...");

	}

	/**
	 * Perfil de analise do animal.
	 */

	public void perfil() {
		System.out.println("Especie: " + especie);
		System.out.println("Sexo: " + sexo);
		System.out.println("Nascimento: " + dataNascimento);
		System.out.println("Quantidade: " + contagem);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static int getContagem() {
		return contagem;
	}

	public static void setContagem(int contagem) {
		Animal.contagem = contagem;
	}

	/**
	 * Para a contagem dos animais.
	 */
	public void contar() {
		contagem++;
	}

	public static int ExibeContagem() {
		return contagem;

	}
}
