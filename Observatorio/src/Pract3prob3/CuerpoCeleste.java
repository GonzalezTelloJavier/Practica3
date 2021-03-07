package Pract3prob3;

import Pract3prob3.Ubicacion;

public class CuerpoCeleste {

	private String nombre = "";
	private Ubicacion localizaciones = null;
	private String composicion = "";

	public CuerpoCeleste() {
		super();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public Ubicacion getLocalizaciones() {
		return this.localizaciones;
	}

	public void setLocalizaciones(Ubicacion newLocalizaciones) {
		this.localizaciones = newLocalizaciones;
	}

	public String getComposicion() {
		return this.composicion;
	}

	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}
}
