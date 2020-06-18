 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SATM {
    private static Object input;
    public static void main(String[] args) throws IOException {
        
        BufferedReader ulg=new BufferedReader (new InputStreamReader (System.in));
        String menu []= new String[100];
        //perulangan dapat dilakukan sebanyak 100 kali
        String ulang="y";
        //penginisialan dengan character y untuk pemanggilan menu utama
         int pilihan=0;
         int saldo=100000;
         //diberikan saldo utama sebesar RP 100.000,00
         int setor;
         int ambil;


    do{
        System.out.println(" \t\t\t  PT BANK INDONESIA JAYA\n      ");
        System.out.println(" \t\t\t___________________________\n ");
        System.out.println("\t\t\t     Menu Transaksi : \n");
        System.out.println("\t\t1 <--SETOR TABUNGAN \t\t INFORMASI SALDO--> 3 \n");
        System.out.println("\t\t2 <--AMBIL TABUNGAN \t\t          KELUAR--> 4 \n");
        System.out.println("\t\tPilihan Menu Transaksi (1/2/3/4) : ");
        String inputpilihan=JOptionPane.showInputDialog("masukkan menu pilihan ");
        int pilih=Integer.parseInt(inputpilihan);
        //penginputan data dari popup ke dalam system

     if(pilih==1) {
         System.out.println("Jumlah nominal uang yang disetorkan   = Rp ");
         String inputsetor=JOptionPane.showInputDialog("Jumlah nominal uang yang disetorkan = Rp  ");
         setor = Integer.parseInt(inputsetor);
        saldo=saldo+setor;
         System.out.println("Jumlah saldo tabungan akhir    = Rp "+saldo);
         System.out.println("\nTekan (y) untuk Kembali ke Menu Utama");
        ulang=ulg.readLine();
        //untuk melakukan pemanggilan menu utama
    
        }
     else if(pilih==2) {
         System.out.println("Jumlah nominal uang yang diambil      = Rp ");
         String inputambil=JOptionPane.showInputDialog("Jumlah nominal uang yang diambil  ");
         ambil = Integer.parseInt(inputambil);
        saldo=saldo-ambil;
                if(saldo<50000) {
                    System.out.println("Maaf, Pengambilan Uang Gagal.");
                    saldo=saldo+ambil;
                    //digunakan perintah (saldo+ambil) untuk mengembalikan saldo yang
                    //diambil pada perintah utama (saldo-ambil), karena meskipun 
                    //output menampilkan gagal!, namun perintah utama tetap dieksekusi.
                    System.out.println("Saldo minimum yang harus disisakan adalah Rp 50.000,00");
                }
                else {
                    System.out.println("Jumlah saldo tabungan akhir    = Rp"+saldo);
                }
           System.out.println("\nTekan (y) untuk Kembali ke Menu Utama");
        ulang=ulg.readLine();
        }
     else if (pilih==3) {   
         System.out.println("\t\t\tSaldo : Rp"+saldo);
          System.out.println("\nTekan (y) untuk Kembali ke Menu Utama");
       ulang=ulg.readLine();
        }
     else if(pilih==4) {
         System.out.println("trima kasih karena telah menggunakan layanan kami.... :)");
        
    System.exit(0);
    //perintah system untuk keluar dari program
        }
     else {
          System.out.println("maaf opsi yang anda masukkan tidak terdapat dalam MENU!");
           System.out.println("\nTekan (y) untuk Kembali ke Menu Utama");
          ulang=ulg.readLine();
     }
     
    }while(pilihan!=4);
    }

   
    
}

/*SimpleProject diatas merupakan gambaran sederhana dari pengoprasian mesin ATM
  seperti proses PENGECEKAN, PENAMBAHAN, dan PENARIKAN SALDO TABUNGAN. 
project ini menggunakan beberapa jenis jenis scrip diantaranya:
    1.decision (if/else)
        if/esle digunakan pada menu (pilihan==2) untuk membatasi jumlah Penarikan,
        selain itu penggunaan else if ditambahkan disini pada PIlLIHAN OPSI MENU 
        yang fungsinya sama dengan switch/case, yaitu melanjutkan input ke 
        pernyataan ke 2 dan seterusnya, jika pernyataan pertama tidak sesuai.
    2.Input/Output (Bufferedreader, JOptionPane)
        digunakan pada perintah-perintah inputan. 
    3.Looping (Do/While)
        untuk melakukan perulangan program jika bernilai true ("y").
dan selain menggunakan system Bufferedreader dan JOptionPane
saya juga menggunakan:
    import java.io.IOException;
    import java.io.InputStreamReader;
yang digunakan dalam proses perulangan untuk kembali memanggil MENU UTAMA
untuk diRead ulang dengan data input sebelumnya yang tetap tersimpan. */