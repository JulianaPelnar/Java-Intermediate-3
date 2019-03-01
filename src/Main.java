import models.ClienteArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		ClienteArray ca = new ClienteArray();
		ca.agregarClientes(br);
		ca.sortClientes(br);
		
		// this is just for test
		/*
		Cliente c1 = new Cliente("Juan", "Pelnar", "40.246.475", "juan45@yahoo.com", "09/07/2006");
		Cliente c2 = new Cliente("Nicolas", "Saavedra", "32.568.284", "njsr@hotmail.com", "07/27/1993");
		Cliente c3 = new Cliente("Juliana", "Zelnar", "39.099.128", "julianapelnar@gmail.com", "06/16/1995");
		Cliente c4 = new Cliente("Mario", "Jorge", "26.577.245", "skdgskheflwi@gmail.com", "10/30/1995");

		ClienteArray cl = new ClienteArray();
		cl.getClienteArray().add(c1);
		cl.getClienteArray().add(c2);
		cl.getClienteArray().add(c3);
		cl.getClienteArray().add(c4);
		cl.sortClientes(br);
		*/
	}

}
