<?php

require_once 'Admin.php';
require_once 'Mahasiswa.php';

$admin = new Admin();

// tambah mahasiswa
$mhs1 = new Mahasiswa("Lisa", "1234", "Astronomi", "MIPA", "img/lis.jpg");
$mhs2 = new Mahasiswa("Steph", "3030", "Bahasa Sunda", "Sastra dan Bahasa", "img/curr.jpg");

$admin->tambah($mhs1);
$admin->tambah($mhs2);
// tampil mahasiswa
$admin->tampil();

$html = "<br>";
echo $html;
// ubah mahasiswa
$admin->update("Eiko", "3030", "Kimia", "MIPA", "img/eikk.jpg");
$admin->tampil();

echo $html;
// hapus mahasiswa
$admin->hapus("3030");
$admin->tampil();

?>