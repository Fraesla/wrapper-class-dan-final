Wrapper class :
Wrapper class adalah kelas yang objeknya 
membungkus atau berisi tipe data primitif.
Ketika kita membuat objek ke wrapper class,
kita bisa menyimpan tipe data primitif.
Dengan kata lain, kita bisa wrapper nilai
primitif ke dalam objek wrapper class.


Kegunaan wrapper class

1. Mengubah tipe data primitif menjadi objek. 
Objek diperlukan jika kita ingin memodifikasi
argumen yang diteruskan ke metode 
(karena tipe primitif dilewatkan oleh nilai).
2. Kelas-kelas dalam paket java.util hanya
menangani objek dan karenanya kelas wrapper 
membantu dalam kasus ini juga.
3. Struktur data dalam kerangka kerja 
Collection, seperti ArrayList dan Vector, 
hanya menyimpan objek (tipe referensi) dan
bukan tipe primitif.
4. Objek diperlukan untuk mendukung sinkronisasi 
dalam multithreading

Jenis wrapper class
1. Autoboxing :
Automatic konversi tipe primitif ke
objek wrapper class yang sesuai 
dikenal sebagai autoboxing. 
Misalnya - konversi int ke Integer, 
Long ke long, double ke Double, dll.

2. Unboxing :
Automatic konversi mengkonversi objek 
wrapper class ke tipe primitifnya yang
sesuai dikenal sebagai unboxing. 
Misalnya - konversi Integer ke int,
Long ke long, Double ke double, dll.

Final :
Keyword final dapat digunakan dengan
method dan variabel class. Final class 
tidaj bisa instantiated , final method tidak bisa
Overriddin dan final variabel tidak dapat
Reassigned.

Finally :
Keyword finally digunakan untuk membuat
code block yang mengikuti test block. 
Code block finally selalu dijalankan, 
terlepas dari apakah pengecualian telah terjadi.
Menggunakan finally block memungkinkan Anda untuk 
menjalankan pernyataan tipe clear apa pun yang ingin Anda jalankan,
terlepas dari apa yang terjadi dalam kode yang dilindungi.

Finallize :
Method digunakan tepat sebelum objek 
didestroyed dan dapat dipanggil sesaat 
sebelum pembuatan objek.
