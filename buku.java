public class buku {
    private String judul;
    private String penulis;
    private int tahunterbit;

    public buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunterbit = tahun;
    }

    @Override
    public String toString() {
        return "Judul Buku : " + judul + ", Nama Penulis : " + penulis + ", Tahun Terbit : " + tahunterbit;
    }
}