/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class MyProject {
    ArrayList<String> dataBil = new ArrayList<String>();
    
    int menu;
    void input(){
        while(true){
            Scanner masuk = new Scanner(System.in);
        System.out.println("Menu Data ArrayList: \n"
                + "1. Tambah data \n"
                + "2. Cari data\n"
                + "3. Hapus Data\n"
                + "4. Tampil Data\n"
                + "5. Keluar");
        System.out.print("Pilih nomor berapa: ");
        menu = masuk.nextInt();
        
        switch(menu){
            case 1 :
                System.out.print("Masukkan data string: ");
                this.dataBil.add(masuk.next());
                System.out.println("Daftar string dalam array list: "+this.dataBil);
                break;
            case 2 :
                System.out.print("String yang mau dicari: ");
                    masuk.nextLine();
                    String find = masuk.nextLine();
                    int index = this.dataBil.indexOf(find);
                    if(index >= 0){
                        System.out.println("String '" + find + "' ada di index ke" + index + " di dalam data\n");
                    } else{
                        System.out.println("String '" + find + "' tidak ada dalam data\n");
                    }
                break;
            case 3 :
                System.out.print("String yang mau dihapus: ");
                    masuk.nextLine();
                    String delete = masuk.nextLine();
                    int remove = this.dataBil.indexOf(delete);
                    if(remove >= 0){
                        this.dataBil.remove(remove);
                        System.out.println("String '" + delete + "' sudah dihapus di dalam data");
                    } else{
                        System.out.println("String '" + delete + "' tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil + "\n");
                    break;
            case 4 :
                System.out.println("Daftar string dalam array list: " + this.dataBil);
                break;
            case 5 :
                System.out.println("Keluar...");
                System.exit(0);
                break;
            }
        }   
    }
}
