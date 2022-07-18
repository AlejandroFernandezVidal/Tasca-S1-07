package n1exercici1;

public class Treballador {
	//Atributos
	private String nom;
	private String cognom;
	private double preuHora;
	
	//Constructor
	public Treballador(String nom, String cognom, double preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	//Getter
	public String getNom() {
		return this.nom;
	}
	public String getCognom() {
		return this.cognom;
	}
	public double getPreuHora() {
		return this.preuHora;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public void setPreuHora(double preuHora) {
		this.preuHora = preuHora;
	}
	
	public double calcularSou(int hores) {
		double salario = hores * this.preuHora;
		return salario;
	}
}