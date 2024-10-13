import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("Daftar Pilihan : ");
            System.out.println("1. Tambahkan Handphone ");
            System.out.println("2. Hapus Handphone ");
            System.out.println("3. Tampilkan HandPhone ");
            System.out.println("4. Exit ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama Handphone : ");
                    String nama_item_tambah = scanner.nextLine();
                    System.out.println("Masukkan jumlah Handphone : ");
                    int jumlah_item = scanner.nextInt();
                    scanner.nextLine();
                    inventory.tambahItem (nama_item_tambah, jumlah_item);
                    break;
                    
                case 2:
                    System.out.println("Masukkan nama HandPhone yang ingin dihapus");
                    String nama_item_hapus = scanner.nextLine();
                    if(inventory.cekItem(nama_item_hapus)){
                        System.out.println("Apakah anda ingin menghapus Handphone " + nama_item_hapus + " (y/n) " );
                        char validasi = scanner.next().charAt(0);
                        if(validasi == 'y' || validasi == 'Y'){
                            inventory.hapusItem(nama_item_hapus);
                        } else {
                            break;
                        }
                    }
                    else{
                        System.out.println("Handphone " + nama_item_hapus + " Tidak tersedia di Inventory");
                    }
                    break;
                
                case 3:
                    inventory.tampilkanItem();
                    break;
                    
                case 4:
                    System.out.println("Terima Kasih!");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        while(pilihan != 4);
    }
}
