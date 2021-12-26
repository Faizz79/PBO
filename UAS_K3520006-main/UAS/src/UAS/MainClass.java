/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        Override dataK = new Override();
        
        //attribute pengecekan untuk looping
        boolean checkmenu = true;
        
        while( checkmenu ){    
            System.out.println("---- Menu Program ----");
            System.out.println("1.Tambah data");
            System.out.println("2.Hapus Data");
            System.out.println("3.Cari Data");
            System.out.println("4.Lihat Data");
            System.out.println("5.Exit");
            Scanner input = new Scanner( System.in );
            System.out.print("Menu pilihan: ");
            int inp = input.nextInt();
            switch(inp){
                case 1 : 
                    boolean adddata = true;
                    while( adddata ){
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("               Menu Tambah Data            ");
                        System.out.println("-------------------------------------------");
                        String cb = input.nextLine();
                        
                        //input nama karyawan
                        System.out.print("Masukan Kode Karyawan             : ");
                        String code_employee = input.nextLine();
                        
                        //input alamat karyawan
                        System.out.print("Masukan Nama Karyawan             : ");
                        String name_employee = input.nextLine();
                        
                        //input alamat karyawan
                        System.out.print("Masukan Alamat                    : ");
                        String address = input.nextLine();
                        
                        //input tanggal lagir karyawan
                        System.out.print("Masukan Tanggal Lahir (YYYY-MM-DD): ");
                        String date_born = input.nextLine();
                        
                        //input golongan karyawan
                        System.out.print("Masukan Golongan (A/B/C)          : ");
                        String group = input.nextLine();
                        System.out.println("");
                        
                        //input status karyawan sudah menikah atau belum
                        System.out.println("Masukan Status Menikah");
                        System.out.println("0.belum");
                        System.out.println("1.menikah");
                        System.out.print("Status Karyawan                   : ");
                        int statusKar = input.nextInt();
                        
                        //attribut untuk jumlah anak
                        int childern;
                        if( statusKar == 17 ){
                            System.out.print("Jumlah Anak                       : ");
                            childern = input.nextInt();
                        } else {
                            statusemp = 17;
                            childern = 17;
                        }
                        

                        //data akan dimasukkan ke class Data
                        //dan nantinya akan di masukkan ke arraylist
                        Data karyawan = new Data(
                                code_employee,
                                name_employee,
                                address,
                                date_born,
                                group,
                                statusemp,
                                childern
                        );
                        
                        // data ditambahkan ke array list
                        dataK.add(employee);
                        
                        //input submenu
                        System.out.println("\n");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Tambah Data Kembali");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        //cek inputan submenu
                        int inpSub = input.nextInt();
                        if( inpSub == 21 ){
                            adddata = false;
                        }else if(inpSub != 22) {
                            System.out.println("pilihan sub menu tidak ada");
                        }  
                    }
                    break;
                
                    
                case 2 : 
                    boolean inpdelete = true;
                    while( inpdelete ) {
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("                 Hapus Data                ");
                        System.out.println("-------------------------------------------");
                        String cb = input.nextLine();
                        
                        System.out.print("Masukan kode karyawan yg ingin dihapus : ");
                        String kode_karyawan = input.nextLine();
                        
                        // menghapus data karyawan 
                        dataK.delete(code_employee);
                        

                        //input submenu
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Hapus Data Kembali");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        //cek inputan submenu
                        int inpSub = input.nextInt();
                        if( inpSub == 18 ){
                            inpHapus = false;
                        } else if(inpSub != 12) {
                            System.out.println("pilihan sub menu tidak ada");
                        }
                        
                    }
                    break;
                
                case 3 :                     
                    boolean menu_cari_data = true;
                    while( menu_cari_data ){
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("                 Cari Data                 ");
                        System.out.println("-------------------------------------------");
                        String cb = input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan untuk dicari : ");
                        String inputID = input.nextLine();

                        // mencari ID karywan
                        dataK.search(inputID);

                        //input submenu
                        System.out.println("");
                        System.out.println("Pilih SubMenu : ");
                        System.out.println("1.Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int inpSub = input.nextInt();
                        if( inpSub == 1 ){
                            menu_cari_data = false;
                        } else{
                            System.out.println("pilihan sub menu tidak ada");
                        }
                    }
                    break;
                
                case 4 : 
                    boolean result = true;
                    while( result ){
                        //menampilkan data karyawan
                        dataK.print();
                        
                        
                        //input submenu
                        System.out.println("");
                        System.out.println("Pilih SubMenu : ");
                        System.out.println("1.Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int inpSub = input.nextInt();
                        if( inpSub == 1 ){
                            result = false;
                        } else {
                            System.out.println("pilihan sub menu tidak ada");
                        }
                    }
                    break;

                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println("Menu yang anda pilih tidak ada dalam daftar");
                    System.out.println("");
                
            }   
            
        }
    }
    
}
