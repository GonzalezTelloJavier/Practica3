package Pract3prob2;

public class Fruta {

	private String nombre = "";
	private float extension = 0F;
	private String tiempoCosecha = "";
	private float cantCosechaxtiempo = 0F;
	private float costoPromedio = 0F;
	private float precioVentaProm = 0F;

	public Fruta() {

		super();

	}

	public void agregarPeriodo(String periodo, float cantEstimada) {

	}

	public void eliminarPeriodo(boolean , int i) {

	}

	public void costoPeriodo (float , int i) {

	}

	public void ganancia (float , int i) {
	
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public float getExtension() {
		return this.extension;
	}

	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	public String getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	public void setTiempoCosecha(String newTiempoCosecha) {
		this.tiempoCosecha = newTiempoCosecha;
	}

	public float getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	public void setCantCosechaxtiempo(float newCantCosechaxtiempo) {
		this.cantCosechaxtiempo = newCantCosechaxtiempo;
	}

	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

}
