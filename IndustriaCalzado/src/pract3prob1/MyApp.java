package pract3prob1;

public class MyApp {
	
	
     static  void  run () {
		
		Calzado calzadoX = ( new  Calzado ( 66666 , " cuero " , " patito " , 50 , new  String [] { " rojo " , " negro " , " cafe " , " morado " }));
		flotar costoTotal = calzadoX . costoPorLote ( 10.0 );
		
		Sistema . fuera . println (calzadoX);
		Sistema . fuera . println ( " El costo total por lote es: " + costoTotal);
	}
	
		


	public  static  void  main ( String [] args ) {
		correr();
	} 


}
