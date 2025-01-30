public class MyClass {
    private int x = 0;

    public synchronized void incrementX() {
        x++;
    }

    public int getX(){
        return x;
    }
}