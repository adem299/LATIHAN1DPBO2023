import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa(); // objek class Mahasiswa untuk menyimpan data mahasiswa.
        Admin adm = new Admin(); // objek class admin untuk memproses / mengelolanya.

        // Input data berdasarkan masukan user
        Scanner sc = new Scanner(System.in);
        int opsi = 0;
        do{
                    /* Menu */
            System.out.println("========+++ MENU +++========");
            System.out.println("|| 1. Tambahkan mahasiswa ||");
            System.out.println("|| 2. Update mahasiswa    ||");
            System.out.println("|| 3. Hapus mahasiswa     ||");
            System.out.println("|| 4. Tampilkan mahasiswa ||");
            System.out.println("|| 0. Keluar              ||");
            System.out.println("============================");
            System.out.print("Masukan pilihan: ");
            
            opsi = sc.nextInt();
            sc.nextLine(); // hamdle nextInt() karena tidak auto new line
            System.out.println();

            switch(opsi) {
                case 1:
                    // add
                    System.out.println("Masukan Data Mahasiswa baru: ");
                    String name="", NIM="", prodi="", fakultas= ""; // handle null
                    try {
                        System.out.print("Masukan nama: ");
                        name = sc.nextLine();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                    try {
                        System.out.print("Masukan NIM: ");
                        NIM = sc.nextLine();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                    try {
                        System.out.print("Masukan prodi: ");
                        prodi = sc.nextLine();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                    try {
                        System.out.print("Masukan fakultas: ");
                        fakultas = sc.nextLine();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    mhs = new Mahasiswa(name, NIM, prodi, fakultas);
                    adm.tambah(mhs);
                    System.out.println();
                    break;

                case 2:
                    // // update
                    try {
                        System.out.print("Masukkan NIM mahasiswa yang akan diubah: ");
                        String nimMhs = sc.nextLine();
                        adm.update(nimMhs);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                    break;
                case 3:
                    // delete
                    try {
                        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                        String nimMhs = sc.nextLine();
                        adm.hapus(nimMhs);
                        System.out.println();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    break;
                case 4:
                    // Read
                    adm.tampil();
                    break;
                
                case 0:
                // close program
                    System.out.println("Terima kasih, sampai jumpa lagi...");
                    break;

                default:
                    System.out.println("Tolong masukan pilihan yang sesuai!");
                    break;
            }
        } 
        while(opsi != 0);
    }
}
