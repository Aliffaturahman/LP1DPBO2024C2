# Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
# kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
# telah dispesifikasikan. Aamiin.

# ----- Latihan Python ----- #

# Membuat kelas table
class Table:
    # Membuat atribut Private
    # Banyaknya baris dan kolom
    __baris = 0
    __kolom = 0

    # Constructor dengan inisialisasi default
    def __init__(self, baris=0, kolom=0):
        self.__baris = baris
        self.__kolom = kolom

    # Metode Setter and Getter untuk atribut private
    # Setter baris
    def set_baris(self, baris):
        self.__baris = baris

    # Getter baris
    def get_baris(self):
        return self.__baris

    # Setter kolom
    def set_kolom(self, kolom):
        self.__kolom = kolom

    # Getter kolom
    def get_kolom(self):
        return self.__kolom

    # Metode untuk membuat buat tabel
    def buatBaris(self, isi, batas, idx, id, name, bidang, partai):
        i = 0
        j = 0

        # Membuat table bagian atas
        if idx == 0:
            print("\n+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(id + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(bidang + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(partai + 2):
                        print("-", end="")
            print("+")

        # Membuat baris untuk judul
        if idx == 0:
            print("|No  ", end="")
            print("|ID", end="")

            for j in range(id):
                print(" ", end="")
            print("|Nama", end="")

            for j in range(name - 2):
                print(" ", end="")
            print("|Bidang", end="")

            for j in range(bidang - 4):
                print(" ", end="")
            print("|Partai", end="")

            for j in range(partai - 4):
                print(" ", end="")
            print("|")

        # Membuat kerangka tabel bawah judul
        if idx == 0:
            print("+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(id + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(bidang + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(partai + 2):
                        print("-", end="")
            print("+")

        # Membuat baris isi
        for i in range(5):
            if i == 0:
                print("|" + isi[i] + "   ", end="")
            elif i == 1:
                print("|" + isi[i], end="")
                for j in range(id - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 2:
                print("|" + isi[i], end="")
                for j in range(name - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 3:
                print("|" + isi[i], end="")
                for j in range(bidang - len(isi[i]) + 2):
                    print(" ", end="")
            elif i == 4:
                print("|" + isi[i], end="")
                for j in range(partai - len(isi[i]) + 2):
                    print(" ", end="")
            if i == (5 - 1):
                print("|", end="")
        print("")

        # Membuat kerangka tabel pada baris tearkhir
        if idx == batas - 1:
            print("+", end="")
            for i in range(5):
                if i == 0:
                    for j in range(4):
                        print("-", end="")
                if i == 1:
                    print("+", end="")
                    for j in range(id + 2):
                        print("-", end="")
                if i == 2:
                    print("+", end="")
                    for j in range(name + 2):
                        print("-", end="")
                if i == 3:
                    print("+", end="")
                    for j in range(bidang + 2):
                        print("-", end="")
                if i == 4:
                    print("+", end="")
                    for j in range(partai + 2):
                        print("-", end="")
            print("+\n")