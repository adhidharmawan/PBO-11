/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author User
 */
public class ArrayProcessing {
    //aray list data

    ArrayList<Integer> dataBil = new ArrayList<Integer>();  
    Integer n;
    Integer urut;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            dataBil.add(input.nextInt());
        }
        
    }
    
    
    double hitungRerata(ArrayList<Integer> data){
        double sum = 0;
        for(Integer i: data){
           sum += i;
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    
    Integer cariMax(ArrayList<Integer> data){
        Integer maks = Collections.max(this.dataBil);
        return maks;
    }
    
    Integer cariMin(ArrayList<Integer> data){
        Integer min = Collections.min(this.dataBil);
        return min;
    }
    
    int urutkan(ArrayList<Integer> data){
        int urut = 0;
        for(int i = 0; i<(this.n-1); i++){
            for(int j=0; j<(this.n-i-1); j++){
                if(this.dataBil.get(j) > this.dataBil.get(j+1)){
                    this.dataBil.set(j, this.dataBil.get(j));
                    this.dataBil.set(j, this.dataBil.get(j+1));
                    this.dataBil.set(j+1, urut);
                }
            }
        }
                System.out.println("Urutan Bilangan: ");
        for(int i=0; i<this.n; i++){
            System.out.print(this.dataBil.get(i) + " ");
        }
        return urut;
    }

    void output(){
        System.out.println("-----------------------------------");
        System.out.println("Rerata data : " + this.hitungRerata(this.dataBil));
        System.out.println("Data Maks   : " + this.cariMax(this.dataBil));
        System.out.println("Data Min    : " + this.cariMin(this.dataBil));
        System.out.println("Sortir      : " + this.urutkan(this.dataBil));
       
    }
}
