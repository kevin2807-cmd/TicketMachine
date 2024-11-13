
/**
 * Write a description of class Mobil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobil extends Kendaraan
{
    // instance variables - replace the example below with your own
    private int jumlahRoda;

    /**
     * Constructor for objects of class Mobil
     */
    public Mobil(String merek, String model, int tahunProduksi, int jumlahRoda)
    {
        // initialise instance variables
        super(merek, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    @Override
    public String info(){
       return "Mobil " + merek + " dengan model " + model + " ,tahun produksi " + tahunProduksi + ",jumlah roda " + jumlahRoda; 
    }
}
