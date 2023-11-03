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

![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/6d8fe0a1-cf59-4a02-9e61-5345f808df0d)
![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/34b11011-e668-4ed9-828d-f32880eb633b)
![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/d3799c1e-625e-49f4-af90-8e90696c493c)
![image](https://github.com/kelompok-22/Pa_Pbo/assets/127517301/0dd14365-f854-45ac-8691-4dbe8acb8a9a)

Kode yang Anda bagikan adalah bagian dari program Java yang tampaknya terkait dengan manajemen data dalam aplikasi yang melibatkan daftar anggota. Program ini terdiri dari dua kelas utama: bukti_daftar1 dan controller_buktidaftar. Mari saya jelaskan fungsi dan penggunaan kelas bukti_daftar1.

Kelas bukti_daftar1 adalah implementasi dari antarmuka implemenbuktidaftar yang kemungkinan besar digunakan untuk mengakses dan mengelola data daftar anggota dalam database. Berikut adalah penjelasan lebih detail:

Deklarasi Variabel dan Koneksi:

Variabel connection digunakan untuk menampung koneksi ke database. Koneksi ini diinisialisasi dalam konstruktor bukti_daftar1 menggunakan metode databases.configDB(), yang mungkin mengatur dan mengembalikan koneksi database.
SQL Statements:

Variabel insert berisi pernyataan SQL untuk menyisipkan data baru ke dalam tabel bukti_daftar dalam database. Ini akan digunakan dalam metode insert untuk menyimpan data ke database.
Variabel update berisi pernyataan SQL untuk memperbarui data yang ada dalam tabel bukti_daftar. Ini akan digunakan dalam metode update untuk memperbarui data dalam database.
Variabel select berisi pernyataan SQL untuk mengambil semua data dari tabel bukti_daftar. Ini akan digunakan dalam metode getALLBuktidaftar untuk mengambil data dari database.
Metode insert:

Metode ini mengimplementasikan antarmuka implemenbuktidaftar. Ini digunakan untuk menyisipkan data anggota baru ke dalam tabel bukti_daftar. Data tersebut diambil dari objek model_daftaranggota yang diberikan sebagai parameter metode.
Metode ini menggunakan pernyataan SQL insert untuk menyisipkan data ke dalam database.
Metode update:

Metode ini juga mengimplementasikan antarmuka implemenbuktidaftar dan digunakan untuk memperbarui data anggota yang ada dalam tabel bukti_daftar. Data yang akan diperbarui diambil dari objek model_daftaranggota yang diberikan sebagai parameter metode.
Metode ini menggunakan pernyataan SQL update untuk memperbarui data dalam database.
Metode getALLBuktidaftar:

Metode ini digunakan untuk mengambil semua data anggota dari tabel bukti_daftar dalam database.
Metode ini mengembalikan daftar objek model_daftaranggota yang berisi data anggota yang diambil dari database.
Perlu diingat bahwa kelas ini bekerja dengan database, dan sebagian besar metodenya mengoperasikan pernyataan SQL untuk memanipulasi atau mengambil data dari database. Juga, pastikan bahwa semua operasi yang melibatkan database harus dielakukan dengan aman dan terhindar dari masalah seperti SQL injection atau kesalahan dalam manajemen koneksi database

