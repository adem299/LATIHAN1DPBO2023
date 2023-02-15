#include <iostream>
#include <string>
#include <list>
using namespace std;
#include "Mahasiswa.cpp"
#include "Admin.cpp"


int main() {

    Mahasiswa mhs;
    Admin adm;

    int opsi;
    bool running = true;

    while (running) {
        cout << "========+++ MENU +++========" << endl;
        cout << "|| 1. Tambahkan mahasiswa ||" << endl;
        cout << "|| 2. Update mahasiswa    ||" << endl;
        cout << "|| 3. Hapus mahasiswa     ||" << endl;
        cout << "|| 4. Tampilkan mahasiswa ||" << endl;
        cout << "|| 0. Keluar              ||" << endl;
        cout << "============================" << endl;

        cout << "Masukan pilihan: ";
        cin >> opsi;
        cout << endl;

        // Kondisi sesuai input user
        switch (opsi) {
            case 1: {
                // Create
                // tampung input data mahasiswa baru
                string tempName, tempNIM, tempProdi, tempFakultas;
                cout << "Masukan Data Mahasiswa baru: " << endl;
                cout << "Masukkan nama: ";
                cin.ignore();
                // cin >> tempName;
                getline(cin, tempName);
                cout << "Masukkan NIM: ";
                // cin >> tempNIM;
                getline(cin, tempNIM);
                cout << "Masukkan prodi: ";
                // cin >> tempProdi;
                getline(cin, tempProdi);
                cout << "Masukkan fakultas: ";
                getline(cin, tempFakultas);
                // cin >> tempFakultas;

                Mahasiswa mhs(tempName, tempNIM, tempProdi, tempFakultas);
                // Input data ke list
                adm.tambah(mhs);
                cout << endl;
                break;
            }
            case 2: {
                // update
                string nim;
                cout << "Masukkan NIM mahasiswa yang akan diubah: ";
                cin >> nim;

                adm.update(nim);
                cout << endl;
                break;
            }
            case 3: {
                // Delete
                string nim;
                cout << "Masukkan NIM mahasiswa yang akan dihapus: ";
                cin >> nim;

                adm.hapus(nim);
                break;
            }
            case 4: {
                // Read
                adm.tampil();
                cout << endl;
                break;
            }
            case 0: {
                // close program
                cout << "Terima kasih, sampai jumpa lagi.." << endl;
                running = false;
                break;
            }
            default: {
                cout << "Tolong masukan pilihan yang sesuai!" << endl;
                break;
            }
        }
    }

    return 0;
}
