package n1exercici2;

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
			double salario = (hores * super.getPreuHora()) + TARIFA;
			return salario;
		}
		@Deprecated
		public void calcularSou(double plus) {
			double salario = (160 * super.getPreuHora()) + plus;
			System.out.println(salario);
		}
}