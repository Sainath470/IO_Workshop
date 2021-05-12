import java.util.concurrent.TimeUnit;

public class DelhiAajTak implements Observers{


    @Override
    public void onUpdate(News news) throws InterruptedException {
        long starTime = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - starTime;
        System.out.println("Delhi news: " + news.news+ "\nExecution time in milli seconds: "+totalTime + "\n");
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.DELHI;
    }
}
