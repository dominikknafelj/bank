package bank;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
public class Konto {
    private long kontostand;
    private long nummer;
    private Kunde inhaber = null;
    private Bank bank = null;
    
    /**
     * erzeugt eine Konto mit entsprechender Kontonummer, Bank und Kunden
     * @param ktoNummer - die Kontonummer
     * @param b - die Bank
     * @param k - der Kunde
     */
    public Konto(long ktoNummer, Bank b, Kunde k){
        this.nummer = ktoNummer;
        this.bank = b;
        this.inhaber = k;
        this.kontostand = 0;
    }
    
    /**
     * reduziert den Kontostand um den entsprechenden centwert
     * @param cent - der centwert
     */
    public void auszahlen(long cent)
    {
        this.kontostand-=cent;
    }
    
    /**
     * erhoeht den Kontostand um den entsprechenden centwert
     * @param cent - der centwert
     */
    public void einzahlen(long cent)
    {
        this.kontostand+=cent;
    }
    
    /**
     * gibt den Banknamen der assoziierten Bank zurueck
     * @return den Banknamen
     */
    public String liefereBankname(){
        return this.bank.liefereName();
    }
    /**
     * gibt die BLZ der assoziierten Bank zuruek
     * @return - die BLZ
     */
    public long liefereBLZ(){
        return this.bank.liefereBLZ();
    }
    /**
     * gibt den Namen den Inhabers zurueck
     * @return der Inhabername
     */
    public String liefereInhabername(){
        return this.inhaber.liefereName();
    }
    /**
     * gibt die Kontonummer zurueck
     * @return die Kontonummer
     */
    long liefereKontonummer(){
        return this.nummer;
    }
    /**
     * gibt den Kontostand zurueck
     * @return der Kontostand
     */
    long liefereKontostand(){
        return this.kontostand;
    }
}
