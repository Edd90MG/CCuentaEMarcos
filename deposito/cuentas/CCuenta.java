
package cuentas;

/**
 * Esta clase es un ejemplo de cuenta bancaria.
 * @author Edu
 * @version 1.0
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

	/**
	 * Este metodo crea instancias del objeto CCuenta con los valores de atributos por defecto.
	 */    
    public CCuenta()
    {

    }

    /**
	 * Este metodo crea instancias del objeto CCuenta asignando a los atributos los parametros que recibe.
	 * @param nom es el nombre del titular de la cuenta
	 * @param cue es el nombre de la cuenta
	 * @param sal es el saldo actual de la cuenta
	 * @param tipo es el tipo de interes de la cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
	 * Devuelve informacion sobre el saldo de la cuenta
	 * @return saldo actual de la cuenta
	 */
    public double estado()
    {
        return getSaldo();
    }

    /**
	 * Permite sumar un valor positivo al saldo actual de la cuenta
	 * @param cantidad es el valor a ingresar
	 * @throws Exception Si la cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
	 * Permite restar un valor positivo y mayor al saldo actual de la cuenta
	 * @param cantidad es el valor a retirar
	 * @throws Exception Si la cantidad es negativa o inferior al saldo actual
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
