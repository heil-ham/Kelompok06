/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok6;

import java.util.Scanner;

/**
 *
 * @author Ardn
 */
class Luas2d{ // coba coba
    int tinggi = 0;
    int panjang = 0;
    int lebar = 0;
    double PHI = 3.14;
    int jari = 0;
    int sisiMiring = 0;
    int alas = 0;
    public void luas(){
    System.out.println(panjang*lebar);
}
    }
class persegi extends Luas2d{
    @Override
    public void luas(){
        panjang = 12;
        lebar = 14;
        System.out.println("Panjang persegi = "+panjang);
        System.out.println("Lebar = "+lebar);
        System.out.println("Luas persegi = "+panjang*lebar);
        System.out.println("Keliling persegi = "+((2*lebar)+(2*panjang)));
    }
}
class persegiPanjang extends Luas2d{
    @Override
    public void luas(){
        panjang = 10;
        lebar = 12;
        System.out.println("Panjang  = "+panjang);
        System.out.println("Lebar = "+lebar);
        System.out.println("Luas persegi panjang = "+panjang*lebar);
        System.out.println("Keliling persegi panjang = "+((2*lebar)+(2*panjang)));
    }
}
class segitiga extends Luas2d{
    @Override
    public void luas(){
        tinggi = 4;
        panjang = 6;
        sisiMiring = 5;
        System.out.println("Tinggi = "+tinggi);
        System.out.println("Alas = "+panjang);
        System.out.println("Luas segitiga = "+(0.5)*panjang*tinggi);
        System.out.println("Keliling segitiga = "+((2*sisiMiring)+(panjang)));
    }
}
class lingkaran extends Luas2d{
    @Override
    public void luas(){
        jari = 14;
        System.out.println("Jari-jari = "+jari);
        System.out.println("Luas lingkaran = "+PHI*jari*jari);
        System.out.println("Keliling persegi = "+(2*PHI*jari));
    }
}

public class KELOMPOK6 {
    public static void main(String[] args) {
        Luas2d luas2d = new Luas2d();
        Luas2d Lpersegi = new persegi();
        Luas2d LpersegiPanjang = new persegiPanjang();
        Luas2d Lsegitiga = new segitiga();
        Luas2d Llingkaran = new lingkaran();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        LimasPersegi limaspersegi = new LimasPersegi();
        LimasSegitig limassegit = new LimasSegitig();
        PrismaSegi prisma = new PrismaSegi();
        Bola bola = new Bola();
        
        Scanner sken = new Scanner(System.in);
        System.out.println("Masukkan pilihan"); //menampilkan di outputnya
        System.out.println("BANGUN 2D");//menampilkan di outputnya
        System.out.println("1.Persegi");//menampilkan di outputnya
        System.out.println("2.Persegi Panjang");//menampilkan di outputnya
        System.out.println("3.Segitiga");//menampilkan di outputnya
        System.out.println("4.Lingkaran");//menampilkan di outputnya
        System.out.println("BANGUN 3D");//menampilkan di outputnya
        System.out.println("5.Kubus");//menampilkan di outputnya
        System.out.println("6.balok");//menampilkan di outputnya
        System.out.println("7.tabung");//menampilkan di outputnya
        System.out.println("8.bola");//menampilkan di outputnya
        System.out.println("9.limas segitiga");//menampilkan di outputnya
        System.out.println("10.limas persegi");//menampilkan di outputnya
        System.out.println("11.prisma");//menampilkan di outputnya
        
        int pilih = sken.nextInt();
        switch(pilih){
            case 1 : Lpersegi.luas();
            break;
            case 2 : LpersegiPanjang.luas();
            break;
            case 3 : Lsegitiga.luas();
            break;
            case 4 : Llingkaran.luas();
            break;
            case 5 : kubus.volLuas();
            break;
            case 6 : balok.volLuas();
            break;
            case 7 : tabung.volLuas();
            break;
            case 8 : bola.volLuas();
            break;
            case 9 : limassegit.volLuas();
            break;
            case 10 : limaspersegi.volLuas();
            break;
            case 11 : prisma.volLuas();
            break;
            case 12 : Llingkaran.luas();
            break;
            
        }
           
    }   
}