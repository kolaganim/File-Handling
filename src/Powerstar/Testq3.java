package Powerstar;
import java.util.*;
public class Testq3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        int thirdElement = numbers.get(2);
        System.out.println(thirdElement);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
