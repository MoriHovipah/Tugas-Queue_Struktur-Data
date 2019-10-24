/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_strukdat.queue._mori_hovipah;

/**
 *
 * @author Mori Hovipah
 */
public class Tugas_StrukDatQueue_Mori_Hovipah {
    static int tail;
    static int jadwal;
    static String peserta[];

    public Tugas_StrukDatQueue_Mori_Hovipah (int DayaTampung){
        tail=0;
        jadwal = DayaTampung;
        peserta = new String[jadwal];
    }

    public  boolean isEmpty (){
        return tail <=0;
    }

    public boolean isFull (){
        return tail >= jadwal;
    }

    public void add (String input) {
         
            if(isFull()){
                System.out.println("Daftar Peserta Test Wawancara Hari Ini Sudah Penuh, Silahkan Daftar Dikemudian Hari");
                System.out.println("--------------------------------------------");
            } else {
                peserta[tail++] = input;
                    System.out.println("+ "+input+" Mendaftar Test Wawancara");
                    System.out.println("--------------------------------------------");
                    System.out.println("");
            }
            
        
    }

      public void remove()
    {
        if(isEmpty()){
           System.out.println("Semua Peserta Test Wawancara Hari Ini Sudah Mengikuti Test");
           System.out.println("--------------------------------------------");
            
        }else
        {
            String pop=peserta[0];
            int i=1;
            System.out.println("- "+pop+" Telah Selesai Mengikuti Test Wawancara");
            System.out.println("--------------------------------------------");
            System.out.println("");
            while(i<tail)
            {
                peserta[i-1]=peserta[i];
                i++;
            }
            tail--;
            peserta[tail]="";
        }
    }
    public void cetak(){
        System.out.println("Daftar Peserta Test Wawancara");
        for (int i =0; i<tail; i++){
            System.out.println((i+1)+")"+peserta[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Tugas_StrukDatQueue_Mori_Hovipah a = new Tugas_StrukDatQueue_Mori_Hovipah(5);
        a.add("Mori Hovipah");
        a.add("Yayuk Wulandari");
        a.add("Rahmah Miya Juwita");
        a.add("Devi Julisca Sari");
        a.add("Janaria Sapitri");
        System.out.println("");
        a.cetak();
        a.remove();
        a.cetak();
        a.remove();
        a.cetak();
        a.remove();
        a.cetak();
    }
}
