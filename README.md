# tugas-pbo
1. Salah satu konsep dasar OOP, yaitu sekumpulan entitas serupa. Kelas hanyalah 
komponen logis, bukan entitas fisik 
2. Atribut: menyimpan data atau keadaan dari objek. 
Method: berfungsi untuk melakukan aksi atau memanipulasi data yang ada di 
atribut. 
Ketika objek dibuat dari kelas, setiap objek memiliki salinan atributnya sendiri, tapi 
bisa menggunakan method yang sama 
3. Method yang mengembalikan nilai itu menggunakan kata kunci return, tipe data 
harus sesuai. 
Method yang tidak mengembalikan nilai itu menggunakan void, tidak ada return 
nilai. 
4. Method punya peran penting dalam mengelola data yang disimpan di dalam atribut 
kelas. Method bisa dipakai buat ngambil nilai dari atribut, ngubah nilainya, atau 
bahkan ngecek kondisi tertentu berdasarkan data yang ada. 
5.  
I. 
Single Responsibility Principle (SRP) 
Kelas hanya punya satu tanggung jawab: menyimpan dan mengelola usia anak 
anjing. 
Sesuai SRP karena kelas tidak mengurus hal lain seperti makanan atau aktivitas. 
II. 
2. Open/Closed Principle (OCP) 
Kelas harus bisa diperluas tanpa diubah. 
Status: Saat ini belum sepenuhnya OCP, karena menambahkan perilaku baru (misal 
berlari) harus mengubah kelas ini. 
III. 
3. Liskov Substitution Principle (LSP) 
Kelas turunan harus bisa menggantikan kelas induk tanpa mengubah fungsi. 
Status: Kode saat ini sederhana, tapi desain memungkinkan jika nanti ada subclass 
IV. 
4. Interface Segregation Principle (ISP) 
Interface harus spesifik dan tidak memaksa klien mengimplementasikan metode 
yang tidak dibutuhkan. 
Status: Kode ini belum menggunakan interface, jadi prinsip ISP belum diterapkan. 
V. 
Dependency Inversion Principle (DIP) 
Modul tinggi harus bergantung pada abstraksi, bukan konkret. 
Status: main langsung membuat objek AnakAnjing, jadi belum sesuai DIP. 
6. Analisis 2 
1. cetak() adalah static method, artinya bisa dipanggil tanpa membuat objek. 
2. Di main(), kita langsung panggil cetak(). Tidak ada masalah karena static. 
3. Program akan menampilkan: 
Saya suka 
Java 
Kesimpulan: Static method berguna untuk fungsi yang tidak butuh data objek.              
Analisis 3 
1. myStaticMethod()  static, bisa langsung dipanggil di main() tanpa objek. 
2. PublicMethod() bukan static, harus dipanggil melalui objek 
(myObj.myPublicMethod()). 
3. Jika coba memanggil myPublicMethod() langsung di main()error. 
4 Output program: 
Static methods can be called without creating objects 
Public methods must be called by creating objects 
Kesimpulan: 
Static method  untuk fungsi umum yang tidak bergantung objek. 
Public (non-static) method  harus pakai objek.
