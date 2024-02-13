/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
    telah dispesifikasikan. Aamiin.
*/

// ----- Latihan Java ----- //

public class Tabel {
    private int baris;
    // Banyaknya baris
    private int kolom;
    // Banyaknya kolom

    Tabel() {} // konstruktor Tabel
    Tabel(int baris, int kolom) {
        // konstruktor langsung isi attribut
        this.baris = baris;
        this.kolom = kolom;
    }

    // Metode Setter and Getter untuk atribut private
    // Setter ID
    public void set_baris(int baris) {
        this.baris = baris;
    }

    // Get Baris
    public int get_baris() {
        return baris;
    }

    // Set Kolom
    public void set_kolom(int kolom) {
        this.kolom = kolom;
    }

    // Get Kolom
    public int get_kolom() {
        return kolom;
    }

    // Membuat Metode untuk buat tabel
    public void buatBaris(String[] isi, int batas, int idx, int id, int name, int bidang, int partai) {
        int i = 0, j = 0;

        // Jika index = 0 (membuat kerangka tabel atas)
        if(idx == 0){
            System.out.print("\n+");
            // Membuat perulangan sebanyak 5x (banyak jumlah elemen dalam 1 baris)
            for(i = 0; i < isi.length; i++) {
                // Jika i = 0
                if(i == 0){
                    // Membuat perulangan sebanyak 4x("No" + 2 spasi)
                    for(j = 0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                // Jika i = 1
                if(i == 1){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanjang pada baris ID + 2 spasi
                    for(j = 0; j < id + 2; j++) {
                        System.out.print("-");
                    }
                }
                // Jika i = 2
                if(i == 2){
                System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanjang pada baris Nama + 2 spasi
                    for(j = 0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                // Jika i = 3
                if(i == 3){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanajgn pada baris Bidang + 2 spasi
                    for(j = 0; j < bidang + 2; j++) {
                        System.out.print("-");
                    }
                }
                // Jika i = 4
                if(i == 4){
                    System.out.print("+");
                    // Membuat perulangan sebanyak kata terpanajgn pada Partai + 2 spasi
                    for(j = 0; j < partai + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("");
        }

        // Membuat baris untuk jdul
        if (idx == 0){
            System.out.print("|No  ");
            System.out.print("|ID");
            for (j = 0 ; j < id ; j++){           // Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" ");          // meminta output berupa spasi 
            }
            System.out.print("|Nama");
            for (j = 0 ; j < name - 2; j++){      // Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" ");          // meminta output berupa spasi 
            }
            System.out.print("|Bidang");
            for (j = 0 ; j < bidang - 4; j++){    // Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" ");          // meminta output berupa spasi 
            }
            System.out.print("|Partai");
            for (j = 0 ; j < partai - 4; j++){    // Membuat perulangan sesuai dengan kata terpanjang
                System.out.print(" ");          // meminta output berupa spasi 
            }
            System.out.print("|");     
            System.out.println("");
        }

        // Jika index = 0 (membuat kerangka tabel bawah judul)
        if(idx == 0){
            System.out.print("+");
            for(i = 0; i < isi.length; i++) {
                if(i == 0){
                    for(j = 0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 1){
                    System.out.print("+");
                    for(j = 0; j < id + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 2){
                System.out.print("+");
                    for(j = 0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 3){
                    System.out.print("+");
                    for(j = 0; j < bidang + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 4){
                    System.out.print("+");
                    for(j = 0; j < partai + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("");
        }

        // Buat baris isi
        for(i = 0; i < isi.length; i++) {
            if(i == 0){
                System.out.print("|" + isi[i] + "   ");
            }
            else if(i == 1){
                System.out.print("|" + isi[i]);
                for (j = 0 ; j < id - isi[i].length() + 2 ; j++){       // Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" ");                            // meminta output berupa spasi 
                }
            }
            else if(i == 2){
                System.out.print("|" + isi[i]);
                for (j = 0 ; j < name - isi[i].length() + 2 ; j++){     // Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" ");                            // meminta output berupa spasi 
                }
            }
            else if(i == 3){
                System.out.print("|" + isi[i]);
                for (j = 0 ; j < bidang - isi[i].length() + 2 ; j++){   // Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" ");                            // meminta output berupa spasi 
                }
            }
            else if(i == 4){
                System.out.print("|" + isi[i]);
                for (j = 0 ; j < partai - isi[i].length() + 2 ; j++){   // Membuat perulangan sesuai dengan kata terpanjang
                    System.out.print(" ");                            // meminta output berupa spasi 
                }
            }
            if(i == isi.length - 1){
                System.out.print("|");
            }
        }
        System.out.println("");

        // Membuat kerangka tabel pada baris terakhir
        if(idx == batas - 1) {
            System.out.print("+");
            for(i = 0; i < isi.length; i++) {
                if(i == 0){
                    for(j = 0; j < 4; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 1){
                    System.out.print("+");
                    for(j = 0; j < id + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 2){
                    System.out.print("+");
                    for(j = 0; j < name + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 3){
                    System.out.print("+");
                    for(j = 0; j < bidang + 2; j++) {
                        System.out.print("-");
                    }
                }
                if(i == 4){
                    System.out.print("+");
                    for(j = 0; j < partai + 2; j++) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("+");
            System.out.println("\n");
        }
    }
}