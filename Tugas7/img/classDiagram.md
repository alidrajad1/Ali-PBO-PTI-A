--------------------------------
|             Kue              |
--------------------------------
| - nama: String               |
| - harga: double              |
--------------------------------
| + Kue(nama: String, harga: double) |
| + hitungHarga(): double      |
| + toString(): String         |
--------------------------------
                  |
                  |
          ---------------
          |          |
  ----------------   ----------------
  | KuePesanan |   |   KueJadi    |
  ----------------   ----------------
  | - berat: double |   | - jumlah: double |
  ----------------   ----------------
  | + KuePesanan(nama: String, harga: double, berat: double) |   | + KueJadi(nama: String, harga: double, jumlah: double) |
  | + hitungHarga(): double      |   | + hitungHarga(): double      |
  | + toString(): String         |   | + toString(): String         |
  ----------------   ----------------
