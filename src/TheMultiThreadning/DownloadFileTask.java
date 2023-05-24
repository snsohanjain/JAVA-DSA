package TheMultiThreadning;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading File " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("DownloadedFileTask " + Thread.currentThread().getName());
        }
    }

}
