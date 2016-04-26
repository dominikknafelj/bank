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
public class Bank {

	private long blz;

	private String name;

	/**
	 * erzeugt eine neue Bank mit gegebenen Namen und BLZ
	 * @param bankname der Name der Bank
	 * @param bankleitzahl die BLZ
	 */
	public Bank(String bankname, long bankleitzahl) {
		name = bankname;
		blz = bankleitzahl;
	}

	/**
	 * liefert die Bankleitzahl der Bank
	 * @return die BLZ
	 */
	public long liefereBLZ() {
		return blz;
	}

	/**
	 * liefert den Namen der Bank
	 * @return der Name der Bank
	 */
	public String liefereName() {
		return name;
	}

}

