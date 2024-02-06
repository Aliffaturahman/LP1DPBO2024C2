/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan 1 dalam 
    mata kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan 
    kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

//----- Latihan C++ -----//

#include <iostream>
#include <string>

using namespace std;

class Anggota{
    private:
        string id;
        string nama;
        string bidang;
        string partai;
    
    public:
        Anggota(){
            this->id = "";
            this->nama = "";
            this->bidang = "";
            this->partai = "";
        }

        Anggota(string nama, char gender){
            this->id = id;
            this->nama = nama;
            this->bidang = bidang;
            this->partai = partai;
        }

        string get_id(){
            return this->id;
        }

        void set_id(string id){
            this->id = id;
        }
        
        string get_nama(){
            return this->nama;
        }

        void set_nama(string nama){
            this->nama = nama;
        }

        string get_bidang(){
            return this->bidang;
        }

        void set_bidang(string bidang){
            this->bidang = bidang;
        }

        string get_partai(){
            return this->partai;
        }

        void set_partai(string partai){
            this->partai = partai;
        }

        ~Anggota(){
        }
};