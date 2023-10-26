package es.oesia.logstash;

public class Cliente {

	private String nombre;
	private String correo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Cliente(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}
	@Override
	public String toString() {
		return nombre + "   "+ correo;
	}
	
	
	
}
