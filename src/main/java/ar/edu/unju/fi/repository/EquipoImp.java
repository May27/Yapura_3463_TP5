/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Yapura3463Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Marisel Anahi Yapura
 */
@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Yapura3463Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto equipo en la BD
		LOG.info("El equipo fue guardado " + equipo.getNombre());
	}

	@Override
	public Equipo mostrar() {
		// Se recuperan todos los datos del equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto equipo de la BD
		LOG.info("Se eliminó el equipo de la BD");
	}

	@Override
	public Equipo modificar() {
		// Se modifica el objeto equipo extraido de la BD
		LOG.info("Se modificaron los datos del equipo correctamente");
		return equipo;
	}

}
