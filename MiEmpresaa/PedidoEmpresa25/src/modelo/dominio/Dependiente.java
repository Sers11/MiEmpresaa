package src.modelo.dominio;

public class Dependiente extends Persona{
	public Dependiente(String dNICliente, String nombre) {
		super(dNICliente, nombre);
		// TODO Auto-generated constructor stub
	}

	public Dependiente(String dNICliente, String nombre, int numeroMostrador) {
		super(dNICliente, nombre);
		this.numeroMostrador = numeroMostrador;
	}

	private int numeroMostrador;
}
