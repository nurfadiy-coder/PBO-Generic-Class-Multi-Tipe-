public class Pair<T1, T2> { 
    private T1 first; 
    private T2 second; 
    public Pair(T1 first, T2 second) { 
        this.first = first; this.second = second; 
    } 
    Pair<Integer, String> p1 = new Pair<>(1, "Programming");
    Pair<Double, Boolean> p2 = new Pair<>(3.14, true);

    public void showTypes() { 
    System.out.println(first.getClass().getName() + " & " + second.getClass().getName()); 
    } 
    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}