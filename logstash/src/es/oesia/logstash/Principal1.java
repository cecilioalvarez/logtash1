package es.oesia.logstash;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal1 {

	public static void main(String[] args) {

		try {
			String texto = "hola que tal estamos logstash";
			Path fichero = Path
					.of("C:\\Users\\cecilioalvarezcaules\\Desktop\\oesialogtash\\logstash-8.10.4\\ficherosorigen\\fichero1.txt");
			Files.writeString(fichero, texto);
			String contenido = Files.readString(fichero);
			System.out.println(contenido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
