package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Yapura3463Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * @author Marisel Anahi Yapura
 */
@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;

	public static Logger LOG = LoggerFactory.getLogger(Yapura3463Tp5Application.class);
	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto resultado en la BD
		LOG.info("El resultado fue guardado...");
	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos del resultado
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto resultado de la BD
		LOG.info("Se eliminó el resultado de la BD");
	}

	@Override
	public Resultado modificar() {
		// Se modifica el objeto resultado extraido de la BD
		LOG.info("Se modificaron los datos del resultado correctamente");
		return resultado;
	}

}
