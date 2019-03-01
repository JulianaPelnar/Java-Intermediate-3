package models;

import java.util.Comparator;

public class ClienteComparator {
	
	//  CADA CLASE SIRVE PARA ORDENAR EL ARRAY CON DISTINTO CRITERIO
	
	public class porNombre implements Comparator<Cliente> {
		@Override
		public int compare(Cliente obj1, Cliente obj2) {
			return obj1.getNombre().compareToIgnoreCase(obj2.getNombre());
		}
	}
	
	public class porApellido implements Comparator<Cliente> {
		@Override
		public int compare(Cliente obj1, Cliente obj2) {
			return obj1.getApellido().compareToIgnoreCase(obj2.getApellido());
		}
	}
	
	public class porDocumento implements Comparator<Cliente> {
		@Override
		public int compare(Cliente obj1, Cliente obj2) {
			return obj1.getDocumento().compareTo(obj2.getDocumento());
		}
	}
	
	public class porMail implements Comparator<Cliente> {
		@Override
		public int compare(Cliente obj1, Cliente obj2) {
			return obj1.getMail().compareTo(obj2.getMail());
		}
	}
	
	public class porNacimiento implements Comparator<Cliente> {
		@Override
		public int compare(Cliente obj1, Cliente obj2) {
			return obj1.getNacimiento().compareTo(obj2.getNacimiento());
		}
	}

}
