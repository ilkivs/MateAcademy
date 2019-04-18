package main.java.HomeWork.hw1;

/*
    Task 1.1
 */

public class Bets {

    public int footballMatch(int real1, int real2, int bet1, int bet2) {
        int nothingGuessed = ((real1 > real2 && bet1 <= bet2) || (real1 < real2 && bet1 >= bet2) ||
                (real1 >= real2 && bet1 < bet2) || (real1 <= real2 && bet1 > bet2)) ? 0 : 1;
        return (real1 == bet1 && real2 == bet2) ? 2 : nothingGuessed;
    }
}
