package utils;

import java.io.BufferedReader;
import java.util.regex.*;
import models.Cliente;

public class ClienteUtils {
	
	//  Pattern and Matcher to verify correct input (Pattern will change in specific methods)
	private Pattern p;
	private Matcher m;
	
	//  Add name method
	public void addNombre(Cliente cl, BufferedReader br){
		
		String nombre;
		boolean success = false;
		//To include characters like á ü etc
		p = Pattern.compile("[a-zA-ZÀ-ÿ]*", Pattern.CASE_INSENSITIVE);
		System.out.println("Ingrese el nombre del cliente : ");
		while(!success) {
			try {
				nombre = br.readLine();
				try {
					m = p.matcher(nombre);
					if(m.matches()) {
						cl.setNombre(nombre);
						success = true;
					} else {
						System.out.println("El nombre ingresado contiene caracteres inválidos. Intente de nuevo.");
					}
				}
				catch(Exception e) {
					System.out.println("Hubo un error al analizar el nombre. Intente de nuevo.");
				}
			}
			catch(Exception e) {
				System.out.println("Hubo un error al ingresar el nombre. Intente de nuevo.");
			}
		}
	}
	
	//  Add surname method
	public void addApellido(Cliente cl, BufferedReader br){
		
		String apellido;
		boolean success = false;
		//To include characters like á ü etc
		p = Pattern.compile("[a-zA-ZÀ-ÿ]*", Pattern.CASE_INSENSITIVE);
		System.out.println("Ingrese el apellido del cliente : ");
		while(!success) {
			try {
				apellido = br.readLine();
				try {
					m = p.matcher(apellido);
					if(m.matches()) {
						cl.setApellido(apellido);
						success = true;
					} else {
						System.out.println("El apellido ingresado contiene caracteres inválidos. Intente de nuevo.");
					}
				}
				catch(Exception e) {
					System.out.println("Hubo un error al analizar el apellido. Intente de nuevo.");
				}
			}
			catch(Exception e) {
				System.out.println("Hubo un error al ingresar el apellido. Intente de nuevo.");
			}
		}
	}
	
	
	public void addDocumento(Cliente cl, BufferedReader br){
		
		String documento;
		boolean success = false;
		//To include characters like á ü etc
		p = Pattern.compile("[0-9]*..[.]...[.]...");
		System.out.println("Ingrese el documento del cliente : ");
		while(!success) {
			try {
				documento = br.readLine();
				try {
					m = p.matcher(documento);
					if(m.matches()) {
						cl.setDocumento(documento);
						success = true;
					} else {
						System.out.println("El documento ingresado contiene caracteres inválidos. Intente de nuevo.");
					}
				}
				catch(Exception e) {
					System.out.println("Hubo un error al analizar el documento. Intente de nuevo.");
				}
			}
			catch(Exception e) {
				System.out.println("Hubo un error al ingresar el documento. Intente de nuevo.");
			}
		}
	}
	
	
	public void addMail(Cliente cl, BufferedReader br){
		
		String mail;
		boolean success = false;
		//To exclude characters like á ü etc
		p = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
		System.out.println("Ingrese el mail del cliente : ");
		while(!success) {
			try {
				mail = br.readLine();
				try {
					m = p.matcher(mail);
					if(m.matches()) {
						cl.setMail(mail);
						success = true;
					} else {
						System.out.println("El mail ingresado contiene caracteres inválidos. Intente de nuevo.");
					}
				}
				catch(Exception e) {
					System.out.println("Hubo un error al analizar el mail. Intente de nuevo.");
				}
			}
			catch(Exception e) {
				System.out.println("Hubo un error al ingresar el mail. Intente de nuevo.");
			}
		}
	}
	
	
	public void addNacimiento(Cliente cl, BufferedReader br) {
		String nacimiento;
		boolean success = false;
		p = Pattern.compile("^(?:(?:(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec))(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))(\\/|-|\\.)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:(?:0?2|(?:Feb))(\\/|-|\\.)(?:29)\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))(\\/|-|\\.)(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
		System.out.println("Ingrese la fecha de nacimiento del cliente : ");
		while(!success) {
			try {
				nacimiento = br.readLine();
				try {
					m = p.matcher(nacimiento);
					if(m.matches()) {
						cl.setNacimiento(nacimiento);
						success = true;
					} else {
						System.out.println("La fecha de nacimiento ingresada es inválida. Intente de nuevo.");
					}
				}
				catch(Exception e) {
					System.out.println("Hubo un error al analizar la fecha de nacimiento. Intente de nuevo.");
				}
			}
			catch(Exception e) {
				System.out.println("Hubo un error al ingresar la fecha de nacimiento. Intente de nuevo.");
			}
		}
	}
	
	
	public void addCliente(Cliente cl, BufferedReader br) {
		this.addNombre(cl, br);
		this.addApellido(cl, br);
		this.addDocumento(cl, br);
		this.addMail(cl, br);
		this.addNacimiento(cl, br);
		
	}
	
	
}
