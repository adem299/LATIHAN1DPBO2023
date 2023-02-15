<?php
class Mahasiswa {
    // attribute
    private $name;
    private $nim;
    private $prodi;
    private $fakultas;
    private $foto;

    // Constructor
    public function __construct($name = '', $nim = '', $prodi = '', $fakultas = '', $foto="") {
        $this->name = $name;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->foto = $foto;
    }

    // getter and setter
    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getNIM() {
        return $this->nim;
    }

    public function setNIM($nim) {
        $this->nim = $nim;
    }

    public function getProdi() {
        return $this->prodi;
    }

    public function setProdi($prodi) {
        $this->prodi = $prodi;
    }

    public function getFakultas() {
        return $this->fakultas;
    }

    public function setFakultas($fakultas) {
        $this->fakultas = $fakultas;
    }

    public function getFoto() {
        return $this->foto;
    }

    public function setFoto($foto="") {
        $this->foto = $foto;
    }

    // destructor
    function __destruct(){}
}
?>