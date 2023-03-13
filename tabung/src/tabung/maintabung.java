/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabung;

public class maintabung {

    public static void main(String[] args) {
                Tabung tab = new Tabung(7, 20);
                System.out.println("Jari-jari Tabung : " + tab.getjariJari());
                System.out.println("Tinggi Tabung : " + tab.getTinggi());
                System.out.println("Volume Tabung = "+ tab.volumeResult());
    }
    
}
