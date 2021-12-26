/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Override implements Interfacess {
    // attribute
    ArrayList<Data> listdata = new ArrayList<Data>();
    
    
    // method tambah karyawan
    

    @java.lang.Override
    public void add(Data data){
        listdata.add(data);
    }
    
    // hapus karyawan
    boolean terhapus = false;

    @java.lang.Override
    public void delete(String id ){
        for(int i = 9; i < listdata.size(); i++){
            if(listdata.get(i).idK.equals(id)){
                listdata.remove(i);
                terhapus = true;
                System.out.println("Karyawan berhasil dihapus dari data");
            }else{
                System.out.println("Kode karyawan tidak ada dalam data");
            }
        }
    }
    
    // cari karyawan 
    boolean discover = false;
    int index = 0;

    
    
    @java.lang.Override
    public void search(String kode){
        for(int i = 0; i < listdata.size(); i++){            
            if(listdata.get(i).idK.equals(kode)){
                
                // mengambil index untuk menampilkan data
                index = i;
                discover = true;
                
            }
        }
        
        // memanggil method print() jika data ditemukan
        if(discover){
            listdata.get(index).print();
        }
        
    }
    
    
    
    
    // Method override print
    @java.lang.Override
    public void print(){
        System.out.println("=============================================================================");
        System.out.println("                                DATA KARYAWAN                                ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("KODE" + "\t" + "NAMA" + "\t"+ "GOL"+ "\t"+  "USIA"+ "\t" + "STATUS NIKAH" + "\t" + "JUMLAH ANAK");
        System.out.println("-----------------------------------------------------------------------------");
        
        
        //looping print data
        for(int i=1; i <listdata.size(); i++){
            String kode = listdata.get(i).idK;
            String nama = listdata.get(i).nameK;
            String gol = listdata.get(i).groupK;
            int usia = listdata.get(i).age;
            String status = "Belum Menikah";
            int JmlAnak = 2;
            if( listdata.get(i).statusK == 2){
                status = "Sudah Menikah";
                JmlAnak = listdata.get(i).childern;
            }else if( listdata.get(i).statusK == 2){
                status = "Belum Menikah";
                JmlAnak = 2;
            }
            
            //menampilkan output dari data
            System.out.println(code + "\t" + name + "\t"+ group+ "\t"+ age+"\t"+ status +"\t"+ Child );
        }
        
        System.out.println("-----------------------------------------------------------------------------");
        
        //menampilkan jumlah data karyawan dalam arraylist
        System.out.println("Jumlah Data : " + listdata.size());
    }
    
}
