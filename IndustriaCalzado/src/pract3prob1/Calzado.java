package pract3prob1;

public class Calzado {

	private int clave = 0;
	private String material = "";
	private String troquel = "";
	private int cantProdxDia  = 0;
	private String colores  = "";

	public Calzado() {

		super();

	}

	public float costoxLote(float  costoxUnida) {
		float costoxLote = 0F;
		return costoxLote;
	}

	public int getClave() {
		return this.clave;
	}

	public void setClave(int newClave) {
	    this.clave = newClave;
	}

	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String newMaterial) {
	    this.material = newMaterial;
	}

	public String getTroquel() {
		return this.troquel;
	}

	public void setTroquel(String newTroquel) {
	    this.troquel = newTroquel;
	}

	public int getCantProdxDia () {
		return this.cantProdxDia ;
	}
	
	public void setCantProdxDia (int newCantProdxDia ) {
	    this.cantProdxDia  = newCantProdxDia ;
	}

	public String getColores () {
		return this.colores ;
	}

	public void setColores (String newColores ) {
	    this.colores  = newColores ;
	}

}
