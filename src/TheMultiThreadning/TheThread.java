package TheMultiThreadning;

public class TheThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }


    }
}
