from Mahasiswa import Mahasiswa
from Admin import Admin


mhs = Mahasiswa()
adm = Admin()

while True:
    print("========+++ MENU +++========")
    print("|| 1. Tambahkan mahasiswa ||")
    print("|| 2. Update mahasiswa    ||")
    print("|| 3. Hapus mahasiswa     ||")
    print("|| 4. Tampilkan mahasiswa ||")
    print("|| 0. Keluar              ||")
    print("============================")

    opsi = int(input("Masukan pilihan: "))
    print("")

    #  Kondisi sesuai input user
    if opsi == 1:
        tempName = input("Masukan nama: ")
        tempNim = input("Masukan NIM: ")
        tempProdi = input("Masukan prodi: ")
        tempFakultas = input("Masukan fakultas: ")
        mhs = Mahasiswa(tempName, tempNim, tempProdi, tempFakultas)
        adm.tambah(mhs)
    elif opsi == 2:
        nim = input("Masukan NIM mahasiswa yang akan di ubah: ")
        adm.update(nim)
        print("")
    elif opsi == 3:
        nim = input("Masukan NIM: ")
        print("")
        adm.hapus(nim)
    elif opsi == 4:
        adm.tampil()
        print("")
    elif opsi == 0:
        print("Terima kasih, sampai jumpa lagi...")
        break
    else:
        print("Tolong masukan pilihan yang sesuai!\n")
        break
