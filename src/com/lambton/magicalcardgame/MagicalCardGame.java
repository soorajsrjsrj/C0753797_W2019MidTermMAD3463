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
        System.out.println();


        String a=sc.nextLine();
       // gs.firstShuffleColPos
    }
}
