package n1exercici1;

public class TreballadorOnline extends Treballador{
	//Atributos
	private int TARIFA = 25;
	
	//Constructor
	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom,cognom,preuHora);
	}
	
	//Metodo sobreescribir
	@Override
	public double calcularSou(int hores) {
		double salario = (hores * super.getPreuHora()) + this.TARIFA;
		return salario;
	}
}