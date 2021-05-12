import java.util.concurrent.TimeUnit;

public class AssamAajTak implements Observers{

    @Override
    public void onUpdate(News news) throws InterruptedException {
        long starTime = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(2);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - starTime;
        System.out.println("Assam News : " + news.news + "\nExecution time in milli seconds: " + totalTime + "\n");
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.ASSAM;
    }
}
