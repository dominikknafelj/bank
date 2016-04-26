/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
public class Kunde {

	private String name;

	/**
	 * erzeugt einen neuen Kunden mit dem entsprechenden Namen
	 * @param n der Name des Kunden
	 */
	public Kunde(String n) {
		name = n;
	}

	/**
	 * liefert den Namen des Kunden
	 * @return der Name des Kunden
	 */
	public String liefereName() {
		return name;
	}
}
