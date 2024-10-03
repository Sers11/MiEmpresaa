package src.test;

import static org.junit.Assert.assertNotNull;


import org.junit.jupiter.api.Test;

import src.modelo.dominio.Articulo;
import src.modelo.dominio.Persona;
import src.modelo.repositorios.RepositorioLista;
import src.modelo.repositorios.om.PersonaMother;

class ArtiucloTest {

	@Test
	void test() {
//		RepositorioLista<Articulo,Long> articuloRepositorioLista=new RepositorioLista<Articulo, Long>();
//		RepositorioLista<Persona,String> personaRepositorioLista=new RepositorioLista();
		RepositorioLista<Persona,String> personaRepositorioListaOM=new RepositorioLista(new PersonaMother());
		assertNotNull(personaRepositorioListaOM.getByKey("12345678A").get());
	}

}
