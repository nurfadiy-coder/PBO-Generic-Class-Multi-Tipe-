import java.util.*;

class Pair<T1, T2> { 
    public T1 first; 
    public T2 second; 
    public Pair(T1 first, T2 second) { 
        this.first = first; this.second = second; 
    } 
    public void showTypes() { 
    System.out.println(first.getClass().getName() + " & " + second.getClass().getName()); 
    } 
    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Programming");
        Pair<Double, Boolean> p2 = new Pair<>(3.14, true);

        p1.showTypes();
        p2.showTypes();

        System.out.println("Original Pair: " + p1.first + " & " + p1.second);
        Pair<String, Integer> swappedP1 = p1.swap();
        System.out.println("Swapped Pair: " + swappedP1.first + " & " + swappedP1.second);

        System.out.println("Original Pair: " + p2.first + " & " + p2.second);
        Pair<Boolean, Double> swappedP2 = p2.swap();
        System.out.println("Swapped Pair: " + swappedP2.first + " & " + swappedP2.second);
    }
}
