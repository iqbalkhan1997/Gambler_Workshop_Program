package com.blz.gambler;

public class Gambler {
    public static final int STAKE=100; // Gambler with the stake
    public static final int BET=1; // Bet value per game

    public static void main(String[] args) {
        int totalStake=STAKE;

           System.out.println("Welcome to the Gambler Game");
        //initialising game value by random number
        int game=(int) (Math.random() * 10) % 2;
        if(game==1){
            totalStake=totalStake+BET; //Stake will increase as gambler wins the bet
            System.out.println("Gambler won the bet and now having "+totalStake);
        }else{
            totalStake=totalStake-BET; //Stake will decrease as gambler lost the bet
            System.out.println("Gambler lost the bet and now having "+totalStake);
        }
    }
}