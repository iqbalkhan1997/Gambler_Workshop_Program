package com.blz.gambler;

public class Gambler {
    public static final int STAKE=100; // Gambler with the stake
    public static final int BET=1; // Bet value per game
    public static final int PERCENTAGE_50_STAKE=(STAKE/100)*50; // 50% of stake value
    public static final int HIGH_LIMIT=STAKE+PERCENTAGE_50_STAKE;
    public static final int LOW_LIMIT=STAKE-PERCENTAGE_50_STAKE;

    public static void main(String[] args) {
        System.out.println("Welcome to the Gambler Game");
        int totalStake = STAKE;

        while (totalStake < HIGH_LIMIT && totalStake > LOW_LIMIT) {
            //initialising game value by random number
            int game = (int) (Math.random() * 10) % 2;
            if (game == 1) {
                totalStake = totalStake + BET; //Stake will increase as gambler wins the bet
                System.out.println("Gambler won the bet and now having " + totalStake);
            } else {
                totalStake = totalStake - BET; //Stake will decrease as gambler lost the bet
                System.out.println("Gambler lost the bet and now having " + totalStake);
            }
        }
        if(totalStake==HIGH_LIMIT){
            System.out.println("Gambler won by "+totalStake);
        } else {
            System.out.println("Gambler lost by "+totalStake);
        }
    }
}