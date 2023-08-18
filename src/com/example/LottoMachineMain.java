package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {
//        Ball b1 = new Ball(1);
//        Ball b2 = new Ball(2);
        Ball[] balls = new Ball[LottoMachine.MAX_Ball_COUNT];
//        balls[0] = new Ball(1);
//        balls[1] = new Ball(2);
//        ...
//        balls[44] = new Ball(45);
        for(int i = 0; i < LottoMachine.MAX_Ball_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }
        // LottoMachine인스턴스가 생성된다.체
        LottoMachine LottoMachine = new LottoMachineImpl();
        LottoMachine.setBalls(balls);
        LottoMachine.mix();
        Ball[] result = LottoMachine.getBalls();

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
