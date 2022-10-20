public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void personStart(Transport transport){

        transport.start();
    }
}

