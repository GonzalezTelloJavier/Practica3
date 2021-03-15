package Pract3prob2;

import  java.util.ArrayList ;
import  java.util.HashSet ;

 clase  p�blica Fruta {
	
	public  Fruta ( String  nombre , float  extension , String  tiempoCosecha , float  cantCosechaxtiempo ,
			float  costoPromedio , float  precioVentaProm ) {
		super ();
		esto . nombre = nombre;
		esto . extension = extension;
		esto . tiempoCosecha = tiempoCosecha;
		esto . cantCosechaxtiempo = cantCosechaxtiempo;
		esto . costoPromedio = costoPromedio;
		esto . precioVentaProm = precioVentaProm;
		
	}
	/ **
	 * Descripci�n del nombre de la propiedad.
	 * /
	public  String nombre =  " " ;

	/ **
	 * Descripci�n de la extensi�n de la propiedad.
	 * /
	 extensi�n flotante p�blica =  0F ;

	/ **
	 * Descripci�n de la propiedad tiempoCosecha.
	 * /
	public  String tiempoCosecha;

	/ **
	 * Descripci�n de la propiedad cantCosechaxtiempo.
	 * /
	 carroza p�blica cantCosechaxtiempo;

	/ **
	 * Descripci�n de la propiedad costoPromedio.
	 * /
	 costoPromedio flotante p�blico =  0F ;

	/ **
	 * Descripci�n del inmueble precioVentaProm.
	 * /
	 precioVentaProm flotante p�blico =  0F ;

	/ **
	 * El constructor.
	 * /

	/ **
	 * Descripci�n del m�todo agregarPeriodo.
	 * @param periodo
	 * @param cantEstimada
	 * /
	private  ArrayList < String > periodo = new  ArrayList < String > ();
	Private  ArrayList  < Float> cantEstimada =  new  ArrayList < Float > ();
	
	public  void  agregarPeriodo ( String  periodo , float  cantEstimada ) {
		// Inicio del c�digo de usuario para el m�todo agregarPeriodo
		esto . periodo . agregar (periodo);
		esto . cantEstimada . a�adir (cantEstimada);
		// Fin del c�digo de usuario
	}

	/ **
	 * Descripci�n del m�todo eliminarPeriodo.
	 * @param i
	 * @return 
	 * /
	public  Boolean  eliminarPeriodo ( int  i ) {
		// Inicio del c�digo de usuario para el m�todo eliminarPeriodo
		Booleano eliminarPeriodo =  false ;
		if (i > = 0  && i < this . periodo . size ()) {
			esto . periodo . eliminar (i);
			esto . cantEstimada . eliminar (i);
			eliminarPeriodo = true ;
		}
		return eliminarPeriodo;

		
	}

	/ **
	 * Descripci�n del m�todo costoPeriodo.
	 * @param i
	 * @return 
	 * /
	 costoPeriodo flotante  p�blico ( int i ) { 
		
		flotador costoPeriodo =  0F ;
		if (i > = 0  && i < this . periodo . size ()) {
			
			costoPeriodo = esto . cantEstimada . obtener (i) * esto . costoPromedio;
		}
		return costoPeriodo;
	}

	/ **
	 * Descripci�n del m�todo de ganancia.
	 * @param i
	 * @return 
	 * /
	 ganancia flotante  p�blica ( int i ) { 
		ganancia flotante =  0F ;
		if (i > = 0 && i < this . periodo . size ()) {
			ganancia = esto . precioVentaProm - ( this . cantEstimada . get (i) * this . costoPromedio);
		}
			
			
		ganancia de retorno ;

	}

	/ **
	 * Devuelve nombre.
	 * @return nombre
	 * /
	public  String  getNombre () {
		devuelve  esto . nombre;
	}

	/ **
	 * Establece un valor para el atributo nombre. 
	 * @param newNombre
	 * /
	public  void  setNombre ( String  newNombre ) {
		esto . nombre = newNombre;
	}

	/ **
	 * Extensi�n de devoluciones.
	 * @return extensi�n
	 * /
	public  float  getExtension () {
		devuelve  esto . extensi�n;
	}

	/ **
	 * Establece un valor para la extensi�n del atributo. 
	 * @param newExtension
	 * /
	public  void  setExtension ( float  newExtension ) {
		esto . extension = newExtension;
	}

	/ **
	 * Devuelve tiempoCosecha.
	 * @return tiempoCosecha
	 * /
	public  String  getTiempoCosecha () {
		devuelve  esto . tiempoCosecha;
	}

	/ **
	 * Devoluciones cantCosechaxtiempo.
	 * @return cantCosechaxtiempo
	 * /
	public  float  getCantCosechaxtiempo () {
		devuelve  esto . cantCosechaxtiempo;
	}

	/ **
	 * Devuelve costoPromedio.
	 * @return costoPromedio
	 * /
	public  float  getCostoPromedio () {
		devuelve  esto . costoPromedio;
	}

	/ **
	 * Establece un valor al atributo costoPromedio. 
	 * @param newCostoPromedio
	 * /
	public  void  setCostoPromedio ( float  newCostoPromedio ) {
		esto . costoPromedio = newCostoPromedio;
	}

	/ **
	 * Devuelve precioVentaProm.
	 * @return precioVentaProm
	 * /
	public  float  getPrecioVentaProm () {
		devuelve  esto . precioVentaProm;
	}

	/ **
	 * Establece un valor para atribuir precioVentaProm. 
	 * @param newPrecioVentaProm
	 * /
	public  void  setPrecioVentaProm ( float  newPrecioVentaProm ) {
		esto . precioVentaProm = newPrecioVentaProm;
	}

	@Anular
	public  String  toString () {
		return  " Fruta [nombre = "  + nombre +  " , extensi�n = "  + extensi�n +  " , tiempoCosecha = "  + tiempoCosecha
				+  " , cantCosechaxtiempo = "  + cantCosechaxtiempo +  " , costoPromedio = "  + costoPromedio
				+  " , precioVentaProm = "  + precioVentaProm +  " , periodo = "  + periodo +  " , cantEstimada = "  + cantEstimada
				+   " ] " ;
	}

}