package es.oesia.logstash;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Principal1 {

	public static void main(String[] args) throws InterruptedException {

		try {
			String texto = "hola que tal estamos amigos \n";
			for (int i = 0; i < 100; i++) {
				Path fichero = Path.of(
						"C:\\Users\\cecilioalvarezcaules\\Desktop\\oesialogtash\\logstash-8.10.4\\ficherosorigen\\fichero1.txt");
				Files.writeString(fichero, texto +i,StandardOpenOption.APPEND);
				Thread.sleep(100);
				String contenido = Files.readString(fichero);
				System.out.println(contenido);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
