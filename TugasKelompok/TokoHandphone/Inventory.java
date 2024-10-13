import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable
{
    private Map<String, Integer> itemMap = new HashMap<>();
    private int totalItem = 0;
    
    @Override
    public void tambahItem (String nama_item, int jumlah){
        if (itemMap.containsKey(nama_item)) {
            itemMap.put(nama_item, itemMap.get(nama_item) + jumlah);
        }
        else {
            itemMap.put(nama_item, jumlah);
        }
        
        totalItem += jumlah;
        System.out.println(nama_item + " berhasil ditambahkan dengan jumlah " + jumlah);
    }
    
    @Override 
    public void hapusItem (String nama_item){
        if(itemMap.containsKey(nama_item))
        {
            int temp_total = itemMap.get(nama_item);
            totalItem -= temp_total;
            itemMap.remove(nama_item);
            System.out.println(nama_item + " Berhasil di hapus ");
        }
        else{
            System.out.println(nama_item + " Tidak ada di dalam Inventory ");
        }
    }
    
    @Override
    public void tampilkanItem (){
        System.out.println("Daftar HandPhone");
        if(itemMap.isEmpty())
        {
            System.out.println("Tidak ada item di dalam Inventory");
        }
        else
        {
            itemMap.forEach((nama, jumlah) -> 
            {
               System.out.println(nama + "\t\t\t" + jumlah); 
            });
        }
    }
    
    @Override
    public boolean cekItem(String nama_item) {
        if(itemMap.containsKey(nama_item)){
            return true;
        }
        return false;
    }
}
