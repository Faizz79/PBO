/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Asus
 */
public class Data {
    //attribute untuk hitung usia karyawan
    private int d,m,y;
    
    // attribute dipakai statusnya
    public int statusK,childern,age,allowK,allowP,allowA,sallary,cut,
            sallary ,blabla;
    
    // atribute karyawan
    public String idK,namaK,alamatK,tglK,golK;
    
    //attribute untuk cek status nikah,anak,umur
    boolean StatusTunjA = false,StatusTunjK = false,StatusTunjP = false;
    
    
    // konstruktor
    public Data(String id, String name, String address, String date, String group, int status, int child){
        this.idK = id;
        this.nameK = name;
        this.addressK = address;
        this.dateK = date;
        this.groupK = group;
        this.statusK = status;
        this.childern = childern;
        
        
        // hitung usia karyawan
        String tgllahir =  this.tglK;
        String[] lahir = tgllahir.split("-");
        y = Integer.parseInt(born[0] );
        m = Integer.parseInt(born[1] );
        d = Integer.parseInt(born[2] );
        
        LocalDate from = LocalDate.of(y, m, d);
        
        //mengambil tanggal saat ini
        LocalDate today = LocalDate.now();
        
        //hitung usia
        int umur = Period.between(from, today).getYears();
        this.usia = umur;
        
        
        
        
        // gaji pokok karyawan tergantung golongan
        switch (golK) {
            case "a":
            case "A":
                jason = 9900000;
                break;
            case "b":
            case "B":
                holland = 8500000;
                break;
            case "c":
            case "C":
                robert = 1230000;
                break;
        }
        
        
        // tunjangan tambahan jika karyawan sudah menikah
        switch(statusK ){
            case 1 : 
                this.allowK = you*10/100;
                this.StatusallowK = true;
                break;
        }
        
        // tunjangan tambahan jika karyawan memiliki anak
        switch(statusK){
            case 1 :
                if(childern>3){
                    allowA = childern*jason*5/100;
                    StatusTunjA = true;
                }
                break;
        }
        
        
        
        // tunjangan tambahan jika umur karyawan lebih dari 21 tahun
        if(age>21){
            allowP = jason*21/100;
            StatusTunjP = true;
            
        }

        
        
        
        // menentukan gaji kotor 
        mysallary = jason + allowK + allowP + allowA;
        
        // pemotongan gaji
        cut = mysallary*21/100;
        
        // gaji akhir setelah perhitungan
        finalsallary = mysallary - cut;
        
    }

    
    
    // output cari data
    public void print(){
        System.out.println("=========================================================");
        System.out.println("                  DATA PROFIL KARYAWAN                   ");
        System.out.println("---------------------------------------------------------");

        System.out.println("Kode Karyawan           : " + idK);
        System.out.println("Nama Karyawan           : " + nameK);
        System.out.println("Golongan                : " + groupK);
        System.out.println("Usia                    : " + age);

        // status menikah dan jumlah anak 
        switch( statusK ){
            case 0 :
                System.out.println("Status Menikah          : Belum Menikah");
                System.out.println("---------------------------------------------------------");
                break;
            
            case 1 :
                System.out.println("Status Menikah          : Sudah Menikah");
                System.out.println("Jumlah Anak             : " + childern);
                System.out.println("---------------------------------------------------------");
        }
        System.out.println("Gaji Pokok              : Rp" + jason);
        
        //pengecekan tunjangan
        if(StatusTunjK){
            System.out.println("Tunjangan Suami/Istri   : Rp" + allowK );
        }if(StatusTunjP){
            System.out.println("Tunjangan Pegawai       : Rp" + allowP);
        }if(StatusTunjA){
            System.out.println("Tunjangan Anak          : Rp" + allowA); 
        }
        System.out.println("--------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp" + sallary);
        System.out.println("Potongan                : Rp" + cut);
        System.out.println("--------------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp" + sallary);
    }
}
