public class MultiThreadDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            thread.start();
        }
    }
}
