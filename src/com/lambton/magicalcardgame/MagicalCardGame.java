package com.lambton.magicalcardgame;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MagicalCardGame {
    public static void main(String args[]){



        Scanner sc =new Scanner(System.in);


        MagicalCardGameModel gs=new MagicalCardGameModel();

        System.out.println("Guess the card from the stream?");
        String w[][]= { {"A","4","3"},
                {"K","7","2"},
                {"5","9","8"} };
        gs.setCardList(w);


                System.out.println(w[0][0]+" "+w[1][0]+" "+w[2][0]+" ");
        System.out.println(w[0][1]+" "+w[1][1]+" "+w[2][1]+" ");

        System.out.println(w[0][2]+" "+w[1][2]+" "+w[2][2]+" ");


        System.out.println();




        String a=sc.nextLine();
       // gs.firstShuffleColPos
    }
}
