/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok;

public class mainbalok {
public static void main(String[] args) {
        Balok constructor = new Balok (5,6,7);
        constructor.ComputeAndSetVolume();
        System.out.println(" Volume balok dengan panjang " + constructor.panjang + "lebar " + constructor.lebar + "tinggi" + constructor.tinggi + "adalah :" + constructor.getvolume() );
    }
    
}
