package com.lambton.magicalcardgame;

public class MagicalCardGameModel {

    String firstShuffleColPos;
    String secShuffleColPos;
    String [][]cardList;
    String [][]firstShuffle=null;
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
        this.firstShuffle = firstShuffle;
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

