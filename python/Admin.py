class Admin():
    def __init__(self):
        self.listMhs = []
    
    # method untuk mencari NIM spesifik
    def find(self, nim):
        for mhs in self.listMhs:
            if nim in mhs.getNIM():
                return True
            else:
                return False

    # method untuk menambahkan mahasiswa ke arraylist, (cek NIM apakah tersedia atau tidak sebelumnya)
    def tambah(self, mhs):
        if self.find(mhs.getNIM()):
            print("[ERROR] NIM telah tersedia.\n")
        else:
            self.listMhs.append(mhs)
            print("[SUCCESS] Mahasiswa berhasil ditambahkan.\n");

    # method untuk mengubah mahasiswa berdasarkan nim
    def update(self, nim):
        for mhs in self.listMhs:
            # jika masukan nim ada dalam listMhs
            if mhs.getNIM() == nim:
                # tampilkan data sesuai NIM yang dimasukan
                print("Data ditemukan:")
                print("Nama    : ", mhs.getName())
                print("NIM     : ", mhs.getNIM())
                print("Prodi   : ", mhs.getProdi())
                print("Fakultas: ", mhs.getFakultas())
                print("")

                # Input data mahasiswa baru
                print("Masukan data baru: ")
                newName = input("Nama: ")
                newNIM = input("NIM: ")
                newProdi = input("Prodi: ")
                newFakultas = input("Fakultas: ")

                # ubah data mahasiswa sebelumnya
                mhs.setName(newName)
                mhs.setNIM(newNIM)
                mhs.setProdi(newProdi)
                mhs.setFakultas(newFakultas)
                print("[SUCCESS] Data mahasiswa berhasil dibuah.")
            else:
                # jika nim tidak ada dalam listMhs
                print("[ERROR] Data tidak ditemukan.\n")

    # method untuk menghapus data mahasiswa berdasarkan NIM
    def hapus(self, NIM):
        # cari index mahasiswa dengan NIM yang dicari
        idxMhs = -1
        for i, mhs in enumerate(self.listMhs):
            if mhs.getNIM() == NIM:
                # ambil index data tersebut
                idxMhs = i
                break

        # hapus mahasiswa jika ditemukan, berdasarkan index
        if idxMhs != -1:
            del self.listMhs[idxMhs]
            print("[SUCCESS] Data mahasiswa dengan NIM " + NIM + " berhasil dihapus.\n")
        else:
            print("[ERROR] Data mahasiswa dengan NIM " + NIM + " tidak ditemukan.\n")

    def tampil(self):
        if len(self.listMhs) == 0:
            print("Tidak ada list mahasiswa!")
        else:
            for num, mhs in enumerate(self.listMhs):
                # foreach loop
                print("==Xx Mahasiswa " + str(num+1) + " xX==")
                print("Nama     :", mhs.getName())
                print("NIM      :", mhs.getNIM())
                print("Prodi    :", mhs.getProdi())
                print("Fakultas :", mhs.getFakultas())