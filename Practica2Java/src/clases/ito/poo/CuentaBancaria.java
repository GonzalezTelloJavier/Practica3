package clases.ito.poo;

import java.time.LocalDate;

public class CuentaBancaria {

	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura) {
		super();
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
	}

	private long numCuenta = 0L;

	private String nomCliente = "";

	private float saldo = 0F;

	private LocalDate fechaApertura = null;

	private LocalDate fechaActualizacion = null;

	public CuentaBancaria() {

		super();

	}

	public boolean deposito(float cantidad) {

		boolean deposito = false;
		return deposito;

	}

	public boolean retiro(float cantidad) {

		boolean retiro = false;
		return retiro;

	}

	public long getNumCuenta() {
		return this.numCuenta;
	}

	public void setNumCuenta(long newNumCuenta) {
		this.numCuenta = newNumCuenta;
	}

	public String getNomCliente() {
		return this.nomCliente;
	}

	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float newSaldo) {
		this.saldo = newSaldo;
	}

	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(LocalDate newFechaApertura) {
		this.fechaApertura = newFechaApertura;
	}

	public LocalDate getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate newFechaActualizacion) {
		this.fechaActualizacion = newFechaActualizacion;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacion=" + fechaActualizacion + "]";
	}

}
