import java.util.concurrent.TimeUnit;

public class BizAajTak implements Observers{


    @Override
    public void onUpdate( News news) throws InterruptedException {
        long starTime = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(3);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - starTime;
        System.out.println("BizAajTak news: "+ news.news + "\nExecution Time in milli seconds: " + totalTime + "\n");
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.BIZ;
    }
}
