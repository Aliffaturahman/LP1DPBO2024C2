<!-- 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Latihan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang 
    telah dispesifikasikan. Aamiin.
-->

<!-- ----- Latihan PHP ----- -->

<?php
// impor class anggota
require('Anggota.php');
// Read Data array
$anggota = array(
	//Menambahkan beberapa data
	// Untuk Gambar Dapat diambil melalui gambar di internet
    new Anggota(0, 'Erik Ten Hag', 'Pertahanan', 'PERINDO', "https://d.ibtimes.co.uk/en/full/1722250/erik-ten-hag.jpg?w=736&f=4cb41bd97fc6354e0681f3f1d40a4d55"),
    new Anggota(5, 'Harry Maguire', 'Pendidikan', 'PKS', "https://static.independent.co.uk/2022/01/24/07/newFile-2.jpg"),
    new Anggota(6, 'Lisandro Martinez', 'Kesehatan', 'PSI', "https://manunitedcore.com/wp-content/uploads/2022/11/images-2022-11-27T190728.538.jpeg"),
    new Anggota(7, 'Mason Mount', 'Perikanan', 'PDIP', "https://talksport.com/wp-content/uploads/sites/5/2023/07/mason-mount-manchester-united-pre-831304980.jpg?strip=all&w=960"),
    new Anggota(8, 'Bruno Fernandes', 'Rohani', 'PSI', "https://th.bing.com/th/id/OIP.kUNLDWbrVP15-DvvY123OgHaFj?w=258&h=193&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
	new Anggota(10, 'Marcus Rashford', 'Pertanian', 'NASDEM', "https://www.expressandstar.com/resizer/zSTypdVQ22MKE8j2xvcj36vlQNw=/1200x0/cloudfront-us-east-1.images.arcpublishing.com/mna/FF25PZKMRND6HPUYKKSYMFT5TQ.jpg"),
    new Anggota(11, 'Rasmus Hojlund', 'Pertahanan', 'PDIP', "https://image-service.onefootball.com/transform?w=280&h=210&dpr=2&image=https:%2F%2Fd3nfwcxd527z59.cloudfront.net%2Fcontent%2Fuploads%2F2023%2F10%2F13105520%2FManchester-Uniteds-Rasmus-Hojlund.jpg"),
    new Anggota(17, 'Alejandro Garnacho', 'Kesehatan', 'GERINDRA', "https://static0.givemesportimages.com/wordpress/wp-content/uploads/2023/04/gettyimages-1470736959.jpg"),
    new Anggota(18, 'Casemiro', 'Sosial', 'GOLKAR', "https://www.sportspromedia.com/wp-content/uploads/2023/03/Copy-of-Copy-of-WP-News-story-template-2023-03-16T150738.540.jpg"),
    new Anggota(24, 'Andre Onana', 'Pertahanan', 'PAN', "https://cdn1.unitedinfocus.com/uploads/14/2023/10/GettyImages-1722917000-2-scaled.jpg"),
);

// membuat array dari objek anggota
foreach ($anggota as $key => $value) {
	$data[] = array($key + 1, $value->get_id(), $value->get_nama(), $value->get_bidang(), $value->get_partai(), '<img src="' . $value->get_image() . '" width="100" height="80">', '<a href="?delete=' . $key . '">Delete</a>');
}

if (isset($_GET['delete'])) {
    $index = $_GET['delete'];
    $deletedMember = $anggota[$index]->get_nama();
    $deletedMemberID = $anggota[$index]->get_id();
    if (isset($anggota[$index])) {
        unset($anggota[$index]);
        foreach ($anggota as $key => $value) {
            $data_deleted[] = array($key + 1, $value->get_id(), $value->get_nama(), $value->get_bidang(), $value->get_partai(), '<img src="' . $value->get_image() . '" width="100" height="80">', '<a href="?delete=' . $key . '">Delete</a>');
        }
    }
}

echo "<center><h1>Selamat Datang di Paradis Island!</h1></center>";

//Membuat Tabel sebelum dihapus
echo "<h2>Daftar Anggota DPR Sebelum Titan Menyerang</h2>";
echo "<table border='1' width='70%'>";

//Judul tabel 
echo "<tr>";
echo "<th> No </td>";
echo "<th> ID </td>";
echo "<th> Nama </td>";
echo "<th> Bidang </td>";
echo "<th> Partai </td>";
echo "<th> Foto Profil </td>";
echo "<th> Aksi </td>";
echo "</tr>";

// Loop untuk menampilkan data array dalam bentuk tabel
foreach ($data as $row) {
	echo "<tr align=center>";
	foreach ($row as $cell) {
		echo "<td >" . $cell . "</td>";
	}
	echo "</tr>";
}
echo "</table>";

// Menampilkan tabel data anggota yang sudah dihapus barisnya
if (isset($data_deleted)) {
	echo "<br>";
    echo "<h2>Daftar Anggota DPR Setelah Penyerangan Titan</h2>";
    echo "<p>Anggota yang dimakan oleh Titan : $deletedMemberID $deletedMember</p>";
    echo "<table border='1' width='70%'>";

	//Judul tabel 
	echo "<tr>";
	echo "<th> No </td>";
	echo "<th> ID </td>";
	echo "<th> Nama </td>";
	echo "<th> Bidang </td>";
	echo "<th> Partai </td>";
	echo "<th> Foto Profil </td>";
	echo "<th> Aksi </td>";
	echo "</tr>";

	// Loop untuk menampilkan data array yang sudah dihapus dalam bentuk tabel
	foreach ($data_deleted as $row) {
		echo "<tr>";
		foreach ($row as $cell) {
			echo "<td align='center'>" . $cell . "</td>";
		}
		echo "</tr>";
	}
	echo "</table>";
}
