package Tugas8.src.Prkatikum;

public abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    abstract double gaji();

    @Override
    public String toString() {
        return String.format("Pegawai %-7s%2s %s \nNo. KTP%10s %s", getClass().getSimpleName(), ":", getNama(), ":",
                getNoKTP());
    }
}
