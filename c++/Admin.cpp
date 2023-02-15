class Admin {
private:
    list<Mahasiswa> listMhs;

public:
    // method pencarian mahasiswa
    bool find(string nim) {
        list<Mahasiswa>::iterator it;
        for (it = listMhs.begin(); it != listMhs.end(); ++it) {
            // jika input nim ada dalam listMhs
            if (it->getNIM() == nim) {
                return true;
            }
        }
        return false;
    }
    // method menambahkan mahasiswa ke list, (cek NIM apakah tersedia atau tidak sebelumnya)
    void tambah(Mahasiswa mhs) {
        if(find(mhs.getNIM())) {
            cout << "[ERROR] NIM telah tersedia." << endl;
        } else {
            listMhs.push_back(mhs);
            cout << "[SUCCESS] Mahasiswa berhasil ditambahkan." << endl;
        }
    }

    // method untuk mengubah mahasiswa berdasarkan nim
    void update(string nim) {
        bool found = false;
        list<Mahasiswa>::iterator it;

        for (it = listMhs.begin(); it != listMhs.end(); ++it) {
            // jika input nim ada dalam listMhs
            if (it->getNIM() == nim) {
                // tampilkan data sesuai NIM yang dimasukan
                cout << "Data ditemukan:\n";
                cout << "Nama    : " << it->getName() << endl;
                cout << "NIM     : " << it->getNIM() << endl;
                cout << "Prodi   : " << it->getProdi() << endl;
                cout << "Fakultas: " << it->getFakultas() << endl;
                cout << endl;

                // Input data mahasiswa baru
                cout << "Masukan data baru:\n";
                string newName, newNIM, newProdi, newFakultas;
                cout << "Nama: ";
                cin >> newName;
                cout << "NIM: ";
                cin >> newNIM;
                cout << "Prodi: ";
                cin >> newProdi;
                cout << "Fakultas: ";
                cin >> newFakultas;

                found = true;
                // update data sebelumnya
                it->setName(newName);
                it->setNIM(newNIM);
                it->setProdi(newProdi);
                it->setFakultas(newFakultas);
                cout << "[SUCCESS] Data mahasiswa berhasil diubah." << endl;
                break;
            }
        }

        if (!found) {
            cout << "[ERROR] Data tidak ditemukan." << endl;
        }
    }

    // method untuk menghapus mahasiswa berdasarkan nim
    void hapus(string nim) {
        bool found = false;
        list<Mahasiswa>::iterator it;
        for (it = listMhs.begin(); it != listMhs.end(); ++it) {
            // jika masukan nim ada dalam listMhs
            if (it->getNIM() == nim) {
                // hapus data mahasiswa dari list
                it = listMhs.erase(it);
                found = true;
                cout << "[SUCCESS] Data mahasiswa dengan NIM " << nim << " berhasil dihapus." << endl;
                break;
            }
        }

        if (!found) {
            cout << "[ERROR] Data mahasiswa dengan NIM " << nim << " tidak ditemukan." << endl;
        }
    }

    // method untuk menampilkan semua data mahasiswa
    void tampil() {
        int x = 1;
        list<Mahasiswa>::iterator it;
        if(size(listMhs) > 0) {
            for (it = listMhs.begin(); it != listMhs.end(); ++it) {
                cout << "==Xx Mahasiswa " << x++ << " xX==" << endl;
                cout << "Nama    : " << it->getName() << endl;
                cout << "NIM     : " << it->getNIM() << endl;
                cout << "Prodi   : " << it->getProdi() << endl;
                cout << "Fakultas: " << it->getFakultas() << endl;
            }
        } else {
            cout << "Tidak ada list mahasiswa." << endl;
        }
    }

    // Destructor
    ~Admin() {}

};