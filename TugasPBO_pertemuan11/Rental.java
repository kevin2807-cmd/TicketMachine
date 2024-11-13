import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Rental here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rental
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        List<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(new Mobil("Toyota", "Fortuner", 2024, 4));
        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2022, 4));
        daftarKendaraan.add(new Mobil("Honda", "civic", 2024, 4)); 
        daftarKendaraan.add(new Motor("Honda", "Supra", 2024, 2));
        daftarKendaraan.add(new Motor("Yamaha", "Nmax", 2021, 2)); 
        daftarKendaraan.add(new Sepeda("Yamaha", "Helios", 2024, "BMX")); 
        
        System.out.println("=======================Daftar Kendaraan=======================");
        for(Kendaraan kendaraan: daftarKendaraan){
            System.out.println(kendaraan.info());
        }
        System.out.println();
        
        List<String> daftarPenyewa = new ArrayList<>();
        daftarPenyewa.add("Nama penyewa : Adi, Kendaraan yang disewa : Sepeda Yamaha Helios");
        daftarPenyewa.add("Nama penyewa : Ida, Kendaraan yang disewa : Motor Yamaha Nmax");
        daftarPenyewa.add("Nama penyewa : Doni, Kendaraan yang disewa : Mobil Toyota Fortuner");
        
        System.out.println("=======================Daftar penyewa beserta kenderaan yang disewa=======================");
        for(String penyewa : daftarPenyewa){
            System.out.println(penyewa);
        }
    }

}
