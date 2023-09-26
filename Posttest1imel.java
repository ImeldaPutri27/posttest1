/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1imel;
import java.util.ArrayList;

public class Posttest1imel {

    public static void main(String[] args) {
        Restosushi pembeli1 = new
Restosushi ("'kami mentai roll'","'imel'",30000);
        Restosushi pembeli2 = new
Restosushi ("'spicy beef roll'","'pinka'", 35000);
        Restosushi pembeli3 = new
Restosushi ("'chiken katsu roll'","'haris'",25000);
        Restosushi pembeli4 = new
Restosushi ("'cheese crab roll'","'taufik'",30000);
        Restosushi pembeli5 = new
Restosushi ("'spicy crab roll'","'alip'",35000);

        ArrayList<Restosushi> buyers = new ArrayList<>();
        buyers.add (pembeli1);
        buyers.add (pembeli2);
        buyers.add (pembeli3);
        buyers.add (pembeli4);
        buyers.add (pembeli5);
        
        for (Restosushi dataPembeli: buyers){
            String sushi = dataPembeli.menuSushi;
            String nama = dataPembeli.namaPembeli;
            int harga = dataPembeli.hargaSushi;
            System.out.println("menu :"+sushi+"|"+"Nama Pembeli :"+nama+"|"+"Harga sushi"+harga);
                    
        }
    }
}

