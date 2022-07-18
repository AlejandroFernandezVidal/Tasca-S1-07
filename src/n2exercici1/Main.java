package n2exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import n2exercici1.AnotacionPersonalizada.Serializacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Pepe","Navarrete",50);
		SerializacionObjeto(persona);
	}
	
	@Serializacion(archivo = "/Users/alexfernandez/eclipse-workspace/Tasca S1.07/src/n2exercici1/ObjetoPersona.json")
	public static void SerializacionObjeto(Persona persona) {
		String ruta = "/Users/alexfernandez/eclipse-workspace/Tasca S1.07/src/n2exercici1/ObjetoPersona.json";
		try {
		FileOutputStream registro = new FileOutputStream(ruta);
		ObjectOutputStream salida = new ObjectOutputStream(registro);
		salida.writeObject(persona);
		salida.close();
		FileInputStream recibido = new FileInputStream(ruta);
		ObjectInputStream entrada = new ObjectInputStream(recibido);
		System.out.println(entrada.readObject());
		entrada.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}