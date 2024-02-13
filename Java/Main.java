/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
    telah dispesifikasikan. Aamiin.
*/

// ----- Latihan Java ----- //

// Import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            ------------ Membuat Variabel ----------------
            - nomor = variabel untuk mengatur menu
            - namaAnggota,idAnggota, bidangAnggota, partaiAnggota = String untuk menyimpan nilai sementara dari masing2 nilai
            - display = variable utk mengatur jalannya program
            - idx = sebagai index nilai (indek update / delete)
            - max = sebagai batas inputan menu tambah
            - list = list yang berisi objek dari kelas Anggota
        */

        int nomor = 0;
        int idAnggota = 0;
        String namaAnggota, bidangAnggota, partaiAnggota;
        int display = 0;
        int idx = 0;
        int max = 0;
        ArrayList<Anggota> list = new ArrayList<>();      

        // Membuat scan
        Scanner scan = new Scanner(System.in);

        System.out.println("+--------------------------------------------+");
        System.out.println("|                                            |");
        System.out.println("+   Selamat Datang Di Program Bolip's CRUD   +");
        System.out.println("+    ( Create, Read, Update, and Delete )    +");
        System.out.println("|                                            |");
        System.out.println("+--------------------------------------------+");
        System.out.println("|            ~~~ Java Version ~~~            |");
        System.out.println("+--------------------------------------------+");

        // Program akan terus berjalan sampai display != 0
        while(display == 0){    
            try {
                // Tampilan untuk pilihan menu
                System.out.println("Silahkan Pilih Salah Satu Menu :");
                System.out.println("[1] Untuk Menambah Data Anggota");
                System.out.println("[2] Untuk Mengubah Data Anggota");
                System.out.println("[3] Untuk Menghapus Data Anggota");
                System.out.println("[4] Untuk Menampilkan Seluruh Data Anggota DPR");
                System.out.println("[5] Untuk Keluar\n");

                // Scan nomor pada menu
                System.out.print("Menu yang dipilih : ");
                nomor = scan.nextInt();

            } catch (Exception e) {
                // Jika input bukan integer
                System.out.println( "\nInput yang diberikan bukan integer!\n");
                continue;
            }
            // Buat longkap baris / biar sejajar
            scan.nextLine();

            // Jika pilih menu nomor 1           
            if (nomor == 1){
                try {
                    // Scan banyak anggota yang ingin di input
                    System.out.print("\nJumlah Anggota DPR yang Ingin Ditambahkan : ");
                    max = scan.nextInt();
                    scan.nextLine();

                    // Looping sebanyak max
                    for(int i = 0; i < max; i++){
                        // Mendata per-Anggota
                        System.out.println("-----------------------------------------");
                        System.out.println("Data Anggota ke - " + Integer.toString(i+1));

                        // Meminta scan id
                        System.out.print("Masukkan ID     : ");
                        idAnggota = scan.nextInt();
                        scan.nextLine();

                        // Meminta scan nama
                        System.out.print("Masukkan Nama   : ");
                        namaAnggota = scan.nextLine();

                        // Meminta scan bidang
                        System.out.print("Masukkan Bidang : ");
                        bidangAnggota = scan.nextLine();

                        // Meminta scan partai
                        System.out.print("Masukkan Partai : ");
                        partaiAnggota = scan.nextLine(); 

                        // Membuat objek sementara
                        Anggota temp = new Anggota();

                        // Masukkan input ke objek sementara
                        temp.set_id(idAnggota); temp.set_nama(namaAnggota); temp.set_bidang(bidangAnggota); temp.set_partai(partaiAnggota);
                        // Masukkan objek sementara ke daftar list
                        list.add(temp);
                    }
                } catch (Exception e) {
                    // Jika bukan integer
                    System.out.println( "\nTerjadi kesalahan dalam membaca input!\n");
                    return;
                }
                // print ketika berhasil menambah data
                System.out.println("\n" + max + " Data Berhasil Ditambahkan!\n");
            }

            // Jika pilih menu nomor 2           
            else if(nomor == 2){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    // Scan idx untuk anggota yang ingin diubah datanya
                    System.out.print("\nMasukkan nomor Anggota yang ingin diubah : ");
                    idx = scan.nextInt();
                    scan.nextLine();
                    
                    // Jika idx yang diberikan merupakan bagian dari daftar list
                    if(idx <= list.size()){
                        // Meminta scan id
                        System.out.print("Masukkan ID     : ");
                        idAnggota = scan.nextInt();
                        scan.nextLine();

                        // Meminta scan nama
                        System.out.print("Masukkan Nama   : ");
                        namaAnggota = scan.nextLine();

                        // Meminta scan bidang
                        System.out.print("Masukkan Bidang : ");
                        bidangAnggota = scan.nextLine();

                        // Meminta scan partai
                        System.out.print("Masukkan Partai : ");
                        partaiAnggota = scan.nextLine(); 

                        // print ketika berhasil mengubah data
                        System.out.println("\nData Berhasil Diubah!\n");

                        // Membuat objek sementara
                        Anggota temp = new Anggota();

                        // Masukkan input ke objek sementara
                        temp.set_id(idAnggota); temp.set_nama(namaAnggota); temp.set_bidang(bidangAnggota); temp.set_partai(partaiAnggota);

                        // Mengubah data sesuai index          
                        list.set(idx-1, temp);
                    }
                    // Jika idx yang diberikan bukan bagian dari daftar list
                    else System.out.println("\nMohon maaf, anggota DPR dengan nomor " + idx + " tidak dapat ditemukan.\n");
                }
                // Jika tidak ada elemn dalam list
                else System.out.println("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n");
            }

            // Jika pilih menu nomor 3           
            else if(nomor == 3){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    // Scan idx untuk anggota yang ingin dihapus datanya
                    System.out.print("\nSilahkan isi nomor data anggota yang ingin dihapus : ");
                    idx = scan.nextInt();

                    // Jika idx yang diberikan merupakan bagian dari daftar list
                    if(idx <= list.size()){
                        //hapus sesuai index masukan
                        list.remove(idx-1);
                        // print ketika berhasil megnhapus data
                        System.out.println("\nData Deleted Succesfully\n");
                    }
                    // Jika idx yang diberikan bukan bagian dari daftar list
                    else System.out.println("\nMohon maaf, anggota DPR dengan nomor " + idx + " tidak dapat ditemukan.\n");
                }
                // Jika tidak ada elemn dalam list
                else System.out.println("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n");
            }             

            // Jika pilih menu nomor 4         
            else if(nomor == 4){
                // Ketika terdapat elemen dalam list
                if(list.size() > 0){
                    /*
                        Membuat objek tab dari kelas Tabel dengan panjang baris
                        sesuai dengan jumlah elemen dalam list dan kolom sebesar 5
                    */
                    Tabel tab = new Tabel(list.size(), 5);
                    int maxID = 2;       // "id" = 2
                    int maxName = 4;     // "nama" = 4
                    int maxBidang = 5;   // "bidang" = 5
                    int maxPartai = 5;   // "partai" = 5

                    // Perulangan untuk mencaari yang terpanjang pada baris id
                    for(int i=0; i<list.size() ; i++){
                        String idString = String.valueOf(list.get(i).get_id());
                        int panjangidString = idString.length();
                        if (maxID < panjangidString){ 
                            maxID = panjangidString; 
                        }
                    }
                    
                    // Perulangan untuk mencaari yang terpanjang pada baris nama
                    for(int i=0; i < list.size(); i++){
                        if (maxName < list.get(i).get_nama().length()){ 
                            maxName = list.get(i).get_nama().length(); 
                        }
                    }

                    // Perulangan untuk mencaari yang terpanjang pada baris bidang
                    for(int i=0; i<list.size() ; i++){
                        if (maxBidang < list.get(i).get_bidang().length()){ 
                            maxBidang = list.get(i).get_bidang().length(); 
                        }
                    }

                    // Perulangan untuk mencaari yang terpanjang pada baris partai
                    for(int i=0; i<list.size() ; i++){
                        if (maxPartai < list.get(i).get_partai().length()){ 
                            maxPartai = list.get(i).get_partai().length(); 
                        }
                    }

                    // Membuat perulangan untuk menampilkan output beserta tabel
                    for(int i =0; i < list.size(); i++) {
                        // Membuat array untuk menampung elemen yang mau di print
                        String[] arrstr = new String[5];
                        arrstr[0] = "" + Integer.toString(i+1);
                        arrstr[1] = "" + list.get(i).get_id();
                        arrstr[2] = "" + list.get(i).get_nama();
                        arrstr[3] = "" + list.get(i).get_bidang();
                        arrstr[4] = "" + list.get(i).get_partai();

                        // Memanggil metode buat baris
                        tab.buatBaris(arrstr, list.size(), i, maxID, maxName, maxBidang, maxPartai);
                    }
                }
                // Jika tidak ada elemen dalam list
                else System.out.println("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n");
            }            
            // Jika pilih menu nomor 5           
            else if(nomor == 5){
                System.out.println("\n+-------------------------------------------------+");
                System.out.println("+  Makasih Udah Menggunakan Program Bolip's CRUD  +");
                System.out.println("+-------------------------------------------------+");
                System.out.println("+                                                 +");
                System.out.println("+               kalo kamu fans emyu               +");
                System.out.println("+        <3 semoga harimu menyenangkan <3         +");
                System.out.println("+                                                 +");
                System.out.println("+-------------------------------------------------+\n");

                display = 1;
            }
            // Jika pilih noomr yang tidak ada di menu           
            else System.out.println("\nMenu " + nomor + " tidak tersedia, mohon memasukkan angka sesuai dengan menu yang tersedia!\n");            
        }        


    }
}

