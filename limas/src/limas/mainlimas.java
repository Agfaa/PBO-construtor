/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limas;
import java.util.Scanner;

public class mainlimas {

    public static void main(String[] args) {
                Limas LimasS4 = new Limas(8, 9, 10);
                System.out.println("Panjang Alas : " + LimasS4.getPanjangAlas());
                System.out.println("Lebar Alas : " + LimasS4.getLebarAlas());
                System.out.println("Tinggi Limas : " + LimasS4.getTinggiLimas());
                System.out.println("Volume Limas = "+ LimasS4.volumeResult());
    }
    
}
