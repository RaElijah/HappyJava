public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String prodict = vm1.pushProductButton(100);
    //    vm1.printVersion(); // static한 메소드는 레퍼런스변수형.static메소드()
        System.out.println(prodict);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}
// javac Hello.java
// Hello.java Hello.class
// java Hello
// 틀린답 ) 현재 폴더에서 찾는다.
// 정답 ) CLASSPATH 경로에서 Hello클래스를 찾아서 실행한다. CLASSPATH=. 이라고 잡혀있다고 생각하자.

// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain
// VendingMachineMain을 어디서 찾아서 실행할까요?