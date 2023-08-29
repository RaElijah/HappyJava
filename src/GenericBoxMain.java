public class GenericBoxMain {
    public static void main(String args[]) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5)); // 컴파일 오류가 발생한다.
        Integer intvalue = intBox.get();
        System.out.println(intvalue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String)objBox.get();
        System.out.println(str2);
    }
}
