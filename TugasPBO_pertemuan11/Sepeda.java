
/**
 * Write a description of class Sepeda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sepeda extends Kendaraan
{
    // instance variables - replace the example below with your own
    private String jenis;

    /**
     * Constructor for objects of class Sepeda
     */
    public Sepeda(String merek, String model, int tahunProduksi, String jenis)
    {
        // initialise instance variables
        super(merek, model, tahunProduksi);
        this.jenis = jenis;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    @Override
    public String info(){
        return "Sepeda" + merek + " dengan model " + model + ", tahun produksi " + tahunProduksi + ", jenis " + jenis;
    }
}
