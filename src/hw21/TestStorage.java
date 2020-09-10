package hw21;

public class TestStorage {
    public static void main(String[] args) {
        Storage storage = new Storage(100);
        ThreadIn ti1 = new ThreadIn("In-1", storage);
        ThreadIn ti2 = new ThreadIn("In-2", storage);
        ThreadOut to1 = new ThreadOut("Out-1", storage);
        ThreadOut to2 = new ThreadOut("Out-2", storage);

        ti1.start();
        ti2.start();
        to1.start();
        to2.start();
    }
}
