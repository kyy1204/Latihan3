package latihan3;
  //Nama : Muhammad Rezkyan Noor, NPM : 2310010087, Kelas : 4c
public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        
        System.out.println("Luas Persegi =" +hasil);
    }
     public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang =" +hasil);
     }

    public int getHasil() {
        return hasil;
    }

    public Rumus(int sisi, int panjang, int lebar, int hasil) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = hasil;
    }
     
     
}