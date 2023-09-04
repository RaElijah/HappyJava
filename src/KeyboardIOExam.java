import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공)
        // 화면에 출력 : System.out (PrintStream 주인공)
        // 키보드로 입력받는다는건 문자를 입력받는 것 : char 단위 입출력
        // char단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferedReader라는 클래스틑 readLine이라는 메소드를 가지고 있다.
        //          더이상 읽어들일것이 없으면(EOF) null을 반환
        //          장식!!
        // 한줄 쓰기 : PrintStream, PrintWriter

        // BufferedReader x
        // CharReader x - 문자로부터 입력
        // FilterReader x - 장식. Reader를 넣어줘야 한다
        // InputStreamReader (InputSteram in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null) { // 한줄 입력받는다. command + D
            System.out.println("읽어들인값 : " + line);
        }
    }
}
