package src.modelo.repositorios.om;
import java.util.ArrayList;
import java.util.List;
import src.modelo.dominio.Vendedor;
import src.modelo.repositorios.Populable;

public class VendedorOM implements Populable<Vendedor> {

	public static List<Vendedor> crearVendedores(){
		 List<Vendedor> vendedores = new ArrayList<>();
		 
	        vendedores.add(new Vendedor("12345678A", "Juan Pérez"));
	        vendedores.add(new Vendedor("87654321B", "María García"));
	        vendedores.add(new Vendedor("98765432C", "Pedro Rodríguez"));
	        vendedores.add(new Vendedor("45678901D", "Ana López"));
	        vendedores.add(new Vendedor("01234567E", "Luis González"));
	        vendedores.add(new Vendedor("78901234F", "Laura Martínez"));
	        vendedores.add(new Vendedor("34567890G", "David Sánchez"));
	        vendedores.add(new Vendedor("90123456H", "Isabel Fernández"));
	        vendedores.add(new Vendedor("67890123I", "Carlos Romero"));
	        vendedores.add(new Vendedor("23456789J", "Marta Moreno"));
	        vendedores.add(new Vendedor("56789012K", "Javier Alonso"));
	        return vendedores;
	}

	@Override
	public List<Vendedor> getElementos() {
		// TODO Auto-generated method stub
		return null;
	}

}
