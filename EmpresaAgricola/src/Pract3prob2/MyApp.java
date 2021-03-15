package Pract3prob2;
*********************************************
importar  Pract3prob2.Fruta ;
public  class  MyApp {
	static  void  run () {
		Fruta f =  nueva  Fruta ( " manzana " , 2546 , " corea " , 1 , 2500 , 40000 );
		Sistema . fuera . println (f);
		f . agregarPeriodo ( " 5/02/2021 " , 4f );
		f . agregarPeriodo ( " 25/01/2021 " , 1f );
		f . agregarPeriodo ( " 27/08/2020 " , 4.4f );
		Sistema . fuera . println (f);
		Sistema . fuera . println (f . eliminarPeriodo ( 1 ));
		Sistema . fuera . println (f);
		
		Sistema . fuera . println ( " Costo por periodo: $ " + f . costoPeriodo ( 0 ));
		Sistema . fuera . println ( " Ganancias por periodo: $ " + f . ganancia ( 0 ));
	}
	public  static  void  main ( String [] args ) {
		
		correr();
		
		
	}
}