package com.lambton.magicalcardgame;

public class MagicalCardGameModel {

    String firstShuffleColPos;
    String secShuffleColPos;
    String [][]cardList;
    String [][]firstShuffle;
    String [][]firstShuffleresult;
    String [][]secShuffle=null;
    String guessedCard;

    public MagicalCardGameModel(String firstShuffleColPos, String secShuffleColPos, String[][] cardList, String[][] firstShuffle, String[][] secShuffle, String guessedCard) {
        this.firstShuffleColPos = firstShuffleColPos;
        this.secShuffleColPos = secShuffleColPos;
        this.cardList = cardList;
        this.firstShuffle = firstShuffle;
        this.secShuffle = secShuffle;
        this.guessedCard = guessedCard;
    }

    public MagicalCardGameModel(MagicalCardGameModel model) {


    }

    public MagicalCardGameModel() {

    }

    public String getFirstShuffleColPos() {

        return firstShuffleColPos;
    }

    public void setFirstShuffleColPos(String firstShuffleColPos) {
        System.out.println("inside set first shuffle"+firstShuffleColPos);
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }

    public void setCardList(String[][] cardList) {
        this.cardList = cardList;
    }

    public String[][] getFirstShuffle() {
        return firstShuffle;
    }

    public void setFirstShuffle(String[][] firstShuffle) {
        System.out.println("inside setfirstshuffle");
        if(this.firstShuffleColPos=="0"){




        this.firstShuffleresult[1][0]=firstShuffle[0][0];
            this.firstShuffleresult[1][1]=firstShuffle[1][0];
            this.firstShuffleresult[1][2]=firstShuffle[2][0];
            this.firstShuffleresult[0][0]=firstShuffle[0][1];
            this.firstShuffleresult[0][1]=firstShuffle[1][1];
            this.firstShuffleresult[0][2]=firstShuffle[2][1];
            this.firstShuffleresult[2][0]=firstShuffle[0][2];
            this.firstShuffleresult[2][1]=firstShuffle[1][2];
            this.firstShuffleresult[2][2]=firstShuffle[2][2];


       this.firstShuffle = this.firstShuffleresult;
            System.out.println(firstShuffle[0][0]+" "+firstShuffle[1][0]+" "+firstShuffle[2][0]+" ");
            System.out.println(firstShuffle[0][1]+" "+firstShuffle[1][1]+" "+firstShuffle[2][1]+" ");
            System.out.println(firstShuffle[0][2]+" "+firstShuffle[1][2]+" "+firstShuffle[2][2]+" ");


    }

    }

    public String[][] getSecShuffle() {
        return secShuffle;
    }

    public void setSecShuffle(String[][] secShuffle) {
        this.secShuffle = secShuffle;
    }

    public String getGuessedCard() {
        return guessedCard;
    }

    public void setGuessedCard(String guessedCard) {
        this.guessedCard = guessedCard;
    }
}

