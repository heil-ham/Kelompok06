package kelompok6;
import java.util.*;
/**
 *
 * @author Ilham Fitri Ardiansyah
 */
    
interface volu{
        public void volLuas();
}

class Kubus implements volu{
    
@Override
    public void volLuas(){
    int panjang = 10;
    System.out.println("Sisi nya = "+panjang);
    System.out.println("Volume = "+panjang*panjang);
    System.out.println("Luas Permukaan = "+6*panjang*panjang);
}
}
class Balok implements volu{
    public void volLuas(){
    int panjang = 10;
    int lebar = 12;
    int tinggi = 8;
    System.out.println("panjang = "+panjang+" lebar = "+lebar+" tinggi = "+tinggi);
    System.out.println("Luas Permukaan = "+((2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi)));
        System.out.println("volume = "+panjang*lebar*tinggi);
    }
}
class Bola implements volu{
    public void volLuas(){
    int jari = 7;
    double PHI = 3.14;
        System.out.println("Jari jari = "+jari);
        System.out.println("Volume bola = "+((4*PHI*jari*jari*jari)/3));
        System.out.println("Luas Permukaan = "+4*PHI*jari*jari);
    }
}
class LimasSegitig implements volu{
    public void volLuas(){
    int luasAlas = 10;
    int tinggi = 18;
        System.out.println("Luas alas = "+luasAlas);
        System.out.println("Tinggi limas s'tiga = "+tinggi);
        System.out.println("Volume limas = "+(luasAlas*tinggi)/3);
        System.out.println("Luas permukaan = "+(luasAlas*4));
    }
    
}
class LimasPersegi implements volu{
    public void volLuas(){
    int alas = 6;
    int tinggi = 5;
    int tinggiLimas = 4;
        System.out.println("Luas alas = "+alas*alas);
        System.out.println("Tinggi limas = "+tinggiLimas);
        System.out.println("Volume = "+(alas*alas*tinggiLimas)/3);
        System.out.println("Luas permukaan = "+(alas*alas+4*0.5*alas*tinggi));
    }
}
class PrismaSegi implements volu{
    public void volLuas(){
    int luasAlas = 48;
    int tinggi = 12;
    int kelilingAlas = 24;
        System.out.println("Luas alas = "+luasAlas);
        System.out.println("Tinggi prisma = "+tinggi);
        System.out.println("volume = "+luasAlas*tinggi);
        System.out.println("luas permukaan = "+(2*luasAlas)+(kelilingAlas*tinggi));
    }
}
class Tabung implements volu{
    public void volLuas(){
    int luasAlas = 4;
    int tinggi = 28;
    int jari = 7;
    double PHI = 3.14;
        System.out.println("Jari jari = "+jari);
        System.out.println("Tinggi tabung = "+tinggi);
        System.out.println("volume tabung = "+PHI*jari*jari*tinggi);
        System.out.println("Luas permukaan = "+2*PHI*jari*(jari+tinggi));
    }
}



