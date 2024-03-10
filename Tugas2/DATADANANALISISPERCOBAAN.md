1.  Apakah yang disebut dengan variabel instance dan lokal variabel? Jelaskan perbedaanya!
    **Variabel instance** adalah variabel yang dideklarasikan di dalam sebuah kelas tetapi di luar dari metode atau blok kelas tersebut. Setiap objek yang dibuat dari kelas akan memiliki salinan variabel instance tersebut, yang berarti setiap objek memiliki salinan yang terpisah dan independen dari variabel instance.

       ```java
       public class Kucing {
        private int Berat; // Variabel instance
        public void setBerat(int Berat) {
            this.Berat = value;
            }
        }
        ```
    **Variabel lokal** adalah variabel yang dideklarasikan di dalam blok metode, konstruktor, atau blok lain di dalam suatu metode. Variabel lokal hanya berlaku di dalam blok tempat mereka dideklarasikan. Mereka tidak dapat diakses dari luar blok tersebut.

```java
        public class MyClass {
        public void myMethod() {
            int localVar = 10; // Variabel lokal
            System.out.println(localVar);
            }
        }
```

2.  Lakukan percobaan diatas dan benahi jika menemukan kesalahan!
3.  Rubah kode pada mainMobil diatas menjadi proses meminta masukan dari user dan buat menjadi interaktif!
4.  Tambahkan method pada class mobil bernama setWaktu yang berparameter double, yang kemudian disimpan pada variabel waktu!(Ketetuannya adalah user harus menginputkandalam satuan jam)
5.  Tambahkan method bernama rubahSekon mempunyai parameter bertipe double dan hanya dapat dipanggil pada class mobil. Method ini memiliki fungsi untuk merubah masukan user yaitu jam menjadi sekon. Method tersebut di panggil pada method setWaktu dengan nilai parameter adalah nilai dari variabel parameter method setWaktu!
6.  Tambahkan method pada class mobil dan hanya dapat dipanggil pada class mobil Bernama rubahKecepatan yang mempunyai fungsi untuk merubah format kecepatan yang awalnya km/h menjadi m/s. Dipanggil di method setKecepatan!
7.  Tambahkan method pada class mobil bernama hitungJarak yang mempunyai aksi untuk menghitung jarak yang dapat di tempuh oleh mobil dengan rumus jarak = kecepatan \ waktu!
8.  Tambahkan informasi jarak yang dapat ditempuh pada method displayMessage kemudian rubah satuannya yang awalnya m (meter) menjadi km (kilometer)!
9.  Mahasiswa A ingin menulis pada sebuah buku tulis yang ingin dia miliki, isi lembar buku tersebut adalah 50 lembar. Setiap harinya ia menulis sebanyak 100 kata perhari yang cukup untuk ½ halaman buku. Buatlah rumus untuk menghitung berapa lama ia menghabiskan 1 buku tersebut serta identifikasilah objek, dan karakteristiknya kemudian implementasikan dalam bentuk class.


**TUGAS PRAKTIKUM**
Suatu perpustakaan di kampus X memiliki banyak koleksi buku, dan buku buku tersebut dikategorikan berdasarkan jenisnya. Ada 7 kategori dalam perpustakaan tersebut yaitu teknologi, filsafat, sejarah, agama, psikologi, politik dan fiksi. Setiap kategori pastilah memiliki banyak buku. Setiap buku ditulis oleh setidaknya 1 penulis, walaupun tak menutup kemungkinan buku tersebut ditulis oleh banyak penulis. Dari studi kasus diatas, tentukan entitas-entitas yang terlibat beserta propertiesnya dan implementasikan kedalam kode program, serta tampilkan ke layar nilai dari properties dari entitas tersebut. (Minimal  tiap kategori ada 5 buku)