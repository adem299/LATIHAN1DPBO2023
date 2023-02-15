import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private ArrayList <Mahasiswa> listMhs;

    public Admin() {
        listMhs = new ArrayList<>(); 
    }

    boolean find(String nim) {
        for (Mahasiswa mhs : listMhs) {
            if (mhs.getNIM().equals(nim)) {
                return true;
            }
        }
        return false;
    }

    // method untuk menambahkan mahasiswa ke arraylist, (cek NIM apakah tersedia atau tidak sebelumnya)
    public void tambah(Mahasiswa mhs) {
        if(find(mhs.getNIM())) {
            System.out.println("[ERROR] NIM telah tersedia.");
        } else {
            listMhs.add(mhs);
            System.out.println("[SUCCESS] Mahasiswa berhasil ditambahkan.");
        }
    }

    // method untuk mengubah mahasiswa berdasarkan nim 
    public void update(String nim) {
        Scanner sc = new Scanner(System.in);
        for (Mahasiswa mhs : listMhs) {
            // jika masukan nim ada dalam listMhs
            if (mhs.getNIM().equals(nim)) {
                // tampilkan data sesuai NIM yang dimasukan
                System.out.println("Data ditemukan:");
                System.out.println("Nama    : " + mhs.getName());
                System.out.println("NIM     : " + mhs.getNIM());
                System.out.println("Prodi   : " + mhs.getProdi());
                System.out.println("Fakultas: " + mhs.getFakultas());
                System.out.println();

                // Input data mahasiswa baru
                System.out.println("Masukan data baru: ");
                System.out.print("Nama: ");
                String newName = sc.nextLine();
                System.out.print("NIM: ");
                String newNIM = sc.nextLine();
                System.out.print("Prodi: ");
                String newProdi = sc.nextLine();
                System.out.print("Fakultas: ");
                String newFakultas = sc.nextLine();
                
                // ubah data sebelumnya
                mhs.setName(newName);
                mhs.setNIM(newNIM);
                mhs.setProdi(newProdi);
                mhs.setFakultas(newFakultas);

                System.out.println("[SUCCESS] Data mahasiswa berhasil diubah.");
                
                break;

            } else {
                // jika masukan nim tidak ada dalam listMhs
                System.out.println("[ERROR] Data tidak ditemukan.");
            }
        }
    }

    // method untuk menghapus data mahasiswa berdasarkan NIM
    public void hapus(String NIM) {
        // cari index mahasiswa dengan NIM yang dicari
        int idxMhs = -1;
        for (int i = 0; i < listMhs.size(); i++) {
            if (listMhs.get(i).getNIM().equals(NIM)) {
                // ambil index data tersebut
                idxMhs = i;
                break;
            }
        }

        // hapus mahasiswa jika ditemukan, berdasarkan index
        if (idxMhs != -1) {
            listMhs.remove(idxMhs);
            System.out.println("[SUCCESS] Data mahasiswa dengan NIM " + NIM + " berhasil dihapus.");
        } else {
            System.out.println("[ERROR] Data mahasiswa dengan NIM " + NIM + " tidak ditemukan.");
        }
    }

    public void tampil() {
        if(listMhs.isEmpty()) {
            System.out.println("Tidak ada list mahasiswa!");
            System.out.println();
        } else{
            for(Mahasiswa mhs : listMhs) { // foreach loop
                int num = listMhs.indexOf(mhs); // mengambil indek dari masing masing element list.
                System.out.println("==Xx Mahasiswa " + (num+1) + " xX==");
                System.out.println("Nama     : " + mhs.getName());
                System.out.println("NIM      : " + mhs.getNIM());
                System.out.println("Prodi    : " + mhs.getProdi());
                System.out.println("Fakultas : " + mhs.getFakultas());
                System.out.println();
            }
        }
    }
}