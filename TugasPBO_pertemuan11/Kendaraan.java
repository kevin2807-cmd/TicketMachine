/**
 * Write a description of class Kendaraan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Kendaraan
{
    // instance variables - replace the example below with your own
    protected String merek;
    protected String model;
    protected int tahunProduksi;

    /**
     * Constructor for objects of class Kendaraan
     */
    public Kendaraan(String merek, String model, int tahunProduksi)
    {
        // initialise instance variables
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }
    
    public abstract String info();
}
