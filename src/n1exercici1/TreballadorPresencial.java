package n1exercici1;

public class TreballadorPresencial extends Treballador{
	//Atributo
	private static double benzina;
	
	//Constructor
	public TreballadorPresencial(String nom, String cognom, double preuHora, double benzina) {
		super(nom, cognom, preuHora);
		TreballadorPresencial.benzina = benzina;
	}
	
	//Getter
	public double getBenzina() {
		return TreballadorPresencial.benzina;
	}
	
	//Setter
	public void setBenzina(double benzina) {
		TreballadorPresencial.benzina = benzina;
	}
	
	@Override
	public double calcularSou(int hores) {
		double salario = (hores * super.getPreuHora()) + TreballadorPresencial.benzina;
		return salario;
	}
}