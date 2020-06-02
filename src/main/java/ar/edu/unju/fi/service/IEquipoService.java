/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;

/**
 * @author Anahi
 *
 */
public interface IEquipoService {
	
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
	
}
