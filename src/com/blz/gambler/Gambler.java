package com.blz.gambler;

public class Gambler {
    public static final int STAKE=100; // Gambler with the stake
    public static final int BET=1; // Bet value per game
    public static final int PERCENTAGE_50_STAKE=(STAKE/100)*50; // 50% of stake value
    public static final int HIGH_LIMIT=STAKE+PERCENTAGE_50_STAKE;
    public static final int LOW_LIMIT=STAKE-PERCENTAGE_50_STAKE;
    public static final int START_DAY=1;
    public static final int MAX_DAY=20;
    public static final int STAKES_PER_DAY=50;

    public static final int START_DOLLARS=0;


    public static void main(String[] args) {
        System.out.println("Welcome to the Gambler Game");

        int days = START_DAY;
        int totalDollars = START_DOLLARS;

            //for 20 days ,To know gambler's stakes each day
        for (days = START_DAY; days <= MAX_DAY; days++) {
            int totalStake = STAKE;

            //Gambler should either earn 150 or loose 50
            while (totalStake < HIGH_LIMIT && totalStake > LOW_LIMIT) {
                //initialising game value by random number
                int luck = (int) (Math.random() * 10) % 2;
                if (luck == 1) {
                    totalStake = totalStake + BET; //Stake will increase as gambler wins the bet
                } else {
                    totalStake = totalStake - BET; //Stake will decrease as gambler lost the bet
                }
            }
            if (totalStake == HIGH_LIMIT) {
                totalDollars += STAKES_PER_DAY;
                System.out.println("Gambler won by " +totalDollars+" dollars on day "+days);
            } else {
                totalDollars -= STAKES_PER_DAY;
                System.out.println("Gambler lost by " +totalDollars+" dollars on day "+days);
            }
        }
        if(totalDollars>START_DOLLARS){
            System.out.println("Gambler won " +totalDollars);
        } else {
            System.out.println("Gambler lost " + totalDollars);
        }
    }
}
