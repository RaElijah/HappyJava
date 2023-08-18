package com.example;

public interface LottoMachine {
    int MAX_Ball_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls);
    public void mix();
    public Ball[] getBalls();
}
