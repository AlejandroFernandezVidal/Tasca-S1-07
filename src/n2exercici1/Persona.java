package n2exercici1;

import java.io.Serializable;


public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Atributos
	private String nom;
	private String cognom;
	private int edat;
	
	//Constructor
	public Persona(String nom, String cognom, int edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	
	//Getter
	public String getNom() {
		return this.nom;
	}
	public String getCognom() {
		return this.cognom;
	}
	public int getEdat() {
		return this.edat;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	@Override
	public String toString() {
		return this.nom + " " + this.cognom + " " + this.edat;
	}
}