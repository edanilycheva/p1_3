public abstract class Transport {
    private int year;


    public Transport(int year) {
        this.year = year;

    }

    public abstract void start();
    public void stop(){
        System.out.println("Остановка");
    }

}
