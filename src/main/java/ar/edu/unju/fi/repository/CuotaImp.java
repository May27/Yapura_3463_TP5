package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Yapura3463Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * @author Marisel Anahi Yapura
 */
@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Yapura3463Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto cuota en la BD
		LOG.info("La Cuota fue guardada correctamente " + cuota.getId() + cuota.getMonto() + cuota.getPeriodo());
	}

	@Override
	public Cuota mostrar() {
		// Se recuperan todos los datos de la cuota
		LOG.info("Mostrar los datos almacenados de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto cuota de la BD
		LOG.info("Se eliminó la cuota de la BD");

	}

	@Override
	public Cuota modificar() {
		// Se modifica el objeto cuota extraido de la BD
		LOG.info("Se modificaron los datos de la cuota correctamente");		
		return cuota;
	}

}
