package src.modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import src.modelo.dominio.Dependiente;
import src.modelo.dominio.Vendedor;
import src.modelo.repositorios.Populable;

public class DependienteOM implements Populable<Dependiente> {
	public static List<Dependiente> crearVendedores(){
		List<Dependiente> dependientes = new ArrayList<>();
        dependientes.add(new Dependiente("12345678A", "Juan Pérez", 1));
        dependientes.add(new Dependiente("87654321B", "María García", 2));
        dependientes.add(new Dependiente("98765432C", "Pedro Rodríguez", 3));
        dependientes.add(new Dependiente("45678901D", "Ana López", 4));
        dependientes.add(new Dependiente("01234567E", "Luis González", 5));
        dependientes.add(new Dependiente("78901234F", "Laura Martínez", 6));
        dependientes.add(new Dependiente("34567890G", "David Sánchez", 7));
        dependientes.add(new Dependiente("90123456H", "Isabel Fernández", 8));
        dependientes.add(new Dependiente("67890123I", "Carlos Romero", 9));
        dependientes.add(new Dependiente("23456789J", "Marta Moreno", 10));
        dependientes.add(new Dependiente("56789012K", "Javier Alonso", 11));
        dependientes.add(new Dependiente("11111111L", "Sofia Torres", 12));
        dependientes.add(new Dependiente("22222222M", "Miguel Diaz", 13));
        dependientes.add(new Dependiente("33333333N", "Elena Garcia", 14));
        dependientes.add(new Dependiente("44444444O", "Daniel Lopez", 15));
        
        return dependientes;
	}

	@Override
	public List<Dependiente> getElementos() {
		// TODO Auto-generated method stub
		return null;
	}

}
