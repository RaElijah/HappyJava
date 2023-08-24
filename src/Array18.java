import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        Arrays.sort(array);

        // 1 ~ 100 x라는 숫자를 생각하자.
        // 20, 커
        // 50 작아
        // 1~100
        // 1~50
        // 25~49
        int i = Arrays.binarySearch(array,4);
        System.out.println(i);
    }
}
