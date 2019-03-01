package models;

public class Cliente {
	
	//  FIELDS
	private String nombre;
	private String apellido;
	private String documento;
	private String mail;
	private String nacimiento;
	
	//  CONSTRUCTOR
	public Cliente() {
	}
	
	//  CONSTRUCTOR OVERLOAD
	public Cliente(String nombre, String apellido, String documento, String mail, String nacimiento) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDocumento(documento);
		this.setMail(mail);
		this.setNacimiento(nacimiento);
	}
	
	//  GETTERS
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDocumento() {
		return this.documento;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public String getNacimiento() {
		return this.nacimiento;
	}
	
	//  SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	@Override
	public String toString() {
		return "Nombre : " + this.nombre + " Apellido : " + this.apellido + " Documento : " + this.documento + " Mail : " + this.mail + " Fecha de nacimiento : " + this.nacimiento;
	}

}
