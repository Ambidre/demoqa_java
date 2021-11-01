public class Banana extends Fruit{

    Banana(String name, String color, String taste){
        super(name, color, taste);
    }

    @Override
    public void prepare() {
        System.out.println("Почистить банан");
    }
}
