package ReinoAnimal;

public class Principal {
	
	public static void main(String[] args) {

	Aquatico aqua = new Aquatico(null, null, null, null, false);
	aqua.setSexo("femea");
	aqua.setEspecie(" Carcharias taurus ");
	aqua.setDataNascimento("7");
	aqua.setAquatico("água salgada");
	aqua.setEscamoso(false);
	aqua.comer();
	aqua.nadar();
	aqua.perfil();
	
	System.out.println(" ");
	
	Aquatico aqua2 = new Aquatico(null, null, null, null, true);
	aqua2.setSexo("macho");
	aqua2.setEspecie(" Pygocentrus nattereri");
	aqua2.setDataNascimento("3");
	aqua2.setAquatico("água doce");
	aqua2.setEscamoso(true);
	aqua2.comer();
	aqua2.nadar();
	aqua2.perfil();
	
	System.out.println(" ");
	
	Terrestre terra = new Terrestre(null, null, null, null, false);
	terra.setSexo("fêmea");
	terra.setEspecie("Felis catus");
	terra.setDataNascimento("2");
	terra.setRegiao("Asia");
	terra.setPelo(true);
	terra.comer();
	terra.mover();
	terra.perfil();
	
	System.out.println(" ");
	
	Terrestre terra2 = new Terrestre(null, null, null, null, false);
	terra2.setSexo("macho");
	terra2.setEspecie("Hydrochoerus hydrochaeris");
	terra2.setDataNascimento("8");
	terra2.setRegiao("America do Sul");
	terra2.setPelo(true);
	terra2.comer();
	terra2.mover();
	terra2.perfil();
	
	System.out.println(" ");
	
	Aereo air = new Aereo(null, null, null, 0);
	air.setEspecie("Coragyps atratus");
	air.setSexo("macho");
	air.setDataNascimento("3");
	air.setAltitude(54.5);
	air.comer();
	air.voar();
	air.perfil();
	
	System.out.println(" ");
	
	Aereo air2 = new Aereo(null, null, null, 0);
	air2.setEspecie("Amazona aestiva");
	air2.setSexo("fêmea");
	air2.setDataNascimento("10");
	air2.setAltitude(37.9);
	air2.comer();
	air2.perfil();

	System.out.println(" ");
	
		System.out.println("Quantidade de Animais registrados: "
				+ Animal.ExibeContagem());
		

	}

}
