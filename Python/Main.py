# Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
# kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
# telah dispesifikasikan. Aamiin.

# ----- Latihan Python ----- #

# Import library and file.
from Anggota import Anggota
from Table import Table

# ------------ Membuat Variabel ----------------
# - nomor = variabel untuk mengatur menu
# - idAnggota, namaAnggota, bidangAnggota, partaiAnggota = String untuk menyimpan nilai sementara dari masing2 nilai
# - display = variable utk mengatur jalannya program
# - idx = sebagai index nilai (indek update / delete)
# - max = sebagai batas inputan menu tambah
# - Anggotaa = list yang berisi objek dari kelas Anggota

nomor = 0
idAnggota = 0
namaAnggota = ""
bidangAnggota = ""
partaiAnggota = ""
display = 0
idx = 0
max = 0
Anggotaa = []

print("+--------------------------------------------+")
print("|                                            |")
print("+   Selamat Datang Di Program Bolip's CRUD   +")
print("+    ( Create, Read, Update, and Delete )    +")
print("|                                            |")
print("+--------------------------------------------+")
print("|           ~~~ Python Version ~~~           |")
print("+--------------------------------------------+\n")

# Program akan terus berjalan sampai display != 0
while display == 0:
    # Tampilan untuk pilihan menu
    print("Silahkan Pilih Salah Satu Menu :")
    print("[1] Untuk Menambah Data Anggota")
    print("[2] Untuk Mengubah Data Anggota")
    print("[3] Untuk Menghapus Data Anggota")
    print("[4] Untuk Menampilkan Seluruh Data Anggota DPR")
    print("[5] Untuk Keluar\n")

    # Scan nomor pada menu
    print("Menu yang dipilih : ", end='')
    nomor = int(input())

    # Jika pilih menu nomor 1
    if nomor == 1:
        # Scan banyak Anggota yang ingin di input
        print("\nJumlah Anggota DPR yang Ingin Ditambahkan : ", end='')
        max = int(input())

        # Looping sebanyak max
        for i in range(max):
            # Mendata per-Anggota
            print("-----------------------------------------")
            print("Data Anggota ke - ", i+1)

            # Meminta scan id
            print("Masukkan ID     : ", end='')
            idAnggota = int(input())

            # Meminta scan nama
            print("Masukkan Nama   : ", end='')
            namaAnggota = str(input())

            # Meminta scan bidang
            print("Masukkan Bidang : ", end='')
            bidangAnggota = str(input())

            # Meminta scan partai
            print("Masukkan Partai : ", end='')
            partaiAnggota = str(input())

            # Masukkan inputan ke dalam list untuk kelas Anggota
            Anggotaa.append(
                Anggota(idAnggota, namaAnggota, bidangAnggota, partaiAnggota))
        # print ketika berhasil menambah data
        print("\n{} Data Berhasil Ditambahkan!\n".format(max))

    # Jika pilih menu nomor 2
    elif nomor == 2:
        # Ketika terdapat elemen dalam list
        if len(Anggotaa) > 0:
            # Scan idx untuk Anggota yang ingin diubah datanya
            print("\nMasukkan nomor Anggota yang ingin diubah : ",  end='')
            idx = int(input())

            # Jika idx yang diberikan merupakan bagian dari daftar list
            if idx <= len(Anggotaa):
                # Meminta scan id
                print("Masukkan ID     : ", end='')
                idAnggota = int(input())

                # Meminta scan nama
                print("Masukkan Nama   : ", end='')
                namaAnggota = input()

                # Meminta scan bidang
                print("Masukkan Bidang : ", end='')
                bidangAnggota = input()

                # Meminta scan partai
                print("Masukkan Partai : ", end='')
                partaiAnggota = input()

                # Print ketika berhasil mengubah data
                print("\nData Anggota nomor {} berhasil diubah\n".format(idx))

                # ubah isi nilai untuk masing2 nilai
                Anggotaa[idx-1].set_id(idAnggota)
                Anggotaa[idx-1].set_nama(namaAnggota)
                Anggotaa[idx-1].set_bidang(bidangAnggota)
                Anggotaa[idx-1].set_partai(partaiAnggota)

            else:
                # Jika idx yang diberikan merupakan bukan bagian dari daftar list
                print("\nMohon maaf, anggota DPR dengan nomor {} tidak dapat ditemukan.\n".format(idx))
        # Jika tidak ada elemn dalam list
        else:
            print("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n")
            
    # jika pilih menu nomor 3
    elif nomor == 3:
        # Ketika terdapat elemen dalam list
        if len(Anggotaa) > 0:
            # Scan idx untuk Anggota yang ingin dihapus
            print("Masukkan nomor Anggota yang ingin dihapus : ", end='')
            idx = int(input())

            # Jika idx yang diberikan merupakan bagian dari daftar list
            if idx <= len(Anggotaa):
                # Hapus data sesuai index
                Anggotaa.pop(idx-1)
                # print ketika berhasil megnhapus data
                print("\nData Anggota DPR dengan nomor {} Berhasil Dihapus!\n".format(idx))
            else:
                # Jika idx yang diberikan bukan bagian dari daftar list
                print("\nMohon maaf, anggota DPR dengan nomor {} tidak dapat ditemukan.\n".format(idx))
        else:
            # JIka tidak ada elemn dalam list
            print("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n")
            
    # Jika pilih menu nomor 4
    elif nomor == 4:
        # Ketika terdapat elemen dalam list
        if len(Anggotaa) > 0:
            # Membuat objek tab dari kelas Table dengan panjang
            # Baris sesuai dengan jumlah elemen dalam list dan kolom sebesar 5
            tab = Table(len(Anggotaa), 5)
            maxID = 2       # "id" = 2
            maxName = 4     # "nama" = 4
            maxBidang = 5   # "bidang" = 5
            maxPartai = 5   # "partai" = 5

            # Perulangan untuk mencaari yang terpanjang pada baris id
            for Anggota in Anggotaa:
                if maxID < len(str(Anggota.get_id())):
                    maxID = len(str(Anggota.get_id()))
            # Perulangan untuk mencaari yang terpanjang pada baris nama
            for Anggota in Anggotaa:
                if maxName < len(Anggota.get_nama()):
                    maxName = len(Anggota.get_nama())
            # Perulangan untuk mencaari yang terpanjang pada baris bidang
            for Anggota in Anggotaa:
                if maxBidang < len(Anggota.get_bidang()):
                    maxBidang = len(Anggota.get_bidang())
            # Perulangan untuk mencaari yang terpanjang pada baris partai            
            # for Anggota in Anggotaa:
                if maxPartai < len(Anggota.get_partai()):
                    maxPartai = len(Anggota.get_partai())

            i = 0  # inisialisasi nilai i
            # Membuat perulangan untuk menampilkan output beserta tabel
            for Anggota in Anggotaa:
                # Membuat list untuk elemen yang mau di print
                llist = []
                # Memasukan setiap elemen ke dalam list
                llist.insert(0, str(i+1))
                llist.insert(1, str(Anggota.get_id()))
                llist.insert(2, Anggota.get_nama())
                llist.insert(3, Anggota.get_bidang())
                llist.insert(4, Anggota.get_partai())

                # Memanggil metode buat baris
                tab.buatBaris(llist, len(Anggotaa), i, maxID, maxName, maxBidang, maxPartai)
                i += 1  # iteasi i
        else:
            print("\nTidak ada list anggota DPR yang tersedia, dimohon untuk mengisi data terlebih dahulu!\n")

    # Jika pilih menu nomor 5
    elif nomor == 5:
        print("\n+-------------------------------------------------+")
        print("+  Makasih Udah Menggunakan Program Bolip's CRUD  +")
        print("+-------------------------------------------------+")
        print("+                                                 +")
        print("+               kalo kamu fans emyu               +")
        print("+        <3 semoga harimu menyenangkan <3         +")
        print("+                                                 +")
        print("+-------------------------------------------------+\n")

        display = 1

    # Jika pilih nomor yang tidak ada di menu
    else:
        print("\nMenu {} tidak tersedia, mohon memasukkan angka sesuai dengan menu yang terssedia!\n".format(nomor))