package n1exercici2;

public class Main {

	@SuppressWarnings("deprecation")//Añadido para que no aparezcan los warnings.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treballador treballador = new Treballador("Pepe","Navarrete",9.5);
		TreballadorOnline treballador1 = new TreballadorOnline("Antonio","Gonzalez",9.5);
		TreballadorPresencial treballador2 = new TreballadorPresencial("Jose","Garcia",9.5,35);
		
		System.out.println(treballador.calcularSou(160));
		System.out.println(treballador1.calcularSou(160));
		System.out.println(treballador2.calcularSou(160));
		
		treballador1.calcularSou(40.5);
		treballador2.calcularSou(45.5);
	}
}