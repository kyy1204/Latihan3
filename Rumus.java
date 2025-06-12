package Latihan3;

public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    
        public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
        }
        
    // Method menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    // Method menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

}