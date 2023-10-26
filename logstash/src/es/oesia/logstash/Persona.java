package es.oesia.logstash;

public class Persona {

	private String nombre;
	private String apellidos;
	private String edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, String edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
//	@Override
//	public String toString() {
//		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
//	}
	@Override
	public String toString() {
		return nombre + ","+ apellidos + ","+edad;
	}
	
}
