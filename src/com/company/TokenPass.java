package com.company;

public class TokenPass
{
    int playerCount;
    int currentPlayer;
    int board[];

    public TokenPass(int playerCount)
    {
        this.playerCount = playerCount;
        board = new int[playerCount];
       for(int i = 0; i < playerCount; i++)
       {
           board[i] = 1 + (int) (10 * Math.random());
       }
        currentPlayer = (int) (playerCount * Math.random());
    }
    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while (numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }
    public int[] getBoard()
    {
        return board;
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }
}
