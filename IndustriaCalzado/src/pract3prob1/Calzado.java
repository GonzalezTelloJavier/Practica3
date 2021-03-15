package pract3prob1;

import  java.util.Arrays ;

public  class  Calzado {

	public  Calzado ( int  clave , String  material , String  troquel , int  cantidadxDia , String [] colores ) {
		super ();
		esto . clave = clave;
		esto . material = material;
		esto . troquel = troquel;
		esto . cantidadxDia = cantidadxDia;
		esto . colores = colores;
	}


	 clave int privada ;
	 material de cuerda privado ;
	privada  Cadena troquel;
	privado  int cantidadxDia;
	Private  String [] colores =  null ; {
		
	
	}


	public  int  getClave () {
		clave de retorno ;
	}


	public  void  setClave ( int  clave ) {
		esto . clave = clave;
	}


	public  String  getMaterial () {
		material de devolución ;
	}


	public  void  setMaterial ( String  material ) {
		esto . material = material;
	}


	public  String  getTroquel () {
		retorno troquel;
	}


	public  void  setTroquel ( String  troquel ) {
		esto .troquel = troquel;
	}


	public  int  getCantidadxDia () {
		return cantidadxDia;
	}


	public  void  setCantidadxDia ( int  cantidadxDia ) {
		esto . cantidadxDia = cantidadxDia;
	}


	 cadena pública [] getColores () {
		colores de retorno ;
	}


	public  void  setColores ( String [] colores ) {
		esto . colores = colores;
	}


	
	public  String  toString () {
		return  " Calzado [clave = "  + clave +  " , material = "  + material +  " , troquel = "  + troquel +  " , cantidadxDia = "
				+ cantidadxDia +  " , colores = "  +  Arrays . toString (colores) +  " ] " ;
	}


	 costoPorLote public float  ( costoXUnidad doble ) { 
		return ( float ) ( esto . cantidadxDia * costoXUnidad);
		
	}
}