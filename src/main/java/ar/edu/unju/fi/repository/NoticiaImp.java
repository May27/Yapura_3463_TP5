package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Yapura3463Tp5Application;
import ar.edu.unju.fi.model.Noticia;

/**
 * @author Marisel Anahi Yapura
 */
@Repository
public class NoticiaImp implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Yapura3463Tp5Application.class);
	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto noticia en la BD
		LOG.info("La noticia fue guardada " + noticia.getTitulo());
	}

	@Override
	public Noticia mostrar() {
		// Se recuperan todos los datos de la noticia
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto noticia de la BD
		LOG.info("Se eliminó la noticia de la BD");
	}

	@Override
	public Noticia modificar() {
		// Se modifica el objeto noticia extraido de la BD
		LOG.info("Se modificaron los datos de la noticia correctamente");
		return noticia;
	}

}
