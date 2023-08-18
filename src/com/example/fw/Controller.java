package com.example.fw;

/*
Controller의 종류가 여러개더라.
초기화 - 같은 코드
실행 - 다른 코드?
마무리 - 같은 코드
 */
public abstract class Controller {
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    protected final void close() {
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run();
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
