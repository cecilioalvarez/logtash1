package es.oesia.logstash;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Principal2 {

	public static void main(String[] args) throws InterruptedException {

		try {
			String texto = "hola que tal estamos amigos \n";
			for (int i = 0; i < 50; i++) {
				Path fichero = Path.of(
						"C:\\Users\\cecilioalvarezcaules\\Desktop\\oesialogtash\\logstash-8.10.4\\ficherosorigen\\fichero2Personas.txt");
				
				Persona p= new Persona ("pepe"+i,"gomez"+i,i+"");
				
				Files.writeString(fichero,p.toString()+"\n",StandardOpenOption.APPEND);
				Thread.sleep(100);
			
				System.out.println(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
