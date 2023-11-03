# Pa_Pbo

# Nama : Syahfi rizqi ,Sanny Revalina Abigail

# Nim  : 2209116093 ,2209116064


# LAYANAN SANGGAR SENI TARI
layanan sanggar seni tari merupakan sebuah organisasi yang bergerak pada bidang tari. tujuan dibentuknya organisasi ini adalah untuk mengembangkan potensi dan untuk melestarikan budaya yang ada. pada layanan sanggar tari ini memiliki 2 jenis tari yang ditawarkan, yaitu tari modern dan tradisional. orang yang ingin mendaftar pada seni tari ini dapat memilih tari yang mau di kembangkan berdasarkan tari yang diminati nya. 

	organisasi layanan sanggar seni tari ini terdapat bukti daftar yang mencakup informasi pribadi seperti kode pendaftaran,tanggal mendaftar ,nama anggota,dan no telp, sesudah mendaftar maka anggota akan mendapatkan jadwal latihan yang mencakup ruangan yang digunakan dan jadwal latihan  serta nama dari instruktur yang melatih.

bukti registrasi ini berfungsi sebagai tanda pengenal dari setiap anggota, dengan adanya bukti regis ini akan mempermudah instruktur untuk mendata data-data dari setiap anggota.


![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/d9df14dc-80ef-46d2-a251-33b253f306b9)

![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/5370cc92-59ad-48bf-ab17-48453040ab98)

![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/45ef0988-4ff7-4b1b-8b44-bb60372a31f4)
Class Databases image . package databases;: Baris ini mendefinisikan paket (package) di mana class Database akan berada. Paket databases merupakan paket yang digunakan untuk mengelola akses ke database. . import java.sql.*;: Ini adalah pernyataan untuk mengimpor paket java.sql yang berisi kelas-kelas dan antarmuka yang diperlukan untuk bekerja dengan database JDBC (Java Database Connectivity). . public class Database {: Ini adalah deklarasi class Database yang akan digunakan untuk mengelola koneksi database. . private static Connection mysql;: Ini adalah deklarasi variabel mysql yang digunakan untuk menyimpan objek koneksi database. Variabel ini dideklarasikan sebagai private dan static sehingga hanya dapat diakses oleh class ini dan dapat dibagikan di antara semua instance dari class ini. . public static Connection configDB(): Ini adalah metode configDB yang digunakan untuk mengonfigurasi dan mendapatkan koneksi ke database. Metode ini mengembalikan objek Connection yang merupakan koneksi database. . try { ... } catch (Exception a) { ... }: Ini adalah blok try-catch yang digunakan untuk menangani eksepsi yang mungkin terjadi saat mengatur koneksi database. Di dalam blok try, koneksi database diinisialisasi dengan menggunakan informasi seperti URL database, nama pengguna, dan kata sandi. Jika ada kesalahan dalam koneksi, eksepsi akan ditangani dan pesan kesalahan akan dicetak. . String url = "jdbc:mysql://localhost:3306/pa_dbd";: Ini adalah URL database yang digunakan untuk mengidentifikasi lokasi dan nama database yang akan diakses. Dalam hal ini, database MySQL berada di localhost (komputer lokal) pada port 3306, dan nama database-nya adalah "pa_dbd". . String user = "root";: Ini adalah nama pengguna yang digunakan untuk mengautentikasi ke database MySQL. Dalam contoh ini, pengguna adalah "root". . String password = "";: Ini adalah kata sandi yang digunakan untuk mengautentikasi ke database MySQL. Dalam contoh ini, kata sandi dikosongkan (biasanya bukan praktik yang aman). . mysql = DriverManager.getConnection(url, user, password);: Di sinilah koneksi sebenarnya dibuat dengan menggunakan metode DriverManager.getConnection(). Metode ini mengambil tiga argumen: URL database, nama pengguna, dan kata sandi, dan mengembalikan objek Connection yang digunakan untuk berinteraksi dengan database. . System.err.println("Koneksi terputus " + a.getMessage());: Jika ada kesalahan dalam koneksi database, pesan kesalahan akan dicetak ke sistem keluaran kesalahan (error output).k . return mysql;: Jika koneksi berhasil, objek Connection akan dikembalikan oleh metode configDB() sehingga dapat digunakan untuk berinteraksi dengan database dalam kode lain.



