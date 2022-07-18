package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treballador treballador = new Treballador("Pepe","Navarrete",9.5);
		TreballadorOnline treballador1 = new TreballadorOnline("Antonio","Gonzalez",9.5);
		TreballadorPresencial treballador2 = new TreballadorPresencial("Jose","Garcia",9.5,35);
		
		System.out.println(treballador.calcularSou(160));
		System.out.println(treballador1.calcularSou(160));
		System.out.println(treballador2.calcularSou(160));
	}
}