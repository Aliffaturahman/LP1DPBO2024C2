/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan 1 dalam 
    mata kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan 
    kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

//----- Latihan C++ -----//

#include <bits/stdc++.h>
#include "Anggota.cpp"

using namespace std;

int main(){
    int i, n = 0;

    string id;
    string nama;
    string bidang;
    string partai;

    list<Anggota> llist;

    while(n < 5){
        Anggota temp;

        cout << "\nPilih Salah Satu Menu :" << endl;
        cout << "Input 1 Untuk Menambah Data Anggota" << endl;
        cout << "Input 2 Untuk Mengubah Data Anggota" << endl;
        cout << "Input 3 Untuk Menghapus Data Anggota" << endl;
        cout << "Input 4 Untuk Menampilkan Seluruh Data Anggota DPR" << endl;
        cout << "Input 5 Untuk Keluar\n" << endl;

        cout << "Menu yang dipilih : ";
        cin >> n;

        if(n == 1){
            cout << "\nMasukkan ID :" << endl;
            cin >> id;
            cout << "Masukkan Nama :" << endl;
            cin >> nama;
            cout << "Masukkan Bidang :" << endl;
            cin >> bidang;
            cout << "Masukkan Partai :" << endl;
            cin >> partai;
        
            temp.set_id(id);
            temp.set_nama(nama);
            temp.set_bidang(bidang);
            temp.set_partai(partai);

            llist.push_back(temp);
        }
        else if(n == 2){
            cout << "\nMasukkan ID Anggota DPR" << endl;
            cin >> id;

            int found = 0;
            for(list<Anggota>::iterator it = llist.begin(); it != llist.end(); it++){
                if(it->get_id() == id){
                    found = 1;

                    cout << "\nMasukkan ID Anggota Baru :" << endl;
                    cin >> id;
                    cout << "Masukkan Nama Anggota Baru :" << endl;
                    cin >> nama;
                    cout << "Masukkan Bidang Anggota Baru :" << endl;
                    cin >> bidang;
                    cout << "Masukkan Partai Anggota Baru :" << endl;
                    cin >> partai;

                    it->set_id(id);
                    it->set_nama(nama);
                    it->set_bidang(bidang);
                    it->set_partai(partai);
                }
            }
            if(found == 0){
                cout << "\nAnggota DPR dengan ID " << id << " Tidak Ditemukan" << endl;
            }
        }
        else if(n == 3){
            cout << "Masukkan ID Anggota DPR Yang Ingin Dihapus" << endl;
            cin >> id;

            int found = 0;
            for(list<Anggota>::iterator it = llist.begin(); it != llist.end(); it++){
                if(it->get_id() == id){
                    found = 1;

                    llist.erase(it);
                    cout << "\nAnggota DPR dengan ID " << id << " Berhasil Dihapus" << endl;
                    break;
                }
            }
            if(found == 0){
                cout << "\nAnggota DPR dengan ID " << id << " Tidak Ditemukan" << endl;
            }
        }
        else if(n == 4){
            int check = 0;
            cout << "\nDaftar Anggota DPR yang Tersedia :" << endl;
            cout << "\nID\tNama\t\tBidang\t\tPartai" << endl;
            cout << "-------------------------------------------------" << endl;

            for (list<Anggota>::iterator it = llist.begin(); it != llist.end(); it++){
                cout << it->get_id() << "\t" << it->get_nama() << "\t\t" << it->get_bidang() << "\t" << it->get_partai() << endl;
            }
        }
        else if(n == 5){
            cout << "\nAnda Keluar Dari Program Anggota DPR, Terima Kasih!" << endl;
        }
    }

    if(n > 5){
        cout << "\nMenu yang Anda Pilih Tidak Tersedia!" << endl;
    }

    return 0;
}