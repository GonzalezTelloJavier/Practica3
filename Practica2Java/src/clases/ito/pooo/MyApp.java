package clases.ito.pooo;

import java.time.LocalDate;
import clases.ito.poo.CuentaBancaria;

public class MyApp {

	
	static void run() {
		System.out.println(new CuentaBancaria(89393L, "MARIO BAUTISTA", 15000, LocalDate.of(2021, 2, 26)));

	}

	public static void main(String[] args) {
		run();
	}
}
