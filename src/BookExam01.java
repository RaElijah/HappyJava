public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
//          b1.pric = 100; // private field는 직접 접근한다.
//          System.out,printlm(b1.price);

        b1.setTitle("김성박의 즐거운 자바");
        b1.setPrice(500);
        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());
    }
}
