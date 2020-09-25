public class Bulldog extends Dog{
    private String name = "Dog";

    public Bulldog(String name) {
        this.name = name;
        home();
    }

    public void Dog_in_home(){
        System.out.println(name);
    }

    @Override
    public void home() {
    }
}
