/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
    telah dispesifikasikan. Aamiin.
*/

// ----- Latihan Java ----- //

public class Anggota {

    // Membuat Atribut Private :
    
    // ID Anggota
    private int id;
    
    // Nama Anggota
    private String nama;

    // Bidang Anggota
    private String bidang;

    // Partai Anggota
    private String partai;

    Anggota(){} // konstruktor Anggota

    Anggota(int id, String nama, String bidang, String partai) {
        // konstruktor langsung isi attribut
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }

    // Metode Setter and Getter untuk atribut private
    
    // Setter ID
    public void set_id(int idAnggota) {
        this.id = idAnggota;
    }

    // Getter ID
    public int get_id() {
        return id;
    }

    // Setter Nama
    public void set_nama(String namaAnggota) {
        this.nama = namaAnggota;
    }

    // Getter Nama
    public String get_nama() {
        return nama;
    }

    // Setter bidang
    public void set_bidang(String programStudi) {
        this.bidang = programStudi;
    }

    // Getter bidang
    public String get_bidang() {
        return bidang;
    }
    
    // Setter partai
    public void set_partai(String partai) {
        this.partai = partai;
    }

    // Getter partai
    public String get_partai() {
        return this.partai;
    }
}