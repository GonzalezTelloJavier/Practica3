/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Pract3prob3;

import Pract3prob3.Ubicacion;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author JavierTello
 */
public class CuerpoCeleste {
	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";
	
	/**
	 * Description of the property localizaciones.
	 */
	private Ubicacion localizaciones = null;
	
	/**
	 * Description of the property composicion.
	 */
	private String composicion = "";
	
	// Start of user code (user defined attributes for CuerpoCeleste)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for CuerpoCeleste)
	
	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
	    this.nombre = newNombre;
	}

	/**
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public Ubicacion getLocalizaciones() {
		return this.localizaciones;
	}
	
	/**
	 * Sets a value to attribute localizaciones. 
	 * @param newLocalizaciones 
	 */
	public void setLocalizaciones(Ubicacion newLocalizaciones) {
	    this.localizaciones = newLocalizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}
	
	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
	    this.composicion = newComposicion;
	}



}
