package Pract3prob2;

import  java.util.ArrayList ;
import  java.util.HashSet ;

 clase  pública Fruta {
	
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
	 * Descripción del nombre de la propiedad.
	 * /
	public  String nombre =  " " ;

	/ **
	 * Descripción de la extensión de la propiedad.
	 * /
	 extensión flotante pública =  0F ;

	/ **
	 * Descripción de la propiedad tiempoCosecha.
	 * /
	public  String tiempoCosecha;

	/ **
	 * Descripción de la propiedad cantCosechaxtiempo.
	 * /
	 carroza pública cantCosechaxtiempo;

	/ **
	 * Descripción de la propiedad costoPromedio.
	 * /
	 costoPromedio flotante público =  0F ;

	/ **
	 * Descripción del inmueble precioVentaProm.
	 * /
	 precioVentaProm flotante público =  0F ;

	/ **
	 * El constructor.
	 * /

	/ **
	 * Descripción del método agregarPeriodo.
	 * @param periodo
	 * @param cantEstimada
	 * /
	private  ArrayList < String > periodo = new  ArrayList < String > ();
	Private  ArrayList  < Float> cantEstimada =  new  ArrayList < Float > ();
	
	public  void  agregarPeriodo ( String  periodo , float  cantEstimada ) {
		// Inicio del código de usuario para el método agregarPeriodo
		esto . periodo . agregar (periodo);
		esto . cantEstimada . añadir (cantEstimada);
		// Fin del código de usuario
	}

	/ **
	 * Descripción del método eliminarPeriodo.
	 * @param i
	 * @return 
	 * /
	public  Boolean  eliminarPeriodo ( int  i ) {
		// Inicio del código de usuario para el método eliminarPeriodo
		Booleano eliminarPeriodo =  false ;
		if (i > = 0  && i < this . periodo . size ()) {
			esto . periodo . eliminar (i);
			esto . cantEstimada . eliminar (i);
			eliminarPeriodo = true ;
		}
		return eliminarPeriodo;

		
	}

	/ **
	 * Descripción del método costoPeriodo.
	 * @param i
	 * @return 
	 * /
	 costoPeriodo flotante  público ( int i ) { 
		
		flotador costoPeriodo =  0F ;
		if (i > = 0  && i < this . periodo . size ()) {
			
			costoPeriodo = esto . cantEstimada . obtener (i) * esto . costoPromedio;
		}
		return costoPeriodo;
	}

	/ **
	 * Descripción del método de ganancia.
	 * @param i
	 * @return 
	 * /
	 ganancia flotante  pública ( int i ) { 
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
	 * Extensión de devoluciones.
	 * @return extensión
	 * /
	public  float  getExtension () {
		devuelve  esto . extensión;
	}

	/ **
	 * Establece un valor para la extensión del atributo. 
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
		return  " Fruta [nombre = "  + nombre +  " , extensión = "  + extensión +  " , tiempoCosecha = "  + tiempoCosecha
				+  " , cantCosechaxtiempo = "  + cantCosechaxtiempo +  " , costoPromedio = "  + costoPromedio
				+  " , precioVentaProm = "  + precioVentaProm +  " , periodo = "  + periodo +  " , cantEstimada = "  + cantEstimada
				+   " ] " ;
	}

}