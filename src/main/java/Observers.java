 interface Observers {
    void onUpdate(News news) throws InterruptedException;
    NewsType getNewsType();
}
