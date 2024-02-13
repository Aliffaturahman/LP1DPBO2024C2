# Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
# kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
# telah dispesifikasikan. Aamiin.

# ----- Latihan Python ----- #

# class Decalaration
class Anggota:
    # Membuat Private attributes.
    __id = 0
    __nama = ""
    __bidang = ""
    __partai = ""

    # Constructor dengan inisialisasi default
    def __init__(self, id = 0, nama = "", bidang = "", partai = ""):
        self.__id = id
        self.__nama = nama
        self.__bidang = bidang
        self.__partai = partai

    # Metode Setter and Getter untuk atribut private
    # Setter ID
    def set_id(self, idAnggota):
        self.__id = idAnggota

    # Getter ID
    def get_id(self):
        return self.__id
    
    # Setter Nama
    def set_nama(self, namaAnggota):
        self.__nama = namaAnggota

    # Getter Nama
    def get_nama(self):
        return self.__nama

    # Setter Bidang
    def set_bidang(self, bidangAnggota):
        self.__bidang = bidangAnggota

    # Getter Bidang
    def get_bidang(self):
        return self.__bidang

    # Setter Partai
    def set_partai(self, partaiAnggota):
        self.__partai = partaiAnggota

    # Getter Partai
    def get_partai(self):
        return self.__partai