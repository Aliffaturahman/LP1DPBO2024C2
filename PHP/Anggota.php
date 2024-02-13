<!-- 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
    telah dispesifikasikan. Aamiin.
-->

<!-- ----- Latihan PHP ----- -->

<?php
class Anggota
{
    // Membuat atribut Private dari kelas Anggota
    private $id = '';
    private $nama = '';
    private $bidang = '';
    private $partai = '';
    private $image;

    # Constructor dengan inisialisasi default
    public function __construct($id = '', $nama = '', $bidang = '', $partai = '', $image)
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->image = $image;
    }

    // Metode Setter and Getter untuk atribut private

    # Setter ID
    public function set_id($idAnggota)
    {
        $this->id = $idAnggota;
    }

    # Getter ID
    public function get_id()
    {
        return $this->id;
    }

    # Setter Nama
    public function set_nama($namaAnggota)
    {
        $this->nama = $namaAnggota;
    }

    # Getter Nama
    public function get_nama()
    {
        return $this->nama;
    }

    # Setter Bidang
    public function set_bidang($bidang)
    {
        $this->bidang = $bidang;
    }

    # Getter Bidang
    public function get_bidang()
    {
        return $this->bidang;
    }

    # Setter Partai
    public function set_partai($partai)
    {
        $this->partai = $partai;
    }

    # Getter Partai
    public function get_partai()
    {
        return $this->partai;
    }

    # Setter Image
    public function set_image($image)
    {
        $this->image = $image;
    }

    # Getter Image
    public function get_image()
    {
        return $this->image;
    }
}