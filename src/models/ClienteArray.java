package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import utils.ClienteUtils;


public class ClienteArray {
	
	//  FIELD	
	private ArrayList<Cliente> cl;
	
	//  CONSTRUCTOR
	public ClienteArray() {
		this.cl = new ArrayList<Cliente>();
	}
	
	// GETTER
	public ArrayList<Cliente> getClienteArray() {
		if(cl != null) {
			return this.cl;
		} else {
			System.out.println("No existe ninguna lista a la cual cargar los datos.");
			return null;
		}
	}
	
	//  SETTER
	public void setClienteArray(BufferedReader br) {
		Cliente c = new Cliente();
		ClienteUtils cinput = new ClienteUtils();
		cinput.addCliente(c, br);
		this.getClienteArray().add(c);
	}
	
	//  MÉTODO PARA AGREGAR CLIENTES, LA CARGA SE REALIZA HASTA QUE EL CLIENTE TIPEE NO EN MENU
	public void agregarClientes(BufferedReader br) {
		String menu;
		boolean continuar = true;
		setClienteArray(br);
		while(continuar) {
			System.out.println("Ingrese 'Si' si desea ingresar otro cliente, ingrese 'No' si desea finalizar.");
			try {
				menu = br.readLine();
				switch(menu) {
				case "Si":
					setClienteArray(br);
					continuar = true;
					break;
				case "No":
					System.out.println("Finaliza la carga de clientes.");
					continuar = false;
					break;
				default:
					System.out.println("Los caracteres ingresados no corresponden con una opción.");
					System.out.println("Por favor, ingrese Si o No (con mayúscula) para poder continuar : ");
					continuar = true;
					break;
				}
			}
			catch (Exception e){
				System.out.println("Hbo un problema al interpretar el input. Intente de nuevo.");
			}
		}
	}
	
	//  MÉTODO QUE ORDENA CLIENTES DE ACUERDO AL CRITERIO DEL CLIENTE
	public void sortClientes(BufferedReader br) {
		ArrayList<Cliente> cl = this.getClienteArray();
		String criterio = "null";
		boolean sorted = false;
		System.out.println("Ingrese el criterio en el que desea ordenar los clientes exactamente como se define a continuación:");
		System.out.println("nombre - apellido - documento - mail - nacimiento");
		while(!sorted) {
			try {
				criterio = br.readLine();
				switch(criterio) {
				case "nombre":
					Collections.sort(cl, new ClienteComparator().new porNombre());
					sorted = true;
					break;
				case "apellido":
					Collections.sort(cl, new ClienteComparator().new porApellido());
					sorted = true;
					break;
				case "documento":
					Collections.sort(cl, new ClienteComparator().new porDocumento());
					sorted = true;
					break;
				case "mail":
					Collections.sort(cl, new ClienteComparator().new porMail());
					sorted = true;
					break;
				case "nacimiento":
					Collections.sort(cl, new ClienteComparator().new porNacimiento());
					sorted = true;
					break;
				default:
					System.out.println("Los caracteres ingresados no son válidos. Intente de nuevo.");
					sorted = false;
					break;
				}
			} catch (IOException e) {
				System.out.println("Hubo un error al leer input. Intente de nuevo.");
				sorted = false;
			}
		}
		
		for(Cliente c: cl) {
			System.out.println(c);
		}
	}
	
}
