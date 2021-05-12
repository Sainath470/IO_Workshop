import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {

    List<Observers> observerList= new ArrayList<>();

   public void register(Observers observers){
       observerList.add(observers);
   }

   public void unRegister(Observers observers){
       observerList.remove(observers);
   }

    public void update(News news) {
        for (Observers observer : observerList) {
            if(observer.getNewsType() == news.newsType) {
                try {
                    observer.onUpdate(news);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
