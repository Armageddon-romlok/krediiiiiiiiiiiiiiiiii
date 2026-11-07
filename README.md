## 6. 🗂️ Struktur Folder / Package

### 6.1 Struktur Folder Proyek

> ✏️ <img width="404" height="519" alt="{BED5FD87-FF3F-4053-8BC0-2C43301DE686}" src="https://github.com/user-attachments/assets/78e8ee57-0c82-411c-a1da-de238eb27fc3" />





### 6.2 Penjelasan Package

#### 📦 Package `model`
<img width="381" height="138" alt="{F692F335-B54F-430E-9045-00E4DA07AE59}" src="https://github.com/user-attachments/assets/73b7674a-2cf0-478a-9de5-73fa69ffbee6" />

> ✏️ Berfungsi untuk mendefinisikan blueprint (cetak biru) dari entitas data yang ada di database menjadi objek Java (representasi tabel ke objek). Daftar class di dalamnya meliputi AkunData.java, Nasabah.java, Pegawai.java, User.java, dan UserSession.java.


#### 📦 Package `view`
<img width="536" height="579" alt="{F39808A9-BE67-473C-929A-2521EE425DD3}" src="https://github.com/user-attachments/assets/78231a77-0b4c-4e1e-a268-0cef40a89dd9" />

> ✏️ Berfungsi sebagai antarmuka pengguna (GUI) tempat interaksi visual terjadi (form JFrame). Daftar class/form GUI di dalamnya meliputi AdminView2.java, LiatProfilView_1.java, LoginView.java, NasabahView1.java, PetugasKreditView1.java, RegisterView.java, dan kumpulan form TellerView.java.


#### 📦 Package `proses`
<img width="258" height="66" alt="{2F030201-35CA-499B-9DDE-02321B7286C2}" src="https://github.com/user-attachments/assets/0b432121-3368-4e16-9af3-49177214114e" />

> ✏️ Berfungsi sebagai pengendali alur logika bisnis dan transisi state aplikasi di luar GUI. Daftar class di dalamnya meliputi Autentikasi.java dan UserSession.java.


#### 📦 Package `dao`
<img width="307" height="114" alt="{A85B3336-EDC5-473C-80D3-1776246B6EC0}" src="https://github.com/user-attachments/assets/efe25d01-9a6e-482f-80ea-166849f04a9e" />

> ✏️ Data Access Object (DAO) berfungsi secara spesifik untuk menangani seluruh kueri CRUD (Create, Read, Update, Delete) ke database MySQL, memisahkan logika SQL dari UI. Daftar class di dalamnya meliputi AutentikasiDAO.java, NasabahDAO.java, PegawaiDAO.java, PinjamanDAO.java, dan TransaksiDAO.java.



#### 📦 Package `database`
<img width="231" height="45" alt="{1BF29AAC-F1B1-4425-BF56-9AD569A2E57C}" src="https://github.com/user-attachments/assets/553ebfef-048d-4f29-b343-1095cc7c61a5" />

> ✏️ Berfungsi untuk mengatur konfigurasi dan jembatan koneksi (driver) antara program Java dan server MySQL. Daftar class di dalamnya meliputi Koneksi.java.


#### 🖼️ Folder `resources` / `images`
<img width="675" height="182" alt="{6DCFED1C-D90E-408A-BB61-A6D40314E596}" src="https://github.com/user-attachments/assets/f55a27b0-eb0d-486b-9fed-26eab2d20781" />

> ✏️ Berfungsi sebagai direktori penyimpanan aset statis aplikasi. Aset yang disimpan di folder ini meliputi gambar antarmuka seperti Background.png, bg lgoin.png, ilustrasi website launch plan, serta gambar ikon profil seperti user.png.


#### 📚 Libraries
<img width="387" height="119" alt="{6A8CB42C-75F5-4A35-9119-2C8271EBD20E}" src="https://github.com/user-attachments/assets/b9eebad6-137d-4ca7-b5c2-b1eb0d0dd091" />

> ✏️ Proyek ini menggunakan basis Maven (pom.xml). Library utama yang wajib ada adalah MySQL Connector/J (untuk implementasi JDBC agar bisa terhubung ke database pa_creedy). Selain itu, program ini juga mengandalkan library bawaan Java Swing (javax.swing.*) dan AWT (java.awt.*) untuk rendering komponen antarmuka GUI.


### 6.3 Penerapan Arsitektur MVC + DAO

> ✏️ *Isi: penjelasan singkat pembagian peran Model, View, Controller, dan DAO pada program.*

---

## 7. 🧱 Penjelasan Penerapan 4 Pilar OOP

### 7.1 Encapsulation (Enkapsulasi)

**Konsep:**
> ✏️ *Isi: penjelasan singkat konsep.*

#### 📁 Contoh 1: `NamaClass.java`
> ✏️ *Isi: potongan kode (blok ```java) dan penjelasan penerapannya.*

#### 📁 Contoh 2: `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan.*

**Kesimpulan:**
> ✏️ *Isi: ringkasan penerapan enkapsulasi pada program.*

---

### 7.2 Inheritance (Pewarisan)

**Konsep:**
> ✏️ *Isi: penjelasan singkat konsep.*

#### 📁 Contoh 1: `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan penerapannya.*

#### 📁 Contoh 2: `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan.*

#### 🌳 Hierarki Pewarisan
> ✏️ *Isi: diagram atau gambar hierarki class (boleh memakai Mermaid `classDiagram`).*

**Kesimpulan:**
> ✏️ *Isi: ringkasan penerapan inheritance pada program.*

---

### 7.3 Abstraction (Abstraksi)

**Konsep:**
> ✏️ *Isi: penjelasan singkat konsep.*

#### 📁 Contoh 1: `NamaClass.java` / `NamaInterface.java`
> ✏️ *Isi: potongan kode (abstract class / interface) dan penjelasan penerapannya.*

#### 📁 Contoh 2: `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan.*

**Kesimpulan:**
> ✏️ *Isi: ringkasan penerapan abstraksi pada program.*

---

### 7.4 Polymorphism (Polimorfisme)

**Konsep:**
> ✏️ *Isi: penjelasan singkat konsep.*

#### 📁 Contoh 1: Method Overriding pada `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan penerapannya.*

#### 📁 Contoh 2: Method Overloading / Dynamic Dispatch pada `NamaClass.java`
> ✏️ *Isi: potongan kode dan penjelasan.*

**Kesimpulan:**
> ✏️ *Isi: ringkasan penerapan polimorfisme pada program.*

---

### 7.5 Ringkasan Penerapan 4 Pilar OOP

| Pilar OOP | Class / File yang Menerapkan | Keterangan |
|---|---|---|
| Encapsulation | | |
| Inheritance | | |
| Abstraction | | |
| Polymorphism | | |

---
