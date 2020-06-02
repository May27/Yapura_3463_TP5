/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Yapura3463Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Marisel Anahi Yapura
 */
@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Yapura3463Tp5Application.class);	

	@Override
	public void guaurdar() {
		// Acción ejecutada para guardar un objeto estadio en la BD
		LOG.info("El estadio fue guardado " + estadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto estadio de la BD
		LOG.info("Se eliminó el estadio de la BD");
	}

	@Override
	public Estadio modificar() {
		// Se modifica el objeto estadio extraido de la BD
		LOG.info("Se modificaron los datos del estadio correctamente");
		return estadio;
	}

}
