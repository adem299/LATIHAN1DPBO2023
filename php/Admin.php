<?php
class Admin {
    private $listMhs;

    public function __construct() {
        $this->listMhs = array();
    }

    // method menambahkan mahasiswa ke list
    public function tambah($mhs) {
        array_push($this->listMhs, $mhs);
    }

    // method mengubah mahasiswa berdasarkan nim
    public function update($newName, $nim, $newProdi, $newFakultas, $newFoto) {

        foreach ($this->listMhs as $value) {
            // jika masukan nim ada dalam listMhs
            if ($value->getNIM() == $nim) {
                
                // ubah data mahasiswa sebelumnya
                $value->setName($newName);
                $value->setProdi($newProdi);
                $value->setFakultas($newFakultas);
                $value->setFoto($newFoto);
                
                // tampilkan pemberitahuan data berdasarkan nim yang diubah
                echo "Data dengan NIM ". $value->getNIM() ." telah diubah:\n";
            }
        }
    }

    // method menghapus mahasiswa berdasarkan nim
    public function hapus($nim) {
        foreach ($this->listMhs as $key => $value) {
            // jika masukan nim ada dalam listMhs
            if ($value->getNIM() == $nim) {
                // hapus data mahasiswa tersebut dari list
                echo "Data dengan NIM ". $value->getNIM() ." berhasil dihapus:\n";
                unset($this->listMhs[$key]);
            }
        }
    }

    // method menampilkan data mahasiswa
    function tampil() {
        // menampilkan tabel
        echo "<table border='1'>
            <tr>
                <th>No</th>
                <th>Nama</th>
                <th>NIM</th>
                <th>Prodi</th>
                <th>Fakultas</th>
                <th>Foto</th>
            </tr>";
        
        // menampilkan data mahasiswa pada tabel
        $i = 1;
        foreach ($this->listMhs as $mhs) {
            echo "<tr>
                <td>".$i++ . "</td>
                <td>".$mhs->getName()."</td>
                <td>".$mhs->getNIM()."</td>
                <td>".$mhs->getProdi()."</td>
                <td>".$mhs->getFakultas()."</td>
                <td> <img src='".$mhs->getFoto()."' width='100'></td>
            </tr>";
        }
        
        echo "</table>";
    }

    // method destructor
    function __destruct(){}

}
?>