import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyDate> mySet = new HashSet<>();
        mySet.add(new MyDate("kim", 500));
        mySet.add(new MyDate("lee", 200));
        mySet.add(new MyDate("hong", 700));
        mySet.add(new MyDate("hong", 700));

        Iterator<MyDate> iterator = mySet.iterator();
        while(iterator.hasNext()){
            MyDate myDate = iterator.next();
            System.out.println(myDate);
        }
    }
}

class MyDate{
    private String name;
    private int value;

    public MyDate(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals!!!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return value == myDate.value && Objects.equals(name, myDate.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode!!!");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
