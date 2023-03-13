/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok;
import java.util.Scanner;

public class Balok {
public int panjang;
public int lebar;
public int tinggi;
public int volume;

    public Balok (int panjang, int lebar, int tinggi){
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;}
    
    public void ComputeAndSetVolume() {
        int calculate_vol = this.panjang * this.lebar * this.tinggi;
        this.volume = calculate_vol;
    }
    
  public int getvolume(){
  return this.volume;}
    
}
