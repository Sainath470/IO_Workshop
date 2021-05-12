public class Main {
    public static void main(String[] args) {
        
        DelhiAajTak delhiAajTak = new DelhiAajTak();
        AssamAajTak assamAajTak = new AssamAajTak();
        BizAajTak bizAajTak = new BizAajTak();
        BizAajTak bizAajTak1 = new BizAajTak();

        CentralAajTak centralAajTak = new CentralAajTak();

        News news = new News();
        news.news = "welcome to Assam news";
        news.newsType = NewsType.ASSAM;

        News bizNews = new News();
        bizNews.news = "Welcome to Biz News";
        bizNews.newsType = NewsType.BIZ;

        News delhiNews = new News();
        delhiNews.news = "Welcome to Delhi News";
        delhiNews.newsType = NewsType.DELHI;

        centralAajTak.register(delhiAajTak);
        centralAajTak.register(assamAajTak);
        centralAajTak.register(bizAajTak);
        centralAajTak.unRegister(bizAajTak1);

        centralAajTak.update(news);
        centralAajTak.update(bizNews);
        centralAajTak.update(delhiNews);

    }
}
